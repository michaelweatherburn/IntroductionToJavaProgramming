import java.util.Scanner;

public class Question3_20
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double windChillTemperature, windSpeed, temperature;

		System.out.print("Enter the outside temperature. (It should be between -58F and 41F. ) ");
		temperature = scanner.nextDouble();
		scanner.close();

		if(!(temperature > -58 && temperature < 41))
		{
			System.out.print("Invalid outside temperature entered. The program will now exit. ");
			System.exit(1);
		}

		System.out.print("Enter the wind speed. (It must be >= 2). ");
		windSpeed = scanner.nextDouble();

		if(!(windSpeed >= 2))
		{
			System.out.print("Invalid wind speed entered. The program will now exit. ");
			System.exit(1);
		}

		windChillTemperature = 35.74 + 0.6215 * temperature + 0.4275 * temperature * Math.pow(windSpeed, 0.16) - 35.75 * Math.pow(windSpeed, 0.16);

		System.out.println("Required wind-chill temperature: " + windChillTemperature);
	}
}
