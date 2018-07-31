public class Question6_13a {
	public static void computeAndPrintSeries(int numberOfTerms) {
		double currentSum = 0;
		for (int i = 1; i <= numberOfTerms; i++) {
			currentSum += ((double) i / (i + 1));
			System.out.printf("%-10d%10.4f\n", i, currentSum);
		}
	}
/*
	Better than the first solution. This is because you're reusing the sum from the last iteration here, simply adding the nth term of the expression to it before printing the sum upto n terms
*/

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s\n", "i", "m(i)");
		System.out.printf("%-10s%10s\n", "----------", "----------");
		computeAndPrintSeries(20);
	}
}