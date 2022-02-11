import java.util.Scanner;
public class Question3_31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = scanner.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		byte conversionChoice = scanner.nextByte();

		if (!(conversionChoice == 0 || conversionChoice == 1)) {
			System.out.println("Incorrect input ");
			System.exit(1);
		}

		System.out.print("Enter the " + (conversionChoice == 0 ? "dollar" : "RMB") + " amount: ");
		double amount = scanner.nextDouble();
		scanner.close();

		double result = 0;
		if (conversionChoice == 0) {
			result = amount * exchangeRate;
			System.out.println("$" + ((int) (amount * 100) / 100.0) + " is " + ((int) (result * 100) / 100.0) + " yuan");
		} else {
			result = amount / exchangeRate;
			System.out.println(((int) (amount * 100) / 100.0) + " yuan is $" + ((int) (result * 100) / 100.0));
		}
	}
}