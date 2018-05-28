import java.util.Scanner;
public class Question5_48
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		for (int i = 0, length = inputString.length(); i <= length - 1; i++)
			if ((i + 1) % 2 == 1)	// or simply i % 2 == 0, display the characters at 0-indexed even positions since they're the same as the characters within 1-indexed odd positions
				System.out.print(inputString.charAt(i));
	}
}