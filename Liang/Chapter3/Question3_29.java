import java.util.Scanner;

public class Question3_29
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		double x1, y1, r1, x2, y2, r2;

		System.out.print("Enter r1's center's co-ordinates, radius: ");
		x1 = scannerObject.nextDouble();
		y1 = scannerObject.nextDouble();
		r1 = scannerObject.nextDouble();

		System.out.print("Enter r2's center's co-ordinates, radius: ");
		x2 = scannerObject.nextDouble();
		y2 = scannerObject.nextDouble();
		r2 = scannerObject.nextDouble();

		scannerObject.close();

		double distanceBetweenCenters = Math.pow( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		if(distanceBetweenCenters < Math.abs(r2 - r1))
			System.out.print("circle2 is inside circle1");
		else if(distanceBetweenCenters < Math.abs(r2 + r1))
			System.out.print("circle2 overlaps circle1.");
		else
			System.out.print("circle1 is outside circle2");
	}
}
