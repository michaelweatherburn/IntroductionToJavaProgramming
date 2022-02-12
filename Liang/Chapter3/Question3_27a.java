/* Alternative implementation

	If a point is present inside a triangle, the sum of areas of the the triangles formed by joining said point with each vertice of the triangle would be equal to the area of the triangle

	This approach, although theoretically correct, always provides the wrong answer, due to the inherent inaccuracy of double arithmetic
	A fixed value of EPSILON_DOUBLE fails here because the areas being compared can be quite large. Since double values can store either large values or high precision values but not both, the error becomes large when compared to EPSILON_DOUBLE
 */
import java.util.Scanner;
public class Question3_27a {
	public static double computeAreaOfTriangle(double a, double b, double c) {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
		// return Math.sqrt(Math.abs(s * (s - a) * (s - b) * (s - c)));
	}

	public static double computeDistanceBetweenTwoPoints(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		// return Math.sqrt(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2));
	}

	public static void main(String[] args) {
		final double EPSILON_DOUBLE = 10E-14;
		final double x1 = 0, y1 = 0;
		final double x2 = 0, y2 = 100;
		final double x3 = 200, y3 = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		scanner.close();

		double ab = computeDistanceBetweenTwoPoints(x1, y1, x2, y2);
		double bc = computeDistanceBetweenTwoPoints(x2, y2, x3, y3);
		double ca = computeDistanceBetweenTwoPoints(x3, y3, x1, y1);

		double ad = computeDistanceBetweenTwoPoints(x, y, x1, y1);
		double bd = computeDistanceBetweenTwoPoints(x, y, x2, y2);
		double cd = computeDistanceBetweenTwoPoints(x, y, x3, y3);

		/*
		System.out.println("Area of ABC: " + computeAreaOfTriangle(ab, bc, ca));
		System.out.println("Area of ABD: " + computeAreaOfTriangle(ad, bd, ab));
		System.out.println("Area of BCD: " + computeAreaOfTriangle(bd, cd, bc));
		System.out.println("Area of ACD: " + computeAreaOfTriangle(ad, cd, ca));
		System.out.println("Sum of Areas: " + (computeAreaOfTriangle(ad, bd, ab) + computeAreaOfTriangle(bd, cd, bc) + computeAreaOfTriangle(ad, cd, ca)));
		*/

		if (Math.abs(computeAreaOfTriangle(ad, bd, ab) + computeAreaOfTriangle(ad, cd, ca) + computeAreaOfTriangle(bd, cd, bc) - computeAreaOfTriangle(ab, bc, ca)) < EPSILON_DOUBLE) {
			System.out.println("The point is in the triangle. ");
		} else {
			System.out.println("The point is not in the triangle. ");
		}
	}
}