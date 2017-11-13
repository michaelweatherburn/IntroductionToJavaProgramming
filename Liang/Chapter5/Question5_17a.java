import java.util.Scanner;
public class Question5_17a
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter an integer from 1 to 15: ");
		int input = scannerObject.nextInt();

		if (input >= 1 && input <= 15)
		{
			/*  optimized solution: try and minimise the number of loops written inside the the outer for loop */
				for (int i = 1; i <= input; i++)
				{
				int j = 1;
				int valueToPrint = input;
				while (j <= input + i - 1)
				{
					if (valueToPrint <= i)
						System.out.printf("%3s", valueToPrint);
					else
						System.out.printf("   ");

					if (j < input)
						valueToPrint--;
					else
						valueToPrint++;

					j++;
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Input not within expected range. The program will now exit. ");
		}
		
	}
}