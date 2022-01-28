import java.util.Scanner;

public class Question1_12
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the distance in miles. ");
		double distanceMiles = scanner.nextDouble();
		double distanceKilometers = distanceMiles * 1.6;

		System.out.println("Enter time as directed. ");
		System.out.print("Hours: ");
		double hours =scanner.nextDouble();

		System.out.print("Minutes: ");
		double minutes =scanner.nextDouble();

		System.out.print("Seconds: ");
		double seconds = scanner.nextDouble();

		scanner.close();

		hours = hours + minutes / 60 + seconds / 3600;
		double average = distanceKilometers / hours;

		System.out.println("Average Speed: " + average);
	}
}
