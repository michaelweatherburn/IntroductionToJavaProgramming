import java.util.Scanner;

public class Question2_22
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//enter the input as an integer with last two digits as cents

		int formattedInput, numberOfOneDollars, numberOfDimes, numberOfNickels, numberOfQuarters, numberOfPennies;

		System.out.print("Enter the currency without decimal points, where the last two digits will signify cents. ");
		formattedInput = scanner.nextInt();
		scanner.close();

		numberOfOneDollars = formattedInput / 100;   //integer division, so no issues
		formattedInput %= 100;  //reduce formattedInput to its remainder (strip all the dollars)

		numberOfQuarters = formattedInput / 25;
		formattedInput %= 25;

		numberOfDimes = formattedInput / 10;
		formattedInput %= 10;

		numberOfNickels = formattedInput / 5;
		formattedInput %= 5;

		numberOfPennies = formattedInput;

		System.out.println("Your amount: ");
		System.out.println("Dollars: " + numberOfOneDollars);
		System.out.println("Quarters: " + numberOfQuarters);
		System.out.println("Dimes: " + numberOfDimes);
		System.out.println("Nickels: " + numberOfNickels);
		System.out.println("Pennies: " + numberOfPennies);
	}
}
