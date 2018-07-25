public class Question6_1 {
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
	public static void main(String[] args) {
		final int NUMBER_OF_PENTAGONAL_NUMBERS = 100;
		final int NUMBER_OF_PENTAGONAL_NUMBERS_PER_LINE = 10;
		for (int i = 0; i < NUMBER_OF_PENTAGONAL_NUMBERS; i++) {
			if (i % NUMBER_OF_PENTAGONAL_NUMBERS_PER_LINE == 0)
				System.out.println();
			System.out.printf("%7d", getPentagonalNumber(i));
		}
	}
}