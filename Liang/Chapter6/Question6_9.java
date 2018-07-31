public class Question6_9 {
	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return 3.279 * meter;
	}

	public static void main(String[] args) {
				System.out.printf("%-20s%-20s|%20s%20s\n", "Feet", "Meters", "Meters", "Feet");
		System.out.printf("%-20s%-20s|%20s%20s\n", "--------------------", "--------------------", "--------------------", "--------------------");
		double feet = 1.0, meters = 20.0;
		for (int i = 1; i <= 10; i++, feet += 1.0, meters += 5.0) {
					System.out.printf("%-20.1f%-20.3f|%20.1f%20.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
					// getting really different results than what I see in the provided table in the book. Will return to this question in the future
		}
	}
}