public class CheckPoint7_9_2 {
	public static void main(String[] args) {
		printMax(1, 2, 2, 1, 4);
		// since int is a compatible type for double (i.e. int numbers can be cast to double with no loss of precision), no issues
		printMax(new double[] {1, 2, 3});
		// since we CAN pass arrays directly, instead of passing individual elements, no issues
		printMax(new int[] {1, 2, 3});
		// here's where the issue lies. an int(primitive) can be implicitly casted to a double (primitive), but you can't cast a reference variable (int[] type) to a reference variable (double[] type). Hence the error
	}

	public static void printMax(double... numbers) {
		if (numbers.length == 0) {
			System.out.println("No arguments passed. ");
			return;
		}

		double result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > result) 
				result = numbers[i];
		}
	}
}