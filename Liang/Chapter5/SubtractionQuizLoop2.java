import java.util.Scanner;
public class SubtractionQuizLoop2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 5;
		int correctCount = 0;
		int count = 0;
		int firstRandomNumber = 0;
		int secondRandomNumber = 0;
		String output = "";	//to be used to store output of each iteration, so that it can be displayed at the end
		int providedAnswer;
		int actualAnswer;

		long startTimeMilliseconds = System.currentTimeMillis();
		while (count < NUMBER_OF_QUESTIONS)
		{
			// get two random numbers into two variables
			firstRandomNumber = (int)(Math.random() * 10);
			secondRandomNumber = (int)(Math.random() * 10);

			// if required, swap the numbers so that they're in order
			if (firstRandomNumber < secondRandomNumber)
			{
				int temp = firstRandomNumber;
				firstRandomNumber = secondRandomNumber;
				secondRandomNumber = temp;
			}

			// quiz the user
			actualAnswer = firstRandomNumber - secondRandomNumber;
			System.out.println("What is " + firstRandomNumber + " - " + secondRandomNumber + "? ");
			providedAnswer = scanner.nextInt();


			output += (firstRandomNumber + " - " + secondRandomNumber + " = " + providedAnswer + " ");
			if (providedAnswer == actualAnswer)
			{
				System.out.println("You are correct! ");
				correctCount++;
				output += "correct\n";
			}
			else
			{
				System.out.println("Your answer is wrong. ");
				System.out.println(firstRandomNumber + " - "  + secondRandomNumber + " should be " + actualAnswer);
				output += "wrong\n";
			}

			count++;	//count would be incremented, no matter what
		}
		long endTimeMilliseconds = System.currentTimeMillis();
		long testTime = (endTimeMilliseconds - startTimeMilliseconds) / 1000;
		// time taken to finish the test (in seconds)

		System.out.println("Current count is " + correctCount);
		System.out.println("Test time is " + testTime + " seconds");

		System.out.println(output);
	}
}