import java.util.Scanner;
public class GreatestCommonDivisor3
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
				gcd = firstNumber;
			else
				for(int i = 2; i <= firstNumber / 2 || i <= secondNumber / 2; i++)
				{
					if(firstNumber % i == 0 && secondNumber % i == 0)
					{
						gcd = i;
					}
				}

				/* There were two problems in the provided loop. We've to check until the half of the larger of two numbers, so i <= firstNumber / 2 OR i <= secondNumber / 2.

				Also, the corner case when firstNumber = secondNumber = GCD(firstNumber, secondNumber) was not handled in the above loop. So we've to write an if-else to support that corner case */

				System.out.printf("GCD(%d, %d): %d\n", firstNumber, secondNumber, gcd);
			}
			else
			{
				System.out.printf("Invalid input. Both numbers have to be be natural numbers. The program will now exit. ");
			}
		}
	}