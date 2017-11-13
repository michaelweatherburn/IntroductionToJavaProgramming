import java.util.Scanner;
public class Question5_18c
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number of rows in the pattern. ");
		int input = scannerObject.nextInt();

		for (int i = 1; i <= input; i++)
		{
			for (int j = input; j >= 1; j--)
			{
				if (j <= i)
					System.out.print(j + " ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}