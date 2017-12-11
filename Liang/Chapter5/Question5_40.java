import java.util.Scanner;
public class Question5_40
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int heads = 0, tails = 0;
		for (int i = 0; i < 1000000; i++)
			if (Math.random() < 0.5)
				heads++;
			else
				tails++;

	System.out.println("Heads: " + heads);
	System.out.println("Tails: " + tails);
	}
}