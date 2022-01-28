import java.util.Scanner;
public class Question2_9
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double finalVelocity, initialVelocity, time;

		System.out.print("Enter v0, v1 and t: ");
		initialVelocity = scanner.nextDouble();
		finalVelocity = scanner.nextDouble();
		time = scanner.nextDouble();
		scanner.close();

		double averageAcceleration = (finalVelocity - initialVelocity)/time;
		System.out.println("The average acceleration is " + averageAcceleration);
	}
}
