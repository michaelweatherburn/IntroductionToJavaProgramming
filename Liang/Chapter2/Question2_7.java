import java.util.Scanner;
public class Question2_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final long MINUTES_PER_DAY = 60 * 24;
		final long DAYS_PER_YEAR = 365;
		final long MINUTES_PER_YEAR = MINUTES_PER_DAY * DAYS_PER_YEAR;

		System.out.print("Enter the number of minutes: ");
		long minutes = scanner.nextLong();
		scanner.close();

		long remainingMinutes = minutes;

		long years = remainingMinutes / MINUTES_PER_YEAR;
		remainingMinutes = remainingMinutes % MINUTES_PER_YEAR;

		long days = remainingMinutes / MINUTES_PER_DAY;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days. ");
	}
}