public class ForeachLoop {
	public static void main(String[] args) {
		double[] list = {1, 2, 3, 4, 5};
		// using an array initializer to initialize the array

		for (double listElement : list) {
			System.out.print(listElement + " ");
		}

		/*
			Important: foreach loop merely copies over the value of the element present in the array to the "listElement" element. Modifying the listElement will not change the value inside the array, since we're modifying only a copy of the array element in the current iteration, which would be overwritten by the next array element's value in the next iteration.

			For display purposes, foreach loop is convenient.
		*/
	}
}