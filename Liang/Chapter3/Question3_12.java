import java.util.Scanner;
public class Question3_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int input = scanner.nextInt();
		scanner.close();

		int number = Math.abs(input);	// consider negative integers

		int unitsDigit = number % 10;
		int tensDigit = number / 10 % 10;
		int hundredsDigit = number / 100 % 10;

		if ((hundredsDigit == 0 && tensDigit == 0) ||	// if the input is a single-digit number
				(hundredsDigit == 0 && (unitsDigit == tensDigit)) || // or two-digit number with both digits matching
				(hundredsDigit == unitsDigit)) {	// or three-digit number where hundred's place matches unit's place
			System.out.println(input + " is a palindrome. ");
		} else {
			System.out.println(input + " is not a palindrome. ");
		}
	}
}