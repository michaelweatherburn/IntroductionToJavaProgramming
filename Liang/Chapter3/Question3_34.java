import java.util.Scanner;
public class Question3_34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1 and p2: ");
		double x0 = scanner.nextDouble();
		double y0 = scanner.nextDouble();
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();

		scanner.close();

		double differenceInYIntercept = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		boolean isPointBetweenTwoEndsOfLineSegment = (Math.min(x0, x1) <= x2 && x2 <= Math.max(x0, x1)) && (Math.min(y0, y1) <= y2 &&
		y2 <= Math.max(y0, y2));

		if (differenceInYIntercept == 0 && isPointBetweenTwoEndsOfLineSegment) {
			System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		} else {
			System.out.println("(" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
	}
}