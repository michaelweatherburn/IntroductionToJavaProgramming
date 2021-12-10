import java.util.Scanner;
public class Question2_4 {
	public static void main(String[] args) {
		final double PING_PER_SQUARE_METER = 0.3025;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number in square meters: ");
		double squareMeters = scanner.nextDouble();
		scanner.close();

		double pings = squareMeters * PING_PER_SQUARE_METER;

		System.out.println(((int) (squareMeters * 1000) / 1000.0) + " square meters is " + ((int) (pings * 1000) / 1000.0) + " pings. ");
	}
}
