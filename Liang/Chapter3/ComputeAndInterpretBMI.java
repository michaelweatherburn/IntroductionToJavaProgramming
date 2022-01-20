import java.util.Scanner;
public class ComputeAndInterpretBMI {

	private final static double METERS_PER_INCH = 0.0254;
	private final static double KILOGRAMS_PER_POUND = 0.45359237;

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);

		String interpretation;
		double BMI, weightInPounds, heightInInches, weightInKilograms, heightInMeters;

		System.out.print("Enter your weight in pounds. ");
		weightInPounds = scannerObject.nextDouble();

		System.out.print("Enter your height in inches. ");
		heightInInches = scannerObject.nextDouble();

		scannerObject.close();

		weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		heightInMeters = heightInInches * METERS_PER_INCH;

		BMI = weightInKilograms / Math.pow(heightInMeters, 2);
		if(BMI < 18.5)
		{
			interpretation  = "Underweight";
		}
		else if(BMI < 25.0) //else ensures that BMI is now >= 18.5, and...
		{
			interpretation  = "Normal";
		}
		else if(BMI < 30.0) //else ensures that BMI is now >= 25.0, and...
		{
			interpretation  = "Overweight";
		}
		else
		{
			interpretation  = "Obese";
		}

		System.out.println("BMI: " + BMI);
		System.out.println("You are " + interpretation);
	}
}
