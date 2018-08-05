public class Question6_27 {
	public static int reverse(int number) {
		int workingCopyOfNumber = number;
		int reverseOfNumber = 0;
		while (workingCopyOfNumber > 0) {
			reverseOfNumber *= 10;
			reverseOfNumber += (workingCopyOfNumber % 10);
			workingCopyOfNumber /= 10;
		}
		return reverseOfNumber;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i <= (int) Math.sqrt(number); i++) {
			if (number % i == 0)  {
				return false;
			}
		}
		return true;
	}

	public static void printEmirps(int numberOfEmirps, int numberOfEmirpsPerLine) {
		int count = 0, currentNumber = 2;
		while (count < numberOfEmirps) {
			if (isPrime(currentNumber) && isPrime(reverse(currentNumber)) && !isPalindrome(currentNumber)) {
				System.out.print(currentNumber + " ");
				count++;
				if (count % numberOfEmirpsPerLine == 0) {
					System.out.println();
				}
			}
			currentNumber++;
		}
	}

	public static void main(String[] args) {
		printEmirps(100, 10);
	}
}