import java.util.Scanner;
public class Question6_6 {

	public static int findNumberOfDigits(int inputNumber) {
		//this is certinly overkill, but this sets the correct number of digits that each number must occupy, according to the number of digits of n
		int numberOfDigits = 0;
		while (inputNumber > 0) {
			inputNumber /= 10;
			numberOfDigits++;
		}
		return numberOfDigits;
	}

	public static void displayPattern(int n) {
		int numberOfDigits = findNumberOfDigits(n);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.printf("%" + (numberOfDigits + 1) + "s", "");
				}
				else {
					System.out.printf("% " + (numberOfDigits + 1) + "d", n - j + 1);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows to be shown in the pattern. ");
		int numberOfRows = scanner.nextInt();
		displayPattern(numberOfRows);
	}
}