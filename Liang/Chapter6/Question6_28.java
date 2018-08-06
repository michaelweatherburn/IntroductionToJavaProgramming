public class Question6_28 {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= (int) Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void printMersennePrimesTable(int numberOfConsiderations) {
		System.out.printf("%-10s%10s\n", "p", "2^p-1");
		System.out.printf("%20s\n", "--------------------");
		int mersennePrimeExpression = 0;
		for (int p = 2; p <= numberOfConsiderations; p++) {
			mersennePrimeExpression = (int) Math.pow(2, p) - 1;
			if (isPrime(mersennePrimeExpression)) {
				System.out.printf("%-10d%10d\n", p, mersennePrimeExpression);
			}
		}
	}

	public static void main(String[] args) {
		printMersennePrimesTable(31);
	}
}