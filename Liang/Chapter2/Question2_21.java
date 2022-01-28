import java.util.Scanner;

public class Question2_21
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double futureInvestmentValue, investmentAmount, monthlyInterestRate, annualInterestRatePercentage, numberOfYears;

		System.out.print("Enter investment amount: ");
		investmentAmount = scanner.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		annualInterestRatePercentage = scanner.nextDouble();

		System.out.print("Enter number of years: ");
		numberOfYears = scanner.nextDouble();

		scanner.close();

		monthlyInterestRate = annualInterestRatePercentage / 1200.0;
		futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12.0);

		/* since futureInvestmentValue is currency (as opposed to some quantity that has no limit on possible precision), we need to reduce digits */
		futureInvestmentValue = (int)(futureInvestmentValue * 100)/100.0;


		System.out.println("Accumulated value: $" + futureInvestmentValue);

	}
}
