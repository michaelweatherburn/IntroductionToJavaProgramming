import java.util.Scanner;
public class GreatestCommonDivisorMethod2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first integer. ");
		int n1 = scanner.nextInt();
		System.out.print("Enter the second integer. ");
		int n2 = scanner.nextInt();

		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}

	public static int gcd(int n1, int n2)
	{
		int dividend = 0;
		int divisor = n1 > n2 ? n1 : n2;
		int remainder = n1 > n2 ? n2 : n1;

		while (remainder > 0)
		{
			dividend = divisor;
			divisor = remainder;
			remainder = dividend % divisor;
		}

		return divisor;
	}
}