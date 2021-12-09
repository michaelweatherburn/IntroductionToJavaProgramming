import java.util.Scanner;
public class CheckPoint2_16_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coefficients in a quadratic equation a*x^2 + b*x + c, as directed: ");
		
		System.out.print("a: ");
		double a = scanner.nextDouble();

		System.out.print("b: ");
		double b = scanner.nextDouble();

		System.out.print("c: ");
		double c = scanner.nextDouble();

		scanner.close();

		double discriminant = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double x1 = (-b + discriminant) / (2 * a);
		double x2 = (-b - discriminant) / (2 * a);

		System.out.println("The roots of the quadratic equation are: ");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
	}
}