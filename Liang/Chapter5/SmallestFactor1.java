import java.util.Scanner;
public class SmallestFactor1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number. ");
		int n = scanner.nextInt(); 
		int factor = 2;
		while(factor <= n)
		{
			if(n % factor == 0)
				break;
			factor++;
		}

		System.out.println("The smallest factor other than 1 for the number " + n + " is " + factor);
	}
}