import java.util.Scanner;
public class ComputeAngles
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double x1, y1, x2, y2, x3, y3, a, b, c, A, B, C;

    System.out.println("Enter the three points in the format: x1 y1 x2 y2 x3 y3");
    x1 = scannerObject.nextDouble();
    y1 = scannerObject.nextDouble();
    x2 = scannerObject.nextDouble();
    y2 = scannerObject.nextDouble();
    x3 = scannerObject.nextDouble();
    y3 = scannerObject.nextDouble();

    c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
    b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    C = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a * b)));
    A = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2 * b * c)));
    B = Math.toDegrees(Math.acos((Math.pow(c, 2) + Math.pow(a, 2) - Math.pow(b, 2))/(2 * c * a)));

    C = Math.rint(C * 100) / 100.0;
    A = Math.rint(A * 100) / 100.0;
    B = Math.rint(B * 100) / 100.0;
    //This will become a regular thing from now on. Since we are now exposed to rounding methods, we'll create a custom method to round a number to a particular number of digits after the decimal point.

    System.out.println("The three angles are: " + A + " " + B + " " + C);
  }
}
