public class Question6_14 {
	public static double computeSeries(int numberOfTerms) {
		double sum = 0.0;
		for (int i = 1; i <= numberOfTerms; i++) {
			sum += (double) (i % 2 == 0 ? -1 : 1) / (2 * i - 1);
		}
		sum *= 4.0;
		return sum;
	}

	public static void main(String[] args) {
		System.out.printf("%-10s%10s\n", "i", "m(i)");
		System.out.printf("%10s%10s\n", "----------", "----------");
		for (int i = 1; i <= 901; i += 100) {
			System.out.printf("%-10d%10.4f\n", i, computeSeries(i));
		}
	}
}