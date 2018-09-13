public class CheckPoint7_8 {
	public static void main(String[] args) {
		double[] list = new double[10];
		System.out.println("After inserting random values into list: ");
		for (int i = 1; i < list.length; i++) {
			list[i] = Math.random() * 10;
			System.out.print(list[i] + " ");
		} 	// for purposes of clarity

		list[list.length - 1] = 5.5;
		System.out.println(list[0] + list[1]);

		double sum = 0;
		for (double element: list) {
			sum += element;
		}

		System.out.println("Sum: " + sum);

		double minimum = list[0];
		for (double element : list) {
			if (element < minimum) {
				minimum = element;
			}
		}

		System.out.println("Minimum: " + minimum);

		System.out.println(list[(int) (Math.random() * list.length)]);

		double[] anotherArray = {3.5, 5.5, 4.52, 5.6};
	}
}