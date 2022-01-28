import java.util.Scanner;
public class Question5_22
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double principal = scanner.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = scanner.nextInt();
		int numberOfMonths = numberOfYears * 12;
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = scanner.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;

		double monthlyPayment = (principal * monthlyInterestRate / 100) / (1 - (1 / Math.pow(1 + monthlyInterestRate / 100, numberOfMonths)));
		double totalPayment = monthlyPayment * numberOfMonths;
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", totalPayment);

		double balance = principal;
		double monthlyInterest;
		double monthlyPrincipal;

		System.out.printf("%-12s%-12s%-12s%-12s\n", "Payment#", "Interest", "Principal", "Balance");
		for (int i = 1; i <= numberOfMonths; i++)
		{
			monthlyInterest = balance * monthlyInterestRate / 100;
			monthlyPrincipal = monthlyPayment - monthlyInterest;
			balance -= monthlyPrincipal;
			System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", i, monthlyInterest, monthlyPrincipal, balance);
		}
	}
}