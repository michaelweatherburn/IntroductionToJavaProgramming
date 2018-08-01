import java.util.Scanner;
public class Question6_18 {

	public static boolean isPasswordNonNull(String inputPassword) {
		return inputPassword != null;
	}

	public static boolean doesPasswordContainAtLeast8Characters(String inputPassword) {
		return (inputPassword.length() >= 8);
	}

	public static boolean isPasswordAlphanumeric(String inputPassword) {
		for (int i = 0, passwordLength = inputPassword.length(); i < passwordLength; i++) {
			if (!(Character.isLetterOrDigit(inputPassword.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static boolean doesPasswordContainAtLeast2Digits (String inputPassword) {
		int numberOfDigits = 0;
		for (int i = 0, passwordLength = inputPassword.length(); i < passwordLength; i++) {
			if (Character.isDigit(inputPassword.charAt(i))) {
				numberOfDigits++;
			}
		}
		return (numberOfDigits >= 2);
	}

	public static boolean isPasswordValid(String inputPassword) {
		return (isPasswordNonNull(inputPassword) && doesPasswordContainAtLeast8Characters(inputPassword) && isPasswordAlphanumeric(inputPassword) && doesPasswordContainAtLeast2Digits(inputPassword));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Password: ");
		String enteredPassword = scanner.nextLine();
		System.out.println((isPasswordValid(enteredPassword) ? "Valid" : "Invalid") + " Password");
	}
}