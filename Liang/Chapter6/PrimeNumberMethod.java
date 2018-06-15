public class PrimeNumberMethod
{
	public static void main(String[] args) {
		System.out.println("The first 50 prime numbers are \n");
		printPrimeNumbers(50);
	}

	public static void printPrimeNumbers(int numberOfPrimes) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int currentNumber = 2;
		while (count < numberOfPrimes)  {
			if (isPrimeNumber(currentNumber)) {
				System.out.printf("%5s", currentNumber);
				count++;
				if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
					System.out.println();
			}
			currentNumber++;
		}
	}

	public static boolean isPrimeNumber(int input) {
		for (int i = 2; i <= (int)(Math.sqrt(input)); i++)
		{
			if (input % i == 0)
				return false;
		}
		return true;
	}
}

