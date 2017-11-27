import java.util.Scanner;

public class Question5_25
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		for (int i = 10000; i <= 100000; i += 10000)
		{
			/* Always start from the element that will contribute the smallest magnitude to the sum and move to the element that contributes progressively larger magnitudes to the sum. This will reduce cancellation errors */
			double pi = 0.0;
			int j = i;
			while (j >= 1)
			{
				pi += ((double) (j % 2 == 0 ? -1 : 1) / (double) (2 * j - 1));
				j--;
			}
			pi *= 4;

			System.out.println("i: " + i);
			System.out.println("pi: " + pi);
		}
	}
}