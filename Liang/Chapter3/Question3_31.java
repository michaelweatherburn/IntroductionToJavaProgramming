import java.util.Scanner;

public class Question3_31
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double amount = 0, result = 0;

		System.out.print("Enter the exchange rate from USD to RMB: ");
		double exchangeRateUSDRMB = scanner.nextDouble();

		System.out.print("Enter 0 to convert USD -> RMB, or 1 to convert RMB -> USD. ");
		byte choice = scanner.nextByte();

		if(choice == 0)
		{
			System.out.print("Enter amount in USD. ");
			amount = scanner.nextDouble();

			result = amount * exchangeRateUSDRMB;

		}
		else if(choice == 1)
		{
			System.out.print("Enter amount in RMB. ");
			amount = scanner.nextDouble();

			result = amount / exchangeRateUSDRMB;
		}
		else
		{
			System.out.print("Invalid option. The program will now exit. ");
			System.exit(1);
		}
		scanner.close();

		//set amount and result to contain ONLY two digits after the decimal point, since they're currencies
		amount = (int)(amount * 100)/100.0;
		result = (int)(result * 100)/100.0;

		System.out.print((choice == 0 ? "$" + amount : amount + " Yuan") + " is " + (choice == 0 ? result + " Yuan" : "$" + result));
		//looks like a wierdo, but is actually a neat hack that is best for quickly solving problems at the expense of messed up code that is literally begging for bugs
	}
}
