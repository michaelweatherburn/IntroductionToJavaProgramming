import java.util.Scanner;
public class Question5_19
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows in the pyramid to form. ");
		int input = scanner.nextInt();

		/* optimised solution: along the lines of Question5_17a. */

		int numberToPrint;
		for (int i = 1; i <= input; i++)
		{
			numberToPrint = 1;
			for (int j = 1; j <= input + i - 1; j++)
			{
				if (j < input - i + 1)
					System.out.printf("%4s", "");
				else
				{
					System.out.printf("%4s", numberToPrint);
					if (j < input)
						numberToPrint *= 2;
					else
						numberToPrint /= 2;
					}
			}
			System.out.println();
		}		
	}
}