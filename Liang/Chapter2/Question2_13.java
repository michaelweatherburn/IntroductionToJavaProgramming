import java.util.Scanner;
public class Question2_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount. ");
		double monthlySavingAmount = scanner.nextDouble();

		System.out.print("Enter the annual interest rate in percentage. ");
		double annualInterestRatePercentage = scanner.nextDouble();

		scanner.close();
		double monthlyInterestRate = annualInterestRatePercentage / 1200;

		/*
			If the monthly saving amount is x
			and the monthly interest rate is y

			The value after nth month is given by:
			x * (1 + y) * (Math.pow(1 + y, n) - 1) / y

			(Derive this by using geometric progression)
		*/

		// first month
			double amountAfterFirstMonth = monthlySavingAmount * (1 + monthlyInterestRate) * (Math.pow (1 + monthlyInterestRate, 1) - 1) / monthlyInterestRate;
			double amountAfterSecondMonth = monthlySavingAmount * (1 + monthlyInterestRate) * (Math.pow (1 + monthlyInterestRate, 2) - 1) / monthlyInterestRate;
			double amountAfterThirdMonth = monthlySavingAmount * (1 + monthlyInterestRate) * (Math.pow (1 + monthlyInterestRate, 3) - 1) / monthlyInterestRate;
			double amountAfterSixthMonth = monthlySavingAmount * (1 + monthlyInterestRate) * (Math.pow (1 + monthlyInterestRate, 6) - 1) / monthlyInterestRate;

			System.out.println("After the first month, the account value is " + amountAfterFirstMonth);
			System.out.println("After the second month, the account value is " + amountAfterSecondMonth);
			System.out.println("After the third month, the account value is " + amountAfterThirdMonth);
			System.out.println("After the sixth month, the account value is " + amountAfterSixthMonth);
		}
	}