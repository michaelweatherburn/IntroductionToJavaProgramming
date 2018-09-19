public class CopyArrayElements {
	public static void main(String[] args) {
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		for (int i = 0; i < sourceArray.length; i++) {
			targetArray[i] = sourceArray[i];	// directly copying elements from one array to another - straightforward
		}

		for (int element : targetArray) {
			System.out.print(element + " ");
		}
	}
}