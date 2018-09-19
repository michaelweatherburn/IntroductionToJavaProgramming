public class UsingArraycopyMethod {
	public static void main(String[] args) {
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];		
		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);

		for (int element: targetArray) {
			System.out.print(element + " ");
		}
	}
}