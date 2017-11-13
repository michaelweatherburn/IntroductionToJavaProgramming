public class Question5_20
{
	public static void main(String[] args)
	{
		final int NUMBER_OF_PRIMES_PER_LINE = 8;
		int count = 0;

		for (int i = 2; i <= 1000; i++)
		{
			boolean isPrime = true;
			for(int divisor = 2; divisor <= i / 2; divisor++)
			{
				if (i % divisor == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime)
			{
				count++;
				System.out.printf("%3s ", i);
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println();
			}
		}
	}
}