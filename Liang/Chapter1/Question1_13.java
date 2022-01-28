import java.util.Scanner;

public class Question1_13
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the the coefficients of the first equation. ");
		System.out.print("x's coefficient: ");
		double a = scanner.nextDouble();

		System.out.print("y's coefficient");
		double b = scanner.nextDouble();

		System.out.print("constant term: ");
		double e = scanner.nextDouble();

		System.out.println("Enter the coefficients of the second equation. ");
		System.out.print("x's coefficient");
		double c = scanner.nextDouble();

		System.out.print("y's coefficient");
		double d = scanner.nextDouble();

		System.out.print("constant term: ");
		double f = scanner.nextDouble();

		scanner.close();

		double x = (e * d - b * f)/(a * d - b * c);
		double y = (a * f - e * c)/(a * d - b * c);

		System.out.println("Solution: ");
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}
}
