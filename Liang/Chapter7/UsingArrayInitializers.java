public class UsingArrayInitializers {
	public static void main(String[] args) {
		int[] values = {1, 2, 3, 4, 5};
		// this is called an array initializer. It is used to create a reference variable and provide an array reference directly to that variable.

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		int[] otherValues;
		otherValues = {6, 7, 8, 9, 10};
		// causes a compile time error - illegal start of expression. An array initializer CAN ONLY BE USED if the array reference variable needs to be declared and initialized in the same statement.
	}
}