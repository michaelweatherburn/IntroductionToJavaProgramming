import java.util.Scanner;
public class Question6_7 {
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return (investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double investmentAmount = scanner.nextDouble();
		System.out.println("Annual interest rate: ");
		double annualInterestRatePercentage = scanner.nextDouble();
		double annualInterestRate = annualInterestRatePercentage / 100.0;
		double monthlyInterestRate = annualInterestRate / 12.0;

		System.out.printf("%-20s%-20s\n", "Years", "Future Value");
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%-20d%-20.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
		}
		//I've simply used the print-formatted to print the rounded value instead of going through the trouble of multiplying and dividing 100, since this is cleaner
	}
}