import java.util.Scanner;
public class Question3_20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the temperature in Farhenheit between -58\u00B0F and 42\u00B0F: ");
		double temperature = scanner.nextDouble();

		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = scanner.nextDouble();

		scanner.close();

		boolean isTemperatureInputValid = -58.0 < temperature && temperature < 41.0;
		boolean isWindSpeedInputValid = 2.0 <= windSpeed;

		if (!isTemperatureInputValid && !isWindSpeedInputValid) {
			System.out.println("The temperature and wind speed inputs are invalid. ");
		} else if (!isTemperatureInputValid) {
			System.out.println("The temperature input is invalid. ");
		} else if (!isWindSpeedInputValid) {
			System.out.println("The wind speed input is invalid. ");
		} else {
			double windChillTemperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			System.out.println("The wind chill index is " + (int) (windChillTemperature * 100000) / 100000.0);
		}
	}
}