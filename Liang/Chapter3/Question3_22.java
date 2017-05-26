import java.util.Scanner;

public class Question3_22
{
  private static final double CIRCLE_RADIUS = 10.0;
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    double x, y;
    System.out.print("Enter the coordinates of the point, in (x, y) format: ");
    x = scannerObject.nextDouble();
    y = scannerObject.nextDouble();

    if(Math.pow(x * x + y * y, 0.5) < CIRCLE_RADIUS)
    {
      System.out.print("Point (" + x + ", " + y + ") is inside the circle. ");
    }
    else
    {
      System.out.print("Point (" + x + ", " + y + ") is outside the circle. ");
    }
  }
}
