import java.util.Scanner;
//calculates the energy required to heat water from an initial temperature to a final temperature
public class Question2_10
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double energyRequired, massOfWater, initialTemperature, finalTemperature;

    System.out.print("Enter the amount of water in kilograms: ");
    massOfWater = scannerObject.nextDouble();

    System.out.print("Enter the initial temperature: ");
    initialTemperature = scannerObject.nextDouble();

    System.out.print("Enter the final temperature: ");
    finalTemperature = scannerObject.nextDouble();

    scannerObject.close();

    energyRequired = massOfWater * (finalTemperature - initialTemperature) * 4184;

    System.out.println("The energy needed is  " + energyRequired);
  }
}
