import java.util.Scanner;
public class Question5_37
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String binaryEquivalent = "";

		// to enforce proper constraints, we need to start using loops to obtain user input
		System.out.print("Enter the decimal number. (>= 1) ");
		int decimalNumber = scanner.nextInt();
		while (decimalNumber < 1)
		{
			System.out.print("Invalid input. Retry: ");
			decimalNumber = scanner.nextInt();
		}

		while (decimalNumber >= 1)
		{
			binaryEquivalent = (decimalNumber % 2) + binaryEquivalent;
			decimalNumber /= 2;
		}

		System.out.println("Binary equivalent: " + binaryEquivalent);
	}
}