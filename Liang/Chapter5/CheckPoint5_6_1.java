import java.util.Scanner;
public class CheckPoint5_6_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number, max;

		number = input.nextInt();
		max = number;

		do
		{
			number = input.nextInt();
			if(number > max)
				max = number;
		}	while(number != 0);

		//just like CheckPoint5_4, but this program can take input twice, even if the number is zero at first. This explains a good use-case for do-while loops: taking user input from the console.

		//Since we've used a do-while loop to get new numbers from the user, we can remove the first instance of input.nextInt() for a more succinct program.
		System.out.println("max: " + max);
		System.out.println("number: " + number);
	}
}