import java.util.Scanner;
public class Question5_31a
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double principal = scannerObject.nextDouble();
		double amount = principal;

		System.out.print("Enter annual percentage yield: ");
		double annualPercentageYield = scannerObject.nextDouble();
		double monthlyPercentageYield = annualPercentageYield / 12;

		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonths = scannerObject.nextInt();

		System.out.printf("\n%-10s%-10s\n", "Month", "CD Value");
		for (int i = 1; i < numberOfMonths; i++)
		{
			// using the direct formula for compound amount
			amount = principal * Math.pow(1 + monthlyPercentageYield / 100, i);
			System.out.printf("%-10d%10.2f\n", i, amount);

		}
	}
}