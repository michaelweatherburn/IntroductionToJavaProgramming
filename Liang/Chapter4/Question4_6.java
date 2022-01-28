import java.util.Scanner;
public class Question4_6
{
  static final double CIRCLE_RADIUS = 40.0;
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    double angle1, angle2, angle3, x1, y1, x2, y2, x3, y3, a, b, c, A, B, C;

    //create three random angles
    angle1 = Math.random() * 2 * Math.PI;
    angle2 = Math.random() * 2 * Math.PI;
    angle3 = Math.random() * 2 * Math.PI;

    //create three points from those angles
    x1 = CIRCLE_RADIUS * Math.cos(angle1);
    y1 = CIRCLE_RADIUS * Math.sin(angle1);

    x2 = CIRCLE_RADIUS * Math.cos(angle2);
    y2 = CIRCLE_RADIUS * Math.sin(angle2);

    x3 = CIRCLE_RADIUS * Math.cos(angle3);
    y3 = CIRCLE_RADIUS * Math.sin(angle3);

    //find the lengths of the sides of the triangle so formed
    a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    b = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
    c = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

    A = Math.acos((Math.pow(c,2) + Math.pow(b,2) - Math.pow(a,2)) / (2 * b * c));
    B = Math.acos((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2 * c * a));
    C = Math.acos((Math.pow(b,2) + Math.pow(a,2) - Math.pow(c,2)) / (2 * a * b));

    A = Math.toDegrees(A);
    B = Math.toDegrees(B);
    C = Math.toDegrees(C);

    System.out.println("The angles in the triangle are: " + A + " " + B + " " + C);

    //theoretically, arrange all the angles made by the points with respect to the positive X-axis in the ascending order and then calculating the angles from them does not seem like such a bad option

    //beginning brute-force bubble sort
    double temp;
    if(angle2 > angle3)
    {
      temp = angle2;
      angle2 = angle3;
      angle3 = temp;
    }
    if(angle1 > angle2)
    {
      temp = angle1;
      angle1 = angle2;
      angle2 = temp;
    }
    if(angle2 > angle3)
    {
      temp = angle2;
      angle2 = angle3;
      angle3 = temp;
    }

    // System.out.println("Angles in increasing order: " + Math.toDegrees(angle1) + " " + Math.toDegrees(angle2) + " " + Math.toDegrees(angle3));
    System.out.println("The angles in alternate method are: " + Math.toDegrees(angle2 - angle1)/2.0 + " " + Math.toDegrees(angle3 - angle2)/2.0 + " " + Math.toDegrees(2 * Math.PI - angle3 + angle1)/2.0);
  }
}
