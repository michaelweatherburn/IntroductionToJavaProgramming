import java.util.Scanner;
public class Question5_1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
		int inputInteger;

		int negativeIntegerCount = 0, positiveIntegerCount = 0, totalCount = 0, sum = 0;
		int iteration = 0;
		do {
			inputInteger = scanner.nextInt();
			if (inputInteger > 0)
			{
				positiveIntegerCount++;
			}
			else if(inputInteger < 0)
			{
				negativeIntegerCount++;
			}
			sum += inputInteger;

			iteration++;
		} while (inputInteger != 0);

		// garden-variety sentinel-controlled loop that must run atleast once, and will not run further in case the input is 0

		totalCount = positiveIntegerCount + negativeIntegerCount;
		double average = (double) sum / (double) totalCount;

		if (iteration == 1)
		{
			System.out.println("No numbers are entered except 0. ");
		}
		else
		{
			System.out.println("The number of positives is " + positiveIntegerCount);
			System.out.println("The number of negatives is " + negativeIntegerCount);

			System.out.println("The total is " + sum);
			System.out.printf("The average is %.2f\n", average);
		}

	}
}