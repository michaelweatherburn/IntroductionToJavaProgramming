import java.util.Scanner;
public class Question5_30a
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Principal: ");
		double principal = scanner.nextDouble();
		double amount = principal; 	// working copy of the current principal. This updates on every iteration of the loop

		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = scanner.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;

		System.out.print("Number of months: ");
		int numberOfMonths = scanner.nextInt();

		for (int i = 1; i <= numberOfMonths; i++)
		{
			System.out.println("Month " + i);
			// using the dervied formula to calculate the result
			amount = principal * (1 + (1 / (monthlyInterestRate / 100))) * (Math.pow(1 + monthlyInterestRate / 100, i) - 1);
			System.out.printf("Amount at the end of the month: %.3f\n\n", amount);
			// note: not considering the added amount at the end of each month.
		}
	}
}