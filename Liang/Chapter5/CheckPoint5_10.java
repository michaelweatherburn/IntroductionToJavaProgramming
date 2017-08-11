import java.util.Scanner;
public class CheckPoint5_10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number, sum = 0, count;

		for(count = 0; count < 5; count++)
		{
			number = input.nextInt();
			sum += number;
		}

		System.out.println("Sum: " + sum);
		System.out.println("Count: " + count);

		/*

		Input: 2 3 4 5 0
		Output:

		Sum: 14
		Count: 5

		*/
	}
}