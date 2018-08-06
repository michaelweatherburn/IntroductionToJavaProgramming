public class Question6_29 {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= (int) Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static boolean hasAPrimeTwin(int number) {
		if (isPrime(number) && isPrime(number + 2))
			return true;
		else
			return false;
	}

	public static String returnTwinPrimeSet(int number) {
			return "(" + number + ", " + (number + 2) + ")";
	}

	public static void printTwinPrimes(int upperLimit) {
		for (int i = 2; i < upperLimit; i++) {
			if (hasAPrimeTwin(i)) {
				System.out.println(returnTwinPrimeSet(i));
			}
		}
	}

	public static void main(String[] args) {
		printTwinPrimes(1000);
	}
}