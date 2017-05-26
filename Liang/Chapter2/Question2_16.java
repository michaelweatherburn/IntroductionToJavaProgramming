import java.util.Scanner;

public class Question2_16
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double sideOfHexagon, areaOfHexagon;
    System.out.print("Enter the side: ");
    sideOfHexagon = scannerObject.nextDouble();

    areaOfHexagon = 1.5 * Math.pow(3, 0.5) * Math.pow(sideOfHexagon, 2);

    System.out.println("The area of hexagon is " + areaOfHexagon);
  }
}
