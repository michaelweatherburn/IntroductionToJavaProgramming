import java.util.Scanner;

public class Question2_19
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//calculate the area of a triangle using Heron's formula

		double x1, y1, x2, y2, x3, y3;
		double side1, side2, side3;
		double s, area;

		System.out.print("Enter three points for the triangle: ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();

		scanner.close();

		side1 = Math.pow( Math.pow(x1 - x2 , 2) + Math.pow(y1 - y2, 2), 0.5);
		side2 = Math.pow( Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
		side3 = Math.pow( Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);

		s = (side1 + side2 + side3)/2;

		area = Math.pow( s * (s - side1) * (s - side2) * (s - side3), 0.5);

		System.out.println("The area of the triangle is " + area);
	}
}
