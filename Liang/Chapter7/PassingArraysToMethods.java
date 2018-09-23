public class PassingArraysToMethods {

	public static void printArray(int[] inputArray) {
		for (int element: inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		printArray(array);
		/*
			A copy of the reference present in array is made, which is then held by inputArray. Basically, array and inputArray are both references to the same array inside the heap. If printArray were to change something inside the array within the heap, the change would be reflected outside the printArray method as well. This can be thought of as pass-by-sharing, since both array reference variables are merely sharing the same memory entity within the heap.
		*/
	}
}