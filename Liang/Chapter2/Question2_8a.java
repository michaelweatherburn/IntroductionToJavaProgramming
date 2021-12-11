import java.util.Scanner;
public class Question2_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		double timezoneOffsetInHours = scanner.nextDouble();
		scanner.close();

		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;

		long remainingSeconds = (long) (totalSeconds + timezoneOffsetInHours * 60 * 60) % (24 * 60 * 60);

		long hours = remainingSeconds / (60 * 60);
		remainingSeconds = remainingSeconds % (60 * 60);
		long minutes = remainingSeconds / 60;
		long seconds = remainingSeconds % 60;

		System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds);
	}
}