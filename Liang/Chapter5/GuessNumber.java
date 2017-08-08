import java.util.Scanner;
public class GuessNumber
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 101);

		System.out.println("What is your guess? ");
		int guessedNumber = scannerObject.nextInt();

		while(randomNumber != guessedNumber)
		{
			if(randomNumber < guessedNumber)
			{
				System.out.println("Too high. Please try again.");
			}
			else
			{
				System.out.println("Too low. Please try again. ");
			}

			guessedNumber = scannerObject.nextInt();
		}

		System.out.println("You guessed right! ");

	}
}