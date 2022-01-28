import java.util.Scanner;
public class Question3_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number1 = (int) (Math.random() * 1000);
		int number2 = (int) (Math.random() * 1000);

		System.out.print("What is " + number1 + " times " + number2 + "? ");
		int providedAnswer = scanner.nextInt();
		int actualAnswer = number1 * number2;
		scanner.close();

		if (providedAnswer == actualAnswer) {
			System.out.println("You are correct. ");
		} else {
			System.out.println("You are incorrect. ");
			System.out.println(number1 + " times " + number2 + " should be " + actualAnswer);
		}
	}
}