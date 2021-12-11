import java.util.Scanner;
public class Question2_6a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 1000: ");
		int number = scanner.nextInt();
		scanner.close();

		int product = number == 0 ? 0 : 1;
		int originalInput = number;	// to print the value after the loop executes
		while (number > 0) {
			product *= number % 10;
			number /= 10;
		}

		System.out.println("The multiplication of all digits in " + originalInput + " is " + product);
	}
}