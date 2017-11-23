import java.util.Scanner;
//demonstrate cancellation errors
public class Question5_23
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number of terms in the summation. ");
		int numberOfTerms = scannerObject.nextInt();

		double sumLargerFirst = 0.0;
		double sumSmallerFirst = 0.0;

		for(int i = 1; i <= numberOfTerms; i++)
			sumLargerFirst += (1 / (double) i);

		for(int i = numberOfTerms; i >= 1; i++)
			sumSmallerFirst += (1 / (double) i);

		System.out.println("Sum when larger numbers are added up first: " + sumLargerFirst);
		System.out.println("Sum when smaller numbers are added up first: " + sumSmallerFirst);
	}
}