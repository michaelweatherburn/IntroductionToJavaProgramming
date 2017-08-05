import java.util.Scanner;
public class RepeatAdditionQuiz
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		int firstRandomNumber = (int)(Math.random() * 10);
		int secondRandomNumber = (int)(Math.random() * 10);
		int expectedAnswer = firstRandomNumber + secondRandomNumber;

		System.out.printf("\nWhat is %d + %d? ", firstRandomNumber, secondRandomNumber);
		int providedAnswer = scannerObject.nextInt();

		while(expectedAnswer != providedAnswer)
		{
			System.out.printf("\nWrong answer. Try again. What is %d + %d? ", firstRandomNumber, secondRandomNumber);
			providedAnswer = scannerObject.nextInt();
		}

	}
}