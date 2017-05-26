import java.util.Scanner;
public class Question2_2
{
  private static final double PI = 3.14159;

  public static void main(String[] args)
  {

    Scanner scannerObject = new Scanner(System.in);

    double cylinderCrossSectionArea, cylinderRadius, cylinderLength, cylinderVolume;

    System.out.print("Enter the radius and length of the cylinder. ");
    cylinderRadius = scannerObject.nextDouble();
    cylinderLength = scannerObject.nextDouble();

    cylinderCrossSectionArea = PI * cylinderRadius * cylinderRadius;
    cylinderVolume = cylinderCrossSectionArea * cylinderLength;

    System.out.println("The area is " + cylinderCrossSectionArea);
    System.out.println("The volume is " + cylinderVolume);
  }
}
