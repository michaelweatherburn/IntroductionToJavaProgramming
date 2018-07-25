import java.util.Scanner;
public class Question6_3 {
	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10;
			reverse += (number % 10);
			number /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int number) {
		return reverse(number) == number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number which is to be checked. ");
		int input = scanner.nextInt();
		System.out.println("The number " + input + " is " + (isPalindrome(input) ? "" : "not ") + "a palindrome. ");
	}
}