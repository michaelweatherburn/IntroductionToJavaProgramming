import java.util.Scanner;
public class Question3_23 {
	public static void main(String[] args) {
		final double RECTANGLE_CENTRE_X = 1.0;
		final double RECTANGLE_CENTRE_Y = 1.0;
		final double RECTANGLE_HEIGHT = 5.0;
		final double RECTANGLE_WIDTH = 10.0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		scanner.close();

		boolean isPointWithinRectangle =
		(RECTANGLE_CENTRE_X - RECTANGLE_WIDTH / 2 <= x && x <= RECTANGLE_CENTRE_X + RECTANGLE_WIDTH / 2) &&
		(RECTANGLE_CENTRE_Y - RECTANGLE_HEIGHT / 2 <= y && y <= RECTANGLE_CENTRE_Y + RECTANGLE_HEIGHT / 2);

		System.out.println("Point (" + x + ", " + y + ") is" + (isPointWithinRectangle ? "" : " not") + " in the rectangle. ");
	}
}