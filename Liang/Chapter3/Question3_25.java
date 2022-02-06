import java.util.Scanner;
public class Question3_25 {
	public static void main(String[] args) {
		final double EPSILON_DOUBLE = 10E-14;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double x3 = scanner.nextDouble();
		double y3 = scanner.nextDouble();
		double x4 = scanner.nextDouble();
		double y4 = scanner.nextDouble();
		scanner.close();

		double a = y1 - y2;
		double b = x2 - x1;
		double e = a * x1 + b * y1;
		double c = y3 - y4;
		double d = x4 - x3;
		double f = c * x3 + d * y3;

		double x = 0, y = 0;
		double denominator = a * d - b * c;
		if (Math.abs(denominator) < EPSILON_DOUBLE) {
			System.out.println("The 2 lines are parallel. ");
		} else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
	}
}