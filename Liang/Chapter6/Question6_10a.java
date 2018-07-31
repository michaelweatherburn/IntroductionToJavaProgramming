public class Question6_10a {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= (number / 2); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
/*
	An alternative way of writing the loop. Here, the loop returns as soon as we encounter a proper divisor of the said number. This kind of code should be avoided, since multiple return statements in programs can quickly become complex and undesirable
*/
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