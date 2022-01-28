import java.util.Scanner;
public class SalesTax
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the purchase amount. ");
		double purchaseAmount = scanner.nextDouble();

		scanner.close();

double tax = purchaseAmount * 0.06;

		tax = (int)(tax * 100)/100.0;
		/* order of precedence:
		parantheses come first, hence purchaseAmount * 100 is executed first
		(destinationtype) comes second, since it is treated as a unary operator
		/(division) comes last, since it is a binary (arithmetic) operator

		*/

		System.out.println("Sales Tax is: " + tax);

	}
}
