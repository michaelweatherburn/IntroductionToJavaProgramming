public class TestMethodOverloading
{
	public static void main(String[] args)
	{
		System.out.println("The maximum of 3 and 4 is " + max(3, 4));
		System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
		System.out.println("The maximum of 3.0, 5.4 and 10.14 is " + max(3.0, 5.4, 10.14));
	}

	public static int max(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber)
			return firstNumber;
		else
			return secondNumber;
	}

	public static double max(double firstNumber, double secondNumber) {
		if (firstNumber > secondNumber)
			return firstNumber;
		else
			return secondNumber;
	}

	public static double max(double firstNumber, double secondNumber, double thirdNumber) {
		return max(max(firstNumber, secondNumber), thirdNumber);
	}

	/* Method Overloading - The practice in which we provide the same name for different methods, that have different definitions and unique signatures

	method signature = methodName + list-of-parameters
	list-of-parameters refers to the number, order, and datatype of parameters
	to create a unique list-of-parameters, change the order/number/datatype of one or more parameters
	*/
}