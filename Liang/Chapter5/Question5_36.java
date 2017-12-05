import java.util.Scanner;
public class Question5_36
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int sum = 0;
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int userInput = scannerObject.nextInt();
		String firstNineDigits = "";
		String tenthDigit = "";

		for (int i = 9; i >= 1; i--)
		{
			sum += ((userInput % 10) * i);
			firstNineDigits = (userInput % 10) + firstNineDigits;
			userInput /= 10;
		}

		sum %= 11;
		tenthDigit = (sum < 10 ? sum + "" : "X");
		System.out.print("The ISBN-10 number is " + firstNineDigits + tenthDigit);
	}
}