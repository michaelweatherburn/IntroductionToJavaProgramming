import java.util.Scanner;

//incomplete
public class FahrenheitToCelsius
{
		public static void main(String[] args)
		{
			//create a Scanner object
			Scanner scanner = new Scanner(System.in);

			double fahrenheit;
			double celsius;

			System.out.println("Enter the value in Fahrenheit: ");
			fahrenheit = scanner.nextDouble();
			scanner.close();

			celsius = (5.0 / 9.0) * (fahrenheit - 32);

			System.out.println("Equivalents in Celsius: " + celsius);
		}
}
