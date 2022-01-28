import java.util.Scanner;
public class Question5_2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		final int NUMBER_OF_QUESTIONS = 10;
		int count = 0;
		int correctCount = 0;
		String output = "";	//output tracker
		int firstRandomNumber;
		int secondRandomNumber;
		int actualAnswer;
		int providedAnswer;

		long startTimeMilliseconds = System.currentTimeMillis();

		while (count < NUMBER_OF_QUESTIONS)
		{
			// get two random numbers, no swapping required this time, the range is 0 through 15
			firstRandomNumber = 1 + (int) (Math.random() * 15);
			secondRandomNumber= 1 + (int) (Math.random() * 15);

			actualAnswer = firstRandomNumber + secondRandomNumber;
			System.out.println("What is " + firstRandomNumber + " + " + secondRandomNumber + "? ");
			providedAnswer = scanner.nextInt();

			output += (firstRandomNumber + " + " + secondRandomNumber + " = " + providedAnswer + " ");
			if (actualAnswer == providedAnswer)
			{
				System.out.println("You are correct! ");
				correctCount++;
				output += "correct\n";
			}
			else
			{
				System.out.println("Your answer is wrong. ");
				System.out.println(firstRandomNumber + " + " + secondRandomNumber + " should be " + actualAnswer);
				output += "wrong\n";
			}

			count++;
		}
		long endTimeMilliseconds = System.currentTimeMillis();
		long testTime = (endTimeMilliseconds - startTimeMilliseconds) / 1000;

		System.out.println("Correct count is " + correctCount);
		System.out.println("Test time is " + testTime);

		System.out.println(output);
	}
}