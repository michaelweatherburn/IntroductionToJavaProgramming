public class Question6_26 {
	public static boolean isPalindrome(int number) {
		int workingCopyOfNumber = number;
		int reverseOfNumber = 0;
		while (workingCopyOfNumber > 0) {
			reverseOfNumber *= 10;
			reverseOfNumber += (workingCopyOfNumber % 10);
			workingCopyOfNumber /= 10;
		}
		return number == reverseOfNumber ? true : false;
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= (int)Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void printPalindromicPrimes(int numberOfPalindromicPrimes, int numberOfPalindromicPrimesPerLine) {
		int count = 0, currentNumber = 2;
		while (count < numberOfPalindromicPrimes) {
			if (isPrime(currentNumber) && isPalindrome(currentNumber)) {
				System.out.print(currentNumber + " ");
				count++;
				if (count % numberOfPalindromicPrimesPerLine == 0) {
					System.out.println();
				}
			}
			currentNumber++;
		}
	}

	public static void main(String[] args) {
		printPalindromicPrimes(100, 10);
	}
}