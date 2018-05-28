import java.util.Scanner;
public class Question5_44a
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer. ");
		int input = scanner.nextInt();

		String output = "";
		for (int i = 1; i <= 16; i++)
		{
			output = (input & 1) + output;
			input = input >> 1;
		}

		System.out.println("The bits are " + output);
	}
}