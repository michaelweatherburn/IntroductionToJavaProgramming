import java.util.Scanner;

public class Question2_20
{
	public static void main(String[] main)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter balance and interest rate: (e.g. 3 for 3%): ");
		double balance = scanner.nextDouble();
		double interestRatePercentage = scanner.nextDouble();
		scanner.close();

		double interest = balance * (interestRatePercentage/1200.0);

		System.out.println("The interest is " + interest);
	}
}
