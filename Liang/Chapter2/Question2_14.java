import java.util.Scanner;
public class Question2_14
{
	private final static double KILOGRAMS_PER_POUND = 0.4539237;
	private final static double METERS_PER_INCH = 0.0254;
	public static void main(String[] args){
		Scanner scannerObject = new Scanner(System.in);
		double bodyMassIndex, weightInPounds, weightInKilograms, heightInInches, heightInMeters;

		System.out.println("Enter weight in pounds: ");
		weightInPounds = scannerObject.nextDouble();

		System.out.println("Enter height in inches: ");
		heightInInches = scannerObject.nextDouble();

		scannerObject.close();

		weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		heightInMeters = heightInInches * METERS_PER_INCH;

		bodyMassIndex = weightInKilograms / Math.pow(heightInMeters, 2);

		System.out.println("BMI is " + bodyMassIndex);
	}
}
//producing quite a different result from the one given in the book. Probably due to using Math.pow() method. Note to self: look into this later
