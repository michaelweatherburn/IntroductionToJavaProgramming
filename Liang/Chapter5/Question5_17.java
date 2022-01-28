import java.util.Scanner;
public class Question5_17
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer from 1 to 15: ");
		int input = scanner.nextInt();

		/* no-brainer solution: re-use variables as less as possible, break up the input into right-angled triangle and find the relation between each row's number and the output to be printed for that row 

		Update: added the use of printf, which leaves specific number of characters alloted per number, so that the triangle is symmmetric 
		*/

		if (input >= 1 && input <= 15)
		{
			for (int i = 1; i <= input; i++)
			{
				for (int j = 1; j <= input - i; j++)
					System.out.print("   ");	// the triangle of blanks before...

				int k;
				for (k = i; k > 1; k--)
				{
					System.out.printf("%3s", k);
				}

				for (; k <= i; k++)
				{
					System.out.printf("%3s", k);
				}

				System.out.println();	// proceed to the next line
			}
		}
		else
		{
			System.out.println("Input not within expected range. The program will now exit. ");
		}
	}
}