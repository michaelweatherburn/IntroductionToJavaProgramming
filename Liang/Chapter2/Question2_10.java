import java.util.Scanner;
//calculates the energy required to heat water from an initial temperature to a final temperature
public class Question2_10
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double energyRequired, massOfWater, initialTemperature, finalTemperature;

		System.out.print("Enter the amount of water in kilograms: ");
		massOfWater = scanner.nextDouble();

		System.out.print("Enter the initial temperature: ");
		initialTemperature = scanner.nextDouble();

		System.out.print("Enter the final temperature: ");
		finalTemperature = scanner.nextDouble();

		scanner.close();

		energyRequired = massOfWater * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is  " + energyRequired);
	}
}
