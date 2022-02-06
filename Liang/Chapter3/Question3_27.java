/*
	Implementing a general solution to this problem

	1) A triangle is formed with the intersection of 3 lines.

	Let's say:
	a1x + b1y + c1 = 0
	a2x + b2y + c2 = 0
	a3x + b3y + c3 = 0

	Let's say the vertices of the triangle opposite to the above lines, respectively, are:

	(x1, y1)
	(x2, y2)
	(x3, y3)

	If the point which is being considered has coordinates (x, y), then:

	sign(a1x1 + b1y1 + c1) = sign(a1x + b1y + c1) and 
	sign(a2x2 + b2x2 + c2) = sign(a2x + b2y + c2) and
	sign(a3x3 + b3y3 + c3) = sign(a3x + b3y + c3)

	Proof: Position of a Point Relative to Line

	Note:

	1) I've not followed the rules to name constants in the main method below, for the sake of clarity
	2) I've used XNOR to evaluate the "sign" of the expressions. However, this would mean the program would fail to accept points that are a) vertices of the triangle, or b) lie on any side of the triangle. Therefore, the program tells you whether a point is STRICTLY INSIDE the triangle.

*/
import java.util.Scanner;
public class Question3_27 {
	public static void main(String[] args) {
		final double a1 = 1, b1 = 0, c1 = 0;
		final double a2 = 0, b2 = 1, c2 = 0;
		final double a3 = 1, b3 = 2, c3 = -200;

		final double x1 = 200, y1 = 0;
		final double x2 = 0, y2 = 100;
		final double x3 = 0, y3 = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		scanner.close();

		boolean isPointWithinTriangle = 
		!((a1 * x1 + b1 * y1 + c1 > 0) ^ (a1 * x + b1 * y + c1 > 0)) &&
		!((a2 * x2 + b2 * y2 + c2 > 0) ^ (a2 * x  + b2 * y + c2 > 0)) &&
		!((a3 * x3 + b3 * y3 + c3 > 0) ^ (a3 * x + b3 * y + c3 > 0));

		System.out.println("The point is " + (isPointWithinTriangle ? "" : "not ") + "in the triangle. ");
	}
}