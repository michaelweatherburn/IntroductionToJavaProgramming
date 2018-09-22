import java.util.Scanner;
public class CheckPoint5_5_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number, max;

		number = input.nextInt();
		max = number;

		while(number != 0)
		{
			number = input.nextInt();
			if(number > max)
				max = number;
		}

		System.out.println("Max is " + max);
		System.out.println("Number is " + number);
	}
}
/*

Input: 
2 3 4 5 0

Output:
Max is 5
Number is 0

This is a program that finds the maximum of all numbers passed into a sentinel-controlled loop that terminates when you pass 0 to it.
*/