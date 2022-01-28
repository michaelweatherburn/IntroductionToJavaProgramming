import java.util.Scanner;
public class Question2_23
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double distance, fuelEfficiency, mileage, costOfTrip;

		System.out.println("Enter the driving distance in miles: ");
		distance = scanner.nextDouble();

		System.out.println("Enter miles per gallon: ");
		mileage = scanner.nextDouble();

		System.out.println("Enter price per gallon: ");
		fuelEfficiency = scanner.nextDouble();

		scanner.close();

		costOfTrip = distance / mileage * fuelEfficiency;

		//since this is a cost, we have to reduce the precision to two digits after the decimal
		costOfTrip = (int) (costOfTrip * 100.0) / 100.0;

		System.out.println("The cost of driving: $" + costOfTrip);
	}
}
