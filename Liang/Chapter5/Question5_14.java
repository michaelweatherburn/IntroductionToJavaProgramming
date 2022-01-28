import java.util.Scanner;
public class Question5_14
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the two numbers whose GCD is to be calculated. ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();

		int minimum = Math.min(firstNumber, secondNumber);
		int gcd = 1;
		while (minimum >= 1)
		{
			if (firstNumber % minimum == 0 && secondNumber % minimum == 0)
			{
				gcd = minimum;
				break;
			}
			minimum--;
		}

		System.out.println("GCD of " + firstNumber + ", " + secondNumber + ": " + gcd);
	}
}