import java.util.Scanner;
public class Question3_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your lottery pick (three digits). ");
		int userInput = scanner.nextInt();
		scanner.close();

		int userInputUnitDigit = userInput % 10;
		int userInputTensDigit = (userInput / 10) % 10;
		int userInputHundredsDigit = (userInput / 100) % 10;

		int lotteryNumber = (int) (Math.random() * 1000);
		System.out.println("The lottery number is " + lotteryNumber);

		int lotteryNumberUnitDigit = lotteryNumber % 10;
		int lotteryNumberTensDigit = (lotteryNumber / 10) % 10;
		int lotteryNumberHundredsDigit = (lotteryNumber / 100) % 10;

		if (userInput == lotteryNumber) {
			System.out.println("Exact Match: You win 15000 USD. ");
		} else if (
			(userInputUnitDigit == lotteryNumberUnitDigit ^
			userInputUnitDigit == lotteryNumberTensDigit ^
			userInputUnitDigit == lotteryNumberHundredsDigit) &&
			(userInputTensDigit == lotteryNumberUnitDigit ^
			userInputTensDigit == lotteryNumberTensDigit ^
			userInputTensDigit == lotteryNumberHundredsDigit) &&
			(userInputHundredsDigit == lotteryNumberUnitDigit ^ 
			userInputHundredsDigit == lotteryNumberTensDigit ^
			userInputHundredsDigit == lotteryNumberHundredsDigit)
			) {
			System.out.println("Match All Digits: You win 5000 USD. ");
		} else if (
			userInputUnitDigit == lotteryNumberUnitDigit ||
			userInputUnitDigit == lotteryNumberTensDigit ||
			userInputUnitDigit == lotteryNumberHundredsDigit ||
			userInputTensDigit == lotteryNumberUnitDigit ||
			userInputTensDigit == lotteryNumberTensDigit ||
			userInputTensDigit == lotteryNumberHundredsDigit ||
			userInputHundredsDigit == lotteryNumberUnitDigit ||
			userInputHundredsDigit == lotteryNumberTensDigit ||
			userInputHundredsDigit == lotteryNumberHundredsDigit
			) {
			System.out.println("Match one digit: you win 2000 USD. ");
		} else {
			System.out.println("Sorry, better luck next time. ");
		}

	}
}