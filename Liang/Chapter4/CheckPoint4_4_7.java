import java.util.Scanner;
public class CheckPoint4_4_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double d = scanner.nextDouble();

		System.out.println("Number of digits: " + (d >= 0 ? (d + "").length() - 1 : (d + "").length() - 2));

		//shows an acceptable answer for all values after -0.
	}
}