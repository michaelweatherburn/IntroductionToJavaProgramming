import java.util.Scanner;
public class ComputeChange
{
	public static void main(String[] args)
	{

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the amount in dollars and cents. ");
		double amount = scannerObject.nextDouble();

		scannerObject.close();

		int numberOfCents = (int)(amount * 100.0);
		int numberOfDollars = numberOfCents / 100;
		numberOfCents = numberOfCents % 100;

		int numberOfQuarters = numberOfCents / 25;
		numberOfCents = numberOfCents % 25;

		int numberOfDimes = numberOfCents / 10;
		numberOfCents = numberOfCents % 10;

		int numberOfNickels = numberOfCents / 5;
		numberOfCents = numberOfCents % 5;

		int numberOfPennies = numberOfCents;

		System.out.println("The money is as follows: ");
		System.out.println("Dollars: " + numberOfDollars);
		System.out.println("Quarters: " + numberOfQuarters);
		System.out.println("Dimes: " + numberOfDimes);
		System.out.println("Nickels: " + numberOfNickels);
		System.out.println("Pennies: " + numberOfPennies);

	}
}
