import java.util.Scanner;

public class Question3_6
{
	private static final double KILOGRAMS_PER_POUND = 0.45359237;
	private static final double METERS_PER_INCH = 0.0254;

	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		int heightInFeet = 0, heightInInches = 0;
		double heightInMeters = 0.0;
		double weightInKilograms = 0.0, weightInPounds = 0.0;
		double BMI = 0.0;

		System.out.print("Enter weight in pounds: ");
		weightInPounds = scannerObject.nextDouble();

		System.out.print("Enter feet: ");
		heightInFeet = scannerObject.nextInt();

		System.out.print("Enter inches: ");
		heightInInches = scannerObject.nextInt();

		scannerObject.close();

		heightInInches = heightInFeet * 12 + heightInInches;
		heightInMeters = heightInInches * METERS_PER_INCH;

		weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;


		BMI =  weightInKilograms /  Math.pow(heightInMeters, 2);
		System.out.println("BMI is " + BMI);

		if(BMI < 18.5)
			System.out.println("Underweight");
		else if(BMI < 25)
			System.out.println("Normal");
		else if(BMI < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
