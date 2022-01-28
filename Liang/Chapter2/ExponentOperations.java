import java.util.Scanner;

public class ExponentOperations{
	public static void main(String[] args)
	{
		//create a Scanner object
		Scanner scanner = new Scanner(System.in);

		//ask for user input
		System.out.println("Enter the number. ");
		double base = scanner.nextDouble();

		System.out.println("Enter the exponent you want to raise the number to. ");
		double exponent = scanner.nextDouble();

		scanner.close();

		System.out.println("Answer: " + Math.pow(base, exponent));
	}
}
