import java.util.Scanner;
public class Question5_30
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Principal: ");
		double principal = scannerObject.nextDouble();
		double amount = principal;	//working copy of the variable pricipal

		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = scannerObject.nextDouble();
		double monthlyInterestRate = annualInterestRate / 12;
		System.out.print("Number of months: ");
		int numberOfMonths = scannerObject.nextInt();

		for (int i = 1; i <= numberOfMonths; i++)
		{
			System.out.println("Month " + i);
			amount *= (1 + monthlyInterestRate / 100);
			System.out.printf("Amount at the end of the month: %.3f\n\n", amount);
			// note: not considering the added amount at the end of each month.
			amount += principal;
		}
	}
}