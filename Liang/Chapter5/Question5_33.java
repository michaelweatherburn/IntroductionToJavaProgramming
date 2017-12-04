import java.util.Scanner;

public class Question5_33
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		// perfect number: a number that is divisible by the sum of all of its divisors except itself (1 is considered as a divisor)

		for (int i = 2; i <= 10000; i++)
		{
			int sum = 1;	// any number between 2 and 10,000 will always be divisible by 1
			for (int j = 2; j <= i / 2; j++)
			{
				if (i % j == 0)
					sum += j;
			}

			if (sum == i)
				System.out.println(i);
		}

	}
}