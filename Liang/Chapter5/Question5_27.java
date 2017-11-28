public class Question5_27
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_LEAP_YEARS_PER_LINE = 10;
		/* This program could have been made much better if we could use a method to check whether a year is a leap year or not */

		int count = 0;
		for (int i = 101; i <= 2100; i++)
		{
			/* check whether the year is a leap year */
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				System.out.print(i + " ");
				count++;
				if (count % NUMBER_OF_LEAP_YEARS_PER_LINE == 0)
					System.out.println();
			}
		}

		System.out.println("\n\nNumber of leap years: " + count);
	}
}