import java.util.Scanner;

public class Question2_15
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    double x1, y1, x2, y2;
    System.out.print("Enter x1 and y1: ");
    x1 = scannerObject.nextDouble();
    y1 = scannerObject.nextDouble();

    System.out.print("Enter x2 and y2: ");
    x2 = scannerObject.nextDouble();
    y2 = scannerObject.nextDouble();

    scannerObject.close();

    double distance = Math.pow( Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2), 0.5);

    System.out.println("The distance between the two points is " + distance);
  }
}
