public class Question5_27b
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_LEAP_YEARS_PER_LINE = 10;
		// Step 1. Find the first number of the arithmetic progression
		int i = ((101 / 4) + 1) * 4;
		int count = 0;
		// Step 2. Create a loop that moves from one leap year to the next
		while (i <= 2100) {
			if (i % 100 != 0 || i % 400 == 0)
			{
				/* proof that every bit of logic that can be written using a continue/break statement, can be written without using a continue/break statement */
				System.out.print(i + " ");
				count++;
				if (count % NUMBER_OF_LEAP_YEARS_PER_LINE == 0)
					System.out.println();
			}

			i += 4;
		}

		System.out.println("\n\nNumber of leap years: " + count);
	}
}