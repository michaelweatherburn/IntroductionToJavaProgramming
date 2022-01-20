import java.util.Scanner;

public class Question3_14
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int coinTossResult = Math.random() > 0.5 ? 1 : 0;
		int coinTossGuess;

		System.out.print("Enter 1 for heads, 0 for tails. ");
		coinTossGuess = scannerObject.nextInt();
		scannerObject.close();

		if(coinTossGuess == coinTossResult)
		{
			System.out.println("Your guess is correct! Congratulations!");
		}
		else
		{
			System.out.println("Better luck next time!");
		}







	}
}
