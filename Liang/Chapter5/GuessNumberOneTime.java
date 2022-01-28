import java.util.Scanner;
public class GuessNumberOneTime
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 101);
		int guessedNumber = 0;

		System.out.printf("\nEnter your guess: ");
		guessedNumber = scanner.nextInt();

		if(guessedNumber == randomNumber)
		{
			System.out.println("Congratulations! Your guess is right. ");
		}
		else if(guessedNumber > randomNumber)
		{
			System.out.println("Too high!");
		}
		else if(guessedNumber < randomNumber)
		{
			System.out.println("Too low! ");
		}

	}
}