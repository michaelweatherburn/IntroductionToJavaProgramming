import java.util.Scanner;
public class CheckPoint4_4_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = scanner.nextInt();
		System.out.println("Number of digits: " + (i >= 0 ? (i + "").length() : (i + "").length() - 1));
	}
}