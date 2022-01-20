import java.util.Scanner;

public class CheckPoint3_3_2
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		byte score;
		double payScale = 19000;
		System.out.print("Enter the score. ");
		score = scannerObject.nextByte();

		if(score > 90)
		{
			payScale *= 1.03;
			System.out.print("The pay scale is now " + payScale);
		}
	}
}
