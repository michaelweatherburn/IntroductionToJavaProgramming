import java.util.Scanner;
//another great Question

/* solving this fully would require knowledge of creating new frames of reference from existing frames of reference

Representing a point on a plane using the (r, theta) notation instead of the (x,y) notation. Changing frame of reference by an angle of theta. Moving the origin from (0,0) to (x1, y1).

After that, from the new frame of reference, if the point has an y-value more than 0, then the point is to the left of the line, else if y-value is less than 0, it is to the right of the line

Derivation of that inequality is key to solving the problem.

*/

public class Question3_32
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double x0, y0, x1, y1, x2, y2;

    System.out.print("Enter three points for p0, p1 and p2: ");
    x0 = scannerObject.nextDouble();
    y0 = scannerObject.nextDouble();
    x1 = scannerObject.nextDouble();
    y1 = scannerObject.nextDouble();
    x2 = scannerObject.nextDouble();
    y2 = scannerObject.nextDouble();
    scannerObject.close();

    if((y2 - y0)*(x1 - x0) - (x2 - x0)*(y1 - y0) > 0)
    {
      System.out.println("The point (" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + "). ");
    }
    else if((y2 - y0)*(x1 - x0) - (x2 - x0)*(y1 - y0) == 0)
    {
      System.out.println("The point (" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + "). ");
    }
    else
    {
      System.out.println("The point (" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + "). ");
    }

  }
}
