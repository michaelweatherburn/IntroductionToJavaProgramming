import java.util.Scanner;
public class Question6_4 {
	public static void reverse(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10;
			reverse += (number % 10);	//using the modulus operator to extract the last digit of the number
			number /= 10;
		}
		System.out.println(reverse);
		return;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number whose reverse is to be shown. ");
		int input = scanner.nextInt();
		System.out.print("Reverse of " + input + ": ");
		reverse(input);	//since the reverse method is a void-method, it does not return a value - rather, it prints the value directly, followed by a newline. That is why I made a method call immediately after a System.out.print statement.
	}
}