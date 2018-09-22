import java.util.Scanner;
public class CheckPoint5_7_7d
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scannerObject.nextInt();
		int count = 5;
		while (count < n)
		{
			System.out.println("Count: " + count);
			count += 3;
		}

		/*
			Try to plot the graph of this function number of iterations versus the value of n.
			you can use the greatest integer function to do that.


			For n equals: 
			... 3, 4, 5
			number of iterations = 0

			6, 7, 8
			number of iterations = 1

			9, 10, 11
			number of iteratations = 2

			....
			By induction, we can assume that
			if n >= 6, 
			then number of iterations = floor(n/3) - 1
			else
			number of iterations = 0

		*/
	}
}