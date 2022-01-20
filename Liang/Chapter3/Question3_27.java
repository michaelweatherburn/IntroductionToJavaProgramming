import java.util.Scanner;

/*
	This is a really interesting question, because to create a generic version of it would require:

	1) Have the generic ax + by = c versions of three lines that form the triangle.
	2) Check to see whether any of these lines are parallel to the x-axis or y-axis (because for them the checking is different)
	3) Check to see on which side of the line do the points fall on

	At some point in the future, I'll create a complete implementation of just that. For now, we'll solve this problem with the given (specific) input.

*/
public class Question3_27
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		double x, y;

		//take input from the user
		System.out.print("Enter the co-ordinates of the point. ");
		x = scannerObject.nextDouble();
		y = scannerObject.nextDouble();
		scannerObject.close();

		//first things first: check whether the point lies in the first quadrant
		//after that bring in the calculated value of y from the third equation (hypotenuse)
		if(x > 0 && y > 0 && y < (200 - x) / 2)
		{
			System.out.println("The point is in the triangle. ");
		}
		else
		{
			System.out.println("The point is outside the triangle. ");
		}
	}
}
