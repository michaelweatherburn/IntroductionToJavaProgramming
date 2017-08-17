import java.util.Scanner;
public class GreatestCommonDivisor4
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.printf("Enter the first number. ");
		int firstNumber = scannerObject.nextInt();

		System.out.printf("Enter the second number. ");
		int secondNumber = scannerObject.nextInt();

		int divisor, dividend, remainder = -1;
		int gcd = 1;
		if(firstNumber >= 1 && secondNumber >= 1)
		{
			if(firstNumber == secondNumber)
			{
				gcd = firstNumber;
			}
			else
				for(int k = (firstNumber > secondNumber ? firstNumber / 2 : secondNumber / 2); k >= 2; k--)
				{
					if(firstNumber % k == 0 && secondNumber % k == 0)
					{
						gcd = k;
						break;
					}
				}

			System.out.printf("GCD(%d, %d): %d\n", firstNumber, secondNumber, gcd);
		}
		else
		{
			System.out.printf("Invalid input. Both numbers have to be natural numbers. The program will now exit.\n");
		}
	}
}