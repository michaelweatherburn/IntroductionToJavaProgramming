import java.util.Scanner;
public class Question6_25 {
	public static String convertMillis(long millis) {
		long seconds = millis / 1000;
		long minutes = seconds / 60;
		seconds %= 60;
		long hours = minutes / 60;
		minutes %= 60;
		return hours + ":" + minutes + ":" + seconds;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of milliseconds: ");
		long milliseconds = scanner.nextLong();
		System.out.println("The formatted time string: " + convertMillis(milliseconds));
	}
}