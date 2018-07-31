public class Question6_10 {
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		// a number is prime until we find the first proper divisor of that number between 2 and itself
		for (int i = 2; i <= (int)(Math.sqrt(number)); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static int findNumberOfPrimesLessThan(int limit) {
		int foundPrimes = 0;
		for (int currentNumber = 2; currentNumber < 10000; currentNumber++) {
			if (isPrime(currentNumber)) {
				foundPrimes++;
			}
		}
		return foundPrimes;
	}

	public static void main(String[] args) {
		final int LIMIT = 10000;
		System.out.println("The number of primes less than " + LIMIT + " is " + findNumberOfPrimesLessThan(LIMIT));
	}
}