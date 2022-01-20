import java.util.Scanner;

public class AdditionQuiz
{
	private static final int FIRST_PRIME = 47;
	private static final int SECOND_PRIME = 31;
	public static void main(String[] args)
	{
		int firstNumber = (int)(System.currentTimeMillis() % FIRST_PRIME);
		int secondNumber = (int)(System.currentTimeMillis() % SECOND_PRIME);

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("What is " + firstNumber + " + " + secondNumber + "? ");
		int answerProvided = scannerObject.nextInt();
		scannerObject.close();

		int expectedSum =  firstNumber + secondNumber;
		boolean result = expectedSum == answerProvided;

		System.out.println(firstNumber + " + " + secondNumber + " equals " + answerProvided + " is " + result + "!");
	}
}
