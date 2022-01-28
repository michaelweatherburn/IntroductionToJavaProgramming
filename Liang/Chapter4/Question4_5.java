import java.util.Scanner;
public class Question4_5
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of sides: ");
    double numberOfSides = scanner.nextDouble();
    System.out.println("Enter the side: ");
    double side = scanner.nextDouble();

    double areaOfPolygon = (numberOfSides * Math.pow(side, 2))/(4 * Math.tan(Math.PI / numberOfSides));
    System.out.println("The area of the polygon is " + areaOfPolygon);
  }
}
