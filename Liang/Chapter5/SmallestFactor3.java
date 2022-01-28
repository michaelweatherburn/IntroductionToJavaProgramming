import java.util.Scanner;
public class SmallestFactor3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();

		int factor = 2;
		while(factor <= n && n % factor != 0) {
			factor++;
		}

		System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
	}
}