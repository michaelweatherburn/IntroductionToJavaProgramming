import java.util.Scanner;
public class Question5_41
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int input;
		int max = 0, count = 0;
		do {
			input = scannerObject.nextInt();
			if (input > max)
			{
				max = input;
				count = 1;	// first occurence of the largest number yet: found! (note that the previous counts for smaller numbers are lost)
			}
			else if (input == max)
			{
				count++;	// found a new occurence of already established largest number: increase the count
			}
		} while (input != 0);
		// the above is a sentinel-controlled loop

		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);

	}
}