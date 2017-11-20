import java.util.Scanner;
public class Question5_21
{
	final static double DOUBLE_EPSILON = 1E-17;
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double principal = scannerObject.nextDouble();
		System.out.print("Number of Years: ");
		double numberOfYears = scannerObject.nextDouble();
		double numberOfMonths = numberOfYears * 12;

		double annualRateOfInterest;
		double monthlyRateOfInterest;
		double monthlyPayment;
		double totalPayment;
		System.out.printf("%-20s%-20s%-20s\n\n", "Interest Rate", "Monthly Payment", "Total Payment");
		for (double i = 5.000; Math.abs(8.000 - i) < DOUBLE_EPSILON || i < 8.000; i += 0.125)
		{
			//calculate annuity
			annualRateOfInterest = i;
			monthlyRateOfInterest = annualRateOfInterest / 12;
			monthlyPayment = (principal * monthlyRateOfInterest / 100) / ( 1 - (1 / Math.pow(1 + monthlyRateOfInterest / 100, numberOfMonths)));
			totalPayment = monthlyPayment * numberOfMonths;

			//print the result
			System.out.printf("%-5.3f%%%14s%-6.2f%14s%-8.2f%12s\n", annualRateOfInterest, "", monthlyPayment, "", totalPayment, "");
		}
	}
}