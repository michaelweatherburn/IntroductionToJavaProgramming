public class Question5_10a
{
	public static void main(String[] args)
	{
		/* better solution - since 5 and 6 are co-prime (no common factors other than 1) divisibility by
		both 5 and 6 is effectively equal to divisibility by 30)

		First, find the smallest number greater than 100 that is divisible by 30. 
		Also, find the largest number smaller than 1000 that is divisible by 30.

		Start an AP loop from the first number to the second number 

		Benefit: reduction in number of iterations from 1000 - 10 to nth term of the AP
		described by the common term lastMultiple = firstMuliple + (n - 1) * 30
		*/

		final int NUMBERS_PER_LINE = 10;

		// find the smallest number greater than 100 which is a multiple of 30
		int firstMultiple = (100 / 30 + 1) * 30;

		// find the largest number less than 1000 which is a multiple of 30

		int lastMultiple = (1000 / 30) * 30; 

		for (int i = firstMultiple, count = 1; i <= lastMultiple; i += 30, count++)
		{
			System.out.print(i + " ");
			if (count % NUMBERS_PER_LINE == 0)
				System.out.println();
		}
	}
}