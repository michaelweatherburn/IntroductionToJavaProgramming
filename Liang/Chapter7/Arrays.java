public class Arrays {
	public static void main(String[] args) {

		int value;
		// declaration of primitive integer variable. This allocates memory for a primitive variable inside the construct (class/method) where it is declared

		value = 5;
		// initialization using a literal value

		int[] listOfValues;
		//declaration of an array reference variable (a reference variable that refers to an array, in this case, of integer type). This allocates memory for a reference variable listOfValues inside the construct (class/method) where it is declared

		listOfValues = new int[5];
		// initialization using the new keyword. Here, the new keyword creates an array that contains five integers, and returns the reference of the newly created array. This new reference is now assigned to the reference variable listOfValues

		for (int i = 0; i < listOfValues.length; i++) {
			System.out.println(listOfValues[i]);	// returns 0 for each element
		}

		// Whenever an array/object is created, its elements/data members have the default values specified for data entities created using the new keyword (0 for byte, short, int, long, float, double; '\u0000' for char; false for boolean, null for reference variables)

		System.out.println(listOfValues[-1]);
		System.out.println(listOfValues[5]);
		// Results in a runtime error - ArrayIndexOutOfBoundsException. Only values within {0, 1... arrayReferenceVariable.length - 1} are allowed. A similar error is StringIndexOutOfBoundsException, encountered when using the charAt method on a string object and providing an out-of-bounds index. This stems from the fact that the class String is a wrapper over a character array. 
	}
}