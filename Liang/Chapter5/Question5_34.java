import java.util.Scanner;
public class Question5_34
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		// write the program's logic within a loop, one whose loop-continuation-condition depends on two counters ComputerWins and UserWins

		int userWins = 0;
		int computerWins = 0;

		byte userChoice = 0;
		byte computerChoice = 0;

		String userChoiceString = "";
		String computerChoiceString = "";

		while (Math.abs(computerWins - userWins) <= 2)
		{
			// while the computer/user has not won more than 2 times than its' opponent...
			System.out.print("scissor (0), rock (1), paper (2): ");
			userChoice = scannerObject.nextByte();
			computerChoice = (byte) (Math.random() * 3);


			switch (userChoice) {
				case 0: userChoiceString = "Scissor";
				break;
				case 1: userChoiceString = "Rock";
				break;
				case 2: userChoiceString = "Paper";
				break;
			}

			switch (computerChoice) {
				case 0: computerChoiceString = "Scissor";
				break;
				case 1: computerChoiceString = "Rock";
				break;
				case 2: computerChoiceString = "Paper";
				break;
			}

			System.out.print("The computer is " + computerChoiceString + ". You are " + userChoiceString + ". ");
			if (userChoice == computerChoice)
			{
				System.out.println("It's a draw. ");
				// a draw does not add anything to either player's score
			}
			else if ((computerChoice + 1) % 3 == userChoice)
			{
				System.out.println("You won. ");
				userWins++;
			}
			else
			{
				System.out.println("The computer won. ");
				computerWins++;
			}
		}
	}
}