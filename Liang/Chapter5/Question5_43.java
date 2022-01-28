import java.util.Scanner;
public class Question5_43
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		for (int i = 1; i < 7; i++)
			for (int j = i + 1; j <= 7; j++)
			{
				System.out.println(i + " " + j);
				count++;	//add one to the number of combinations
			}
			System.out.println("The total number of combinations is " + count);
	}
}