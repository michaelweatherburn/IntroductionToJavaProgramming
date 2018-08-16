import java.util.Scanner;
public class Question6_39 {

	public static double crossProduct(double x0, double y0, double x1, double y1, double x2, double y2) {
		return (x1 - x0) * (y2 - y0) - (y1 - y0) * (x2 - x0);
	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return crossProduct(x0, y0, x1, y1, x2, y2) > 0;
	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		return crossProduct(x0, y0, x1, y1, x2, y2) == 0;
	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		return onTheSameLine(x0, y0, x1, y1, x2, y2) && (distanceBetweenPoints(x0, y0, x1, y1) == (distanceBetweenPoints(x0, y0, x2, y2) + distanceBetweenPoints(x1, y1, x2, y2)));
	}

	public static double distanceBetweenPoints(double x0, double y0, double x1, double y1) {
		return Math.sqrt(Math.pow(y1 - y0, 2) + Math.pow(x1 - x0, 2));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2: ");
		double x0 = scanner.nextDouble();
		double y0 = scanner.nextDouble();
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
		} else if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.printf("(%.1f, %.1f) is on the same line from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
		} else {
			System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
		}
	}
}