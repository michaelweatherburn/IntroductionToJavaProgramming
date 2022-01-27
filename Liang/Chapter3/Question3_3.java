import java.util.Scanner;

public class Question3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a, b, c, d, e, f, x, y, denominator;

		System.out.print("Enter a, b, c, d, e, f: ");
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		d = scanner.nextDouble();
		e = scanner.nextDouble();
		f = scanner.nextDouble();
		scanner.close();

		denominator = a * d - b * c;
		if (denominator == 0) {
			System.out.println("The equation has no solution. ");
		} else {
			x = (e*d - b*f)/denominator;
			y = (a*f - b*c)/denominator;
			System.out.println("x is " + x + " and y is " + y);
		}
	}
}
