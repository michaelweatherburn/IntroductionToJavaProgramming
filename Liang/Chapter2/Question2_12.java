import java.util.Scanner;

public class Question2_12
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double acceleration, takeoffSpeed, minimumRunwayLength;


		System.out.print("Enter speed and acceleration: ");
		takeoffSpeed = scanner.nextDouble();
		acceleration = scanner.nextDouble();
		scanner.close();

		minimumRunwayLength = Math.pow(takeoffSpeed, 2)/(2*acceleration);

		System.out.println("The minimum runway length for this airplan is " + minimumRunwayLength);
	}
}
