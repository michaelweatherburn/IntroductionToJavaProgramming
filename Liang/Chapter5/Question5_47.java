import java.util.Scanner;
public class Question5_47
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String firstTwelveDigits = scanner.next();
		int series = 0;
		boolean isValidInput = true;
		int inputLength = firstTwelveDigits.length();
		if (inputLength != 12)
			isValidInput = false;
		for (int i = 0; i <= inputLength - 1; i++)
			{
				if (!Character.isDigit(firstTwelveDigits.charAt(i)))
				{
					isValidInput = false;
					break;
				}
			}

		if (isValidInput)
		{
			for (int i = 0; i <= inputLength - 1; i++)
				series += ((firstTwelveDigits.charAt(i) - '0') * ( ((i + 1) % 2 == 0) ? 3 : 1));
			int thirteenthDigit = 10 - (series % 10);
			if (thirteenthDigit == 10)
				thirteenthDigit = 0;
			String isbn13 = firstTwelveDigits + thirteenthDigit;
			System.out.println("The ISBN-13 number is " + isbn13);
		}
		else 
		{
			System.out.println(firstTwelveDigits + " is an invalid input ");
		}
	}
}