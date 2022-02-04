import java.util.Scanner;
public class Question3_22 {
	public static void main(String[] args) {
		final double CIRCLE_RADIUS = 10.0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		scanner.close();

		double distanceFromOrigin = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		boolean isPointWithinCircle = distanceFromOrigin <= CIRCLE_RADIUS;
		
		System.out.print("Point (" + x + ", " + y + ") is " + (isPointWithinCircle ? "" : "not ") + "within the circle. ");
	}
}