import java.util.Scanner;
public class Question6_37 {
	public static String format(int number, int width) {
		String input = "" + number;
		String output = "";
		if (input.length() >= width) {
			return input;
		}
		else {
			int numberOfZeroesToAdd = width - input.length();
			output = input;
			for (int i = 0; i < numberOfZeroesToAdd; i++) {
				output = "0" + output;
			}
			return output;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("Enter a preferred minimum display width: ");
		int width = scanner.nextInt();
		System.out.println("Formatted string: " + format(number, width));
	}
}