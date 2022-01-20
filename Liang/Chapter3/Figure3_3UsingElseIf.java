import java.util.Scanner;

public class Figure3_3UsingElseIf
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int score;

		System.out.print("Enter the score obtained. ");
		score = scannerObject.nextInt();
		scannerObject.close();

		if(score > 90)
		{
			System.out.print("A");
		}
		else if(score > 80)
		{
			System.out.print("B");
		}
		else if(score > 70)
		{
			System.out.print("C");
		}
		else if(score > 60)
		{
			System.out.print("D");
		}
		else if(score > 33)
		{
			System.out.print("E");
		}
		else
		{
			System.out.print("F");
		}

		//works the same as that in NestedIf, but the code is now much more readable. This is very similar to the switch statement that we'll be using later.
	}
}
