public class CheckPoint7_14 {
	public static void main(String[] args) {
		int[] myList;
		myList = new int[10];
		/* All right, let's test this 
			Theory: the array would not be resized because
			1) Once the array is created it cannot be resized
			2) Whenever you use the new keyword to create an array, a new array is created in the heap, and the reference to the new array is returned

			Which means, the older array would lose its only reference and would no longer be accessible. This means it would be garbage collectible by JVM.
			
			The newer array would now be accessible using the myList reference variable, but as expected of new arrays, all of its elements would now have the value 0.
		*/

		System.out.println("Instantiating array with random values: ");
		for (int i = 0; i < myList.length; i++) {
		myList[i] = (int) (Math.random() * 100);	//fill it with random two-digit values
		System.out.print(myList[i] + " ");
		}
		System.out.println("\nAssigning new reference to array.");

		myList = new int[20];
		System.out.println("Reading new values within array: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}
}