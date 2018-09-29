public class VariableLengthArgumentLists {
	public static void main(String[] args) {
		method1(3.4, 4.5, 5.6);
		// if you pass independent inputs, they would be converted to an array
		method1(); // it is allowed to pass no arguments, you'll have an empty array
		method1(new double[] {3.4, 4.5, 5.6});
		//and you can also pass an array directly, but you cannot combine those inputs
		method1(new double[] {5.6});

		method2(3.4, 4.5, new double[] {11.2, 11.3});
		method2(11.1, 11.2, 11.3, 11.4, 11.5);
		// the first two arguments are mandatory. You can pass independent inputs or a direct array
		method2(21.2, 21.3, new double[] {21.4, 21.5, 21.6});
	}

	public static void method1(double... variableArgumentList) {
		// Rule: all inputs passed to the method must be either the same as the type of the vararg, or be compatible (read: can be implicit-cast into the vararg's type)
		for (double argument: variableArgumentList)
			System.out.print(argument + " ");
	}

	public static void method2(double first, double second, double... variableArgumentList) {
		// Rule - the vararg must be the last formal parameter in the method definition, and correspondingly, the last actual parameter in the method call
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
		for (double argument: variableArgumentList)
			System.out.print(argument + " ");
	}
}