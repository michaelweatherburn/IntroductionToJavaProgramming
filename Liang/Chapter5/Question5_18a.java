import java.util.Scanner;
public class Question5_18a
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows in the pattern. ");
		int input = scanner.nextInt();

		for (int i = 1; i <= input; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}