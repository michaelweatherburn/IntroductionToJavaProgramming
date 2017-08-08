import java.util.Scanner;
public class SubtractionQuizLoop
{
	public static final int NUMBER_OF_GUESSES = 5;
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int count = 0;
		int firstRandomNumber = 0, secondRandomNumber = 0;
		long startTime = System.currentTimeMillis();
		int[] guesses = new int[NUMBER_OF_GUESSES];
		int[] answers = new int[NUMBER_OF_GUESSES];
		boolean[] verdicts = new boolean[NUMBER_OF_GUESSES];

		while(count < NUMBER_OF_GUESSES){
			firstRandomNumber = (int)(Math.random() * 10);
			secondRandomNumber = (int)(Math.random() * 10);

			if(firstRandomNumber > secondRandomNumber)
			{
				int temp = secondRandomNumber;
				secondRandomNumber = firstRandomNumber;
				firstRandomNumber = temp;
			}
		//swap the two numbers so that they're in order

			answers[count] = secondRandomNumber - firstRandomNumber;
			System.out.println("What is " + secondRandomNumber + " - " + firstRandomNumber + "? ");
			guesses[count] = scannerObject.nextInt();
			verdicts[count] = (answers[count] == guesses[count]);
			count++;
		}
		long endTime = System.currentTimeMillis();
		long testTimeInSeconds = (endTime - startTime)/1000;
		System.out.println("Here are the results of the test: ");

		System.out.printf("%2s%20s%20s%20s\n", "", "Actual Answer", "Provided Answer", "Verdict");
		int i = 0;
		while (i < NUMBER_OF_GUESSES)
		{
			System.out.printf("%2d%20d%20d%20b\n", i, answers[i], guesses[i], verdicts[i]);
			i++;
		}
		System.out.println("Total test time: " + testTimeInSeconds);
	}
}