import java.util.Scanner;

public class Question2_17
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double windchillTemperature, outsideTemperature, windSpeed;

		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F");
		outsideTemperature = scanner.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		windSpeed = scanner.nextDouble();

		scanner.close();

		windchillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);

		System.out.print("The wind chill index is " + windchillTemperature);
	}
}
