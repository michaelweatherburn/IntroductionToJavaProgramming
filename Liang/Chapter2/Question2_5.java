import java.util.Scanner;

public class Question2_5
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = scanner.nextDouble();
		double gratuityRatePercentage = scanner.nextDouble();
		scanner.close();
		double gratuityRate = gratuityRatePercentage / 100.0;

		double gratuity = subtotal * gratuityRate;
		double total = subtotal + gratuity;

		gratuity = (int)(gratuity * 100.0)/100.0;
		total = (int)(total * 100.0)/100.0;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}
