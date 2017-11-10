public class Question5_11
{
	public static void main(String[] args)
	{
		/* no brainer solution */
		final int NUMBERS_PER_LINE = 10;

		int count = 0;
		for (int i = 100; i <= 1000; i++)
		{
			// check whether the number is divisible by either 5 or 6, but not both
			if (i % 5 == 0 ^ i % 6 == 0)
			{
				count++;
				System.out.print(i + " ");

				if (count % NUMBERS_PER_LINE == 0)
				{
					System.out.println();	// move the cursor to the next line
				}
			}
		}
	}
}