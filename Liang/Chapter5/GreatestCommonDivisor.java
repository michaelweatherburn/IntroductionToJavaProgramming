import java.util.Scanner;
public class GreatestCommonDivisor
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.printf("Enter the first number. ");
		int firstNumber = scannerObject.nextInt();

		System.out.printf("Enter the second number. ");
		int secondNumber = scannerObject.nextInt();

		int divisor, dividend, remainder = -1;

		if(firstNumber >= 1 && secondNumber >= 1)
		{
			if(firstNumber > secondNumber)
			{
				divisor = secondNumber;
				dividend = firstNumber;
			}
			else
			{
				divisor = firstNumber;
				dividend = secondNumber;
			}

			while(dividend % divisor != 0)
			{
				remainder = dividend % divisor;
				dividend = divisor;
				divisor = remainder;
			}

			System.out.printf("GCD(%d, %d): %d\n", firstNumber, secondNumber, divisor);
		}
		else
		{
			System.out.printf("Invalid input. Both numbers entered must be natural numbers. The program will now exit.\n");
		}
	}
}