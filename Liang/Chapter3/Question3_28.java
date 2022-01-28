import java.util.Scanner;
//working on the assumption that the sides of the rectangles are parallel to the axes, and that r1 IS larger than r2 (like, way larger)
public class Question3_28
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double x1, y1, w1, h1;
		double x2, y2, w2, h2;

		System.out.print("Enter r1's co-ordinates, width, and height: ");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		w1 = scanner.nextDouble();
		h1 = scanner.nextDouble();

		System.out.print("Enter r2's co-ordinates, width and height: ");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		w2 = scanner.nextDouble();
		h2 = scanner.nextDouble();

		scanner.close();

		if((Math.abs(x2 - x1) <= (w1 - w2) / 2.0) && (Math.abs(y2 - y1) <= (h1 - h2) / 2.0))
			System.out.print("r2 is inside r1."); //maybe it touches the periphery, that's why the equals sign is for
		else if((Math.abs(x2 - x1) < (w1 + w2) / 2.0) && (Math.abs(y2 - y1) < (h1 + h2) / 2.0))
			System.out.print("r2 overlaps r1. ");
		else
			System.out.print("r2 does not overlap r1.");
	}
}
