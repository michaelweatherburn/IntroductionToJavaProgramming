import java.util.Scanner;
public class Question3_2 {
	public static void main(String[] args) {
		int firstNumber = (int) (System.currentTimeMillis() % 10);
		int secondNumber = (int) (System.currentTimeMillis() / 10 % 10);
		int thirdNumber = (int) (System.currentTimeMillis() / 100 % 10);

		Scanner scanner = new Scanner(System.in);

		System.out.print("What is " + firstNumber + " times " + secondNumber + " times " + thirdNumber + "? ");
		int providedResponse = scanner.nextInt();
		scanner.close();
		
		int answer = firstNumber * secondNumber * thirdNumber;
		System.out.println(firstNumber + " x " + secondNumber + " x " + thirdNumber + " = " + providedResponse + " is "  + (answer == providedResponse));
	}
}