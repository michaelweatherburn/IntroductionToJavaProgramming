public class LinearSearch {
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {	// for any element list[i]...
			if (key == list[i])	// if the element matches the key
				return i;	// return the index of the element
		}
		return -1;	// return -1 in case the array had been traversed and the element was not found
	}
}