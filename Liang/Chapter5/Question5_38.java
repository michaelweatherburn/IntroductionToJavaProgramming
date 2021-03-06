import java.util.Scanner;
public class Question5_38
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String octalEquivalent = "";

		System.out.print("Enter the decimal number. (>= 1) ");
		int decimalNumber = scanner.nextInt();
		while (decimalNumber < 1)
		{
			System.out.print("Invalid input. Retry: ");
			decimalNumber = scanner.nextInt();
		}

		while (decimalNumber >= 1)
		{
			octalEquivalent = (decimalNumber % 8) + octalEquivalent;
			decimalNumber /= 8;
		}

		System.out.print("Octal Equivalent: " + octalEquivalent);
	}
}