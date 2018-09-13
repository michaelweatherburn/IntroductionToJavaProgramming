import java.util.Scanner;
public class Months {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		// used the array initializer to initialise an array of strings
		System.out.println("Enter a month number (1 to 12): ");
		int monthNumber = scanner.nextInt();
		System.out.println("The month is " + months[monthNumber -  1]);
	}
}