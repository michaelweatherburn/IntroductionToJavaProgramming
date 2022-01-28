import java.util.Scanner;

public class Question3_25
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double a, b, c, d, e, f;
		double x, y;
		double x1, y1, x2, y2, x3, y3, x4, y4, denominator;

		System.out.print("Enter the co-ordinates of the points on the first line. ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();

		System.out.print("Enter the co-ordinates of the points on the second line. ");
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		x4 = scanner.nextDouble();
		y4 = scanner.nextDouble();

		scanner.close();

		a = y2 - y1;
		b = x1 - x2;
		e = x1 * (y2 - y1) - y1 * (x2 - x1);

		c = y4 - y3;
		d = x3 - x4;
		f = x3 * (y4 - y3) - y3 * (x4 - x3);

		denominator = a * d - b * c;
		if(denominator == 0)
		{
			System.out.print("The two lines are parallel (they'll never intersect.) ");
		}
		else
		{
			x = (e * d - b * f) / denominator;
			y = (a * f - e * c) / denominator;

			System.out.print("The two lines intersect at " + x + ", " + y);
		}
	}
}
