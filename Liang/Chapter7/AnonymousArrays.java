public class AnonymousArrays {
	public static void main(String[] args) {
		// array reference variable declaration
		int[] firstArrayRefVar;

		// array reference variable assignment
		firstArrayRefVar = new int[3];

		// array initialization
		firstArrayRefVar[0] = 7;
		firstArrayRefVar[1] = 8;
		firstArrayRefVar[2] = 9;

		// array reference variable creation-assignment using array initializer
		int[] secondArrayRefVar = {1, 2, 3};
		// Note that the array initializer syntax assumes the length of the array from the number of elements that are present inside the set

		int[] thirdArrayRefVar = new int[] {4, 5, 6};
		// Capturing an "anonymous array"s reference in a reference variable


		printArray(firstArrayRefVar);
		printArray(secondArrayRefVar);
		printArray(thirdArrayRefVar);
		printArray(new int[] {12, 13, 14});
	}

	public static void printArray(int[] inputArray) {
		for (int element: inputArray) {
			System.out.print(element + " ");
		}
		System.out.println();
		return;
	}	
}