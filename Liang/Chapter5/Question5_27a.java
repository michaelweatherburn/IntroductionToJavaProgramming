public class Question5_27a
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_LEAP_YEARS_PER_LINE = 10;
		/* slightly more optimised: jump from one leap year to the next, skip over years where year % 4 is 0, but year % 100 isn't (1300, 1500, 1800 etc.) */

		// Step 1. Find the first number of the arithmetic progression
		int i = ((101 / 4) + 1) * 4;
		int count = 0;
		// Step 2. Create a loop that moves from one leap year to the next
		while (i <= 2100) {

			if (i % 100 == 0 && i % 400 != 0) {
				i += 4;	// move on to the next multiple of 4
				// note: you wouldn't have to write the above statement if you didn't use continue, or used it with the for loop
				continue;
			}

			// Step 3. For a year to be a leap year, it must be a multiple of 4 not divisible by 100, or it should be divisible by 400
			System.out.print(i + " ");
			count++;
			if (count % NUMBER_OF_LEAP_YEARS_PER_LINE == 0)
				System.out.println();
			i += 4;
		}

		System.out.println("\n\nNumber of leap years: " + count);
	}
}