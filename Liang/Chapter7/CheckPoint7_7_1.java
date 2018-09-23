public class CheckPoint7_7_1 {
	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};
		for (int i = 0, j = list.length - 1; i <= list.length / 2; i++, j--) {
			int temp = list[i];
			list[i] = list[j];
			list[j] = temp;
		}

		for (int element: list) {
			System.out.print(element + " ");
		}

		/*
			The problem here was that if you swap the elements symmetrically about the center, but then traverse the entire array, you're swapping each element twice, which would result in the original array. You have to swap until half the length of the array is reached

			for even-length arrays, the index of the element until which you've to swap is list.length / 2 - 1
			for odd-length arrays, the index of the element until which you've to swap is list.length / 2 (integer division)
	
			i <= list.length / 2 should cover the even-length arrays as well, because if an element is swapped with itself there is no issue
		*/
	}
}