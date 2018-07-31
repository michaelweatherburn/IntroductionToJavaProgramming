public class Question6_8 {
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5.0) * celsius + 32.0;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9.0) * (fahrenheit - 32.0);
	}

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s|%20s%20s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		System.out.printf("%-20s%-20s|%20s%20s\n", "--------------------", "--------------------", "--------------------", "--------------------");
		double celsius = 40.0, fahrenheit = 120.0;
		for (int i = 1; i <= 10; i++, celsius -= 1.0, fahrenheit -= 10.0) {
					System.out.printf("%-20.1f%-20.1f|%20.1f%20.2f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
		}
	}

	 
}