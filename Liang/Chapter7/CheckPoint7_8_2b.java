public class CheckPoint7_8_2b {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		reverse(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			newList[i] = list[list.length - 1 - i];
		}

		list = newList;
	}

	/*

		Important Conceptual Question

		list_main - array reference variable present in main method 
		list_reverse - array reference variable present in reverse method

		When reverse method is called, the reference of the array {1, 2, 3, 4, 5} is copied over from list_main to list_reverse. Then a new array {0, 0, 0, 0, 0} is allocated separate memory for within the heap, and its reference is held by newList.

		After the loop, the new array referenced to by newList is {5, 4, 3, 2, 1}, while list_reverse and list_main are still pointing to the old array {1, 2, 3, 4, 5}.

		list = newList;

		list_reverse and newList now both point to {5, 4, 3, 2, 1} while list_main points to {1, 2, 3, 4, 5}. 
		As the reverse method finishes executing, both list_reverse and newList are gone (since the activation record of the reverse method, which contained those methods, was popped off the stack). This means that no reference now points to {5, 4, 3, 2, 1}. It is now eligible to the garbage-collected by JVM.

		Iterating over list_main is the same as accessing the old array {1, 2, 3, 4, 5}

		Output:
		1 2 3 4 5
		

	*/
}