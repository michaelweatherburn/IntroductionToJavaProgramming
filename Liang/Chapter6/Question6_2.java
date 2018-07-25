import java.util.Scanner;
public class Question6_2 {
	public static int sumDigits(long n) {
		int result = 0;
		while (n > 0) {
			result += n % 10;
			n /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		long input = scanner.nextLong();
		System.out.println("Sum of digits for the number " + input + ": " + sumDigits(input));
	}
}