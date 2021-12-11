import java.util.Scanner;
public class Question2_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = scanner.nextInt();
		scanner.close();

		int unitDigit = number % 10;
		int tensDigit = number / 10 % 10;
		int hundredsDigit = number / 100 % 10;
		int product;

		if (hundredsDigit == 0) {
			// possibly a one/two digit number
			if (tensDigit == 0) {
				// possibly a one digit number
				if (unitDigit == 0) {
					// the number is 0
					product = 0;
				} else {
					// one digit number
					product = unitDigit;
				}
			} else {
				// two digit number
				product = tensDigit * unitDigit;	
			}
		} else {
			// three digit number
			product = hundredsDigit * tensDigit * unitDigit;
		}

		System.out.println("The multiplication of all digits in " + number + " is " + product);
	}
}