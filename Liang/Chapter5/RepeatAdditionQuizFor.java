import java.util.Scanner;
public class RepeatAdditionQuizFor
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int firstRandomNumber = (int)(Math.random() * 10);
		int secondRandomNumber = (int)(Math.random() * 10);
		int expectedAnswer = firstRandomNumber + secondRandomNumber;

		System.out.printf("\nWhat is %d + %d? ", firstRandomNumber, secondRandomNumber);
		int providedAnswer = scanner.nextInt();

		for(; providedAnswer != expectedAnswer;)
		{
			System.out.printf("\nWrong answer. Try again. What is %d + %d? ", firstRandomNumber, secondRandomNumber);
			providedAnswer = scanner.nextInt();
		}
	}
}