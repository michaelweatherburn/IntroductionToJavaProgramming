import java.util.Scanner;
public class Question3_35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int input = scanner.nextInt();
		scanner.close();

		System.out.println(input + " is " + (input % 2 == 0 ? "even" : "odd") + " number");
	}
}