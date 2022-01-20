import java.util.Scanner;

public class Question3_10
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int firstNumber = (int)(Math.random() * 100);
		int secondNumber = (int)(Math.random()  * 100);
		int providedAnswer, actualAnswer;

		int temporary = 0;
		//swap the numbers if they're not in their natural order
		if(secondNumber > firstNumber)
		{
			temporary = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temporary;
		}

		actualAnswer = firstNumber + secondNumber;

		System.out.print("What is " + firstNumber + " + " + secondNumber + "? ");
		providedAnswer = scannerObject.nextInt();
		scannerObject.close();

		if(providedAnswer == actualAnswer)
		{
			System.out.print("You're right! ");
		}
		else
		{
			System.out.print("You're wrong. ");
		}

	}
}
