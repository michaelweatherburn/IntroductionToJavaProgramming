import java.util.Scanner;
public class CheckPoint5_7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sum = 0, number = 0;
		do
		{
			System.out.println("Enter the number. (Loop stops if zero is entered. ");
			number = input.nextInt();

			sum += number;
		}	while(number != 0);

		System.out.println("Sum: " + sum);

		//a rewrite of the original program, which was written using a while loop. Since the loop body would be run atleast once, there is no need to repeat part of the loop code before the loop.
	}
}