public class TestBreak2 {
	public static void main(String[] args) {
		int number = 0;
		int sum = 0;

		while (number < 20)
		{
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}