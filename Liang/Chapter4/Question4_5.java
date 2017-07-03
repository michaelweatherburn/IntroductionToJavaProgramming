import java.util.Scanner;
public class Question4_5
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter the number of sides: ");
    double numberOfSides = scannerObject.nextDouble();
    System.out.println("Enter the side: ");
    double side = scannerObject.nextDouble();

    double areaOfPolygon = (numberOfSides * Math.pow(side, 2))/(4 * Math.tan(Math.PI / numberOfSides));
    System.out.println("The area of the polygon is " + areaOfPolygon);
  }
}
