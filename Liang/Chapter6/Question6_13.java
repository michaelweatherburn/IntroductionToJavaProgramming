public class Question6_13 {
	public static double computeSeries(int numberOfTerms) {
		double sum = 0.0;
		for (int i = 1; i <= numberOfTerms; i++) {
			sum += ((double) i / (i + 1));
		}
		return sum;
	}
/*
	Not the best solution - another would be to make the method directly print the lines one by one, so it can use the total value it has obtained from the last iteration in every iteration but the first one
*/

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s\n", "i", "m(i)");
		System.out.printf("%-10s%10s\n", "----------", "----------");
		for (int i = 1; i <= 20; i++) {
			System.out.printf("%-10d%10.4f\n", i, computeSeries(i));
		}
	}
}