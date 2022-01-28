import java.util.Scanner;

public class Question3_23
{
	private final static double RECTANGLE_WIDTH = 10;
	private final static double RECTANGLE_HEIGHT = 5;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double x, y;
		System.out.print("Enter the x and y co-ordinates of the point. ");

		x = scanner.nextDouble();
		y = scanner.nextDouble();
		scanner.close();

		System.out.print("Point " + x + ", " + y + " is ");
		if(x > -RECTANGLE_WIDTH / 2 && x < RECTANGLE_WIDTH/2 && y > -RECTANGLE_HEIGHT/2 && y < RECTANGLE_HEIGHT/2)
		{
			System.out.print("in the rectangle. ");
		}
		else
		{
			System.out.print("not in the rectangle. ");
		}
	}
}
