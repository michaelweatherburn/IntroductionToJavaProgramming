import java.util.Scanner;
public class RepeatAdditionQuizDoWhile
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		int firstRandomNumber = (int)(Math.random() * 10);
		int secondRandomNumber = (int)(Math.random() * 10);
		int expectedAnswer = firstRandomNumber + secondRandomNumber;
		int providedAnswer = 0;
		boolean alreadyRun = false;
		do
		{
			if(alreadyRun == false)
			{
				System.out.printf("What is %d + %d? ", firstRandomNumber, secondRandomNumber);
				alreadyRun = true;
			}
			else
			{
				System.out.printf("Wrong answer. Try again: What is %d + %d? ", firstRandomNumber, secondRandomNumber);
			}
			providedAnswer = scannerObject.nextInt();
		} while(expectedAnswer != providedAnswer);

		
	}
}