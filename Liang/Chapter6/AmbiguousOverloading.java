public class AmbiguousOverloading {
	public static void main(String[] args)
	{
		System.out.println(max(1, 2));
	}

	public static double max(int firstNumber, double secondNumber) {
		if (firstNumber > secondNumber) 
			return firstNumber;
		else
			return secondNumber;
	}

	public static double max(double firstNumber, int secondNumber) {
		if (firstNumber > secondNumber)
			return firstNumber;
		else
			return secondNumber;
	}
}