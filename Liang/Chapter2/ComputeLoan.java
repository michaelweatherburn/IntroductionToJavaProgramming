import java.util.Scanner;

public class ComputeLoan
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		double annualInterestRatePercentage, numberOfYears, loanPrincipal;
		System.out.println("Enter the annual interest rate as percentage. ");
		annualInterestRatePercentage = scannerObject.nextDouble();

		System.out.println("Enter the number of years until which the amount is to be paid. ");
		numberOfYears = scannerObject.nextDouble();

		System.out.println("Enter the principal amount. ");
		loanPrincipal = scannerObject.nextDouble();

		scannerObject.close();

		double annualInterestRate = annualInterestRatePercentage/100.0;
		double monthlyInterestRate = annualInterestRate / 12.0;

		double monthlyPayment = (loanPrincipal * monthlyInterestRate)/(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * 12 * numberOfYears;

		//naturalise the values by removing unnecessary numbers after the decimal point
		monthlyPayment = (int)(monthlyPayment * 100)/100.0;
		totalPayment = (int)(totalPayment * 100)/100.0;

		System.out.println("Total payment to be made: " + totalPayment);
		System.out.println("Monthly payments to be made: " + monthlyPayment);
	}
}
