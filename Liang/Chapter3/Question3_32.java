/*
		How to prove the validity of this expression?

		y = m * x + c is the y-intercept form of a line
		Here, m = (y1 - y0) / (x1 - x0) + c

		m = slope, c = y-intercept

		Since (x0, y0) is a point on the line
		y0 = m * x0 + c solves this equation

		Evaluating c from this equation

		c = (y0 * x1 - x0 * y1) / (x1 - x0);

		The equation becomes
		y = mx + c
		or y = ((y1 - y0) * x) / (x1 - x0) + (y0 * x1 - x0 * y1) / (x1 - x0)

		If p2 is on the left hand side of the line, we can draw a line with the same slope, parallel to p0p1, on which p2 lies
		That line's equation would be y = mx + c + c1
		Where (c1 > 0) (a line parallel to and on the left/above the original line will have higher y-intercept)

		If p2 is on the right hand side of the line, we can draw a line with the same slope, parallel to p0p1, on which p2 lies
		That line's equation would be y = mx + c + c1
		Where (c1 < 0) (a line parallel to and on the right/below the original line will have lower y-intercept)

		Solve the inequalities for the value of c1

*/
import java.util.Scanner;
public class Question3_32 {
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
		if (differenceInYIntercept > 0) {
			System.out.println("p2 is on the left side of the line. ");
		} else if (differenceInYIntercept == 0) {
			System.out.println("p2 is on the same line");
		} else {
			System.out.println("p2 is on the right side of the line ");
		}
	}
}