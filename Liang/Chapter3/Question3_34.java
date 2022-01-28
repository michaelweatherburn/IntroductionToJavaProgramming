import java.util.Scanner;
/* make it a two step process:

1) use the code from Question3_32 to figure out whether the point lies on the line
2) Figure out its distance from p2 and p0. That must be less than the distance between p1 and p0.
3) There is also a possibility that p2 is closer to p0 than p1 is, but from the opposite side of the line. That is where the derivation of changing frame of reference comes into picture
*/
public class Question3_34
{
	static public void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double x0, y0, x1, y1, x2, y2;

		System.out.print("Enter the first and second point, as well as the point which has to be checked. ");
		x0 = scanner.nextDouble();
		y0 = scanner.nextDouble();
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();
		scanner.close();

		boolean isPointOnTheLine = (y2 - y0)*(x1 - x0) - (x2 - x0)*(y1 - y0) == 0;
		boolean isDistancePositive = (x2 - x0)*(x1 - x0) + (y2 - y0)*(y1 - y0) > 0;
		boolean isDistanceWithinLimit = Math.pow(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2), 0.5) > Math.pow(Math.pow(x2 - x0, 2) + Math.pow(y2 - y0, 2), 0.5);



		System.out.println("isPointOnTheLine: " + isPointOnTheLine);
		System.out.println("isDistancePositive: " +isDistancePositive);
		System.out.println("isDistanceWithinLimit: " + isDistanceWithinLimit);

		if(isPointOnTheLine && isDistancePositive && isDistanceWithinLimit)
		{
			//the lazy load && operator will only check for the truth value of a boolean if the previous boolean returned a true value :)
				System.out.println("The point (" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + "). ");
		}
		else
		{
				System.out.println("The point (" + x2 + ", " + y2 + ") is not on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + "). ");
		}
	}
}
