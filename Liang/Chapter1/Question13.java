import java.util.Scanner;

public class Question13
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter the the coefficients of the first equation. ");
    System.out.print("x's coefficient: ");
    double a = scannerObject.nextDouble();

    System.out.print("y's coefficient");
    double b = scannerObject.nextDouble();

    System.out.print("constant term: ");
    double e = scannerObject.nextDouble();

    System.out.println("Enter the coefficients of the second equation. ");
    System.out.print("x's coefficient");
    double c = scannerObject.nextDouble();

    System.out.print("y's coefficient");
    double d = scannerObject.nextDouble();

    System.out.print("constant term: ");
    double f = scannerObject.nextDouble();

    double x = (e * d - b * f)/(a * d - b * c);
    double y = (a * f - e * c)/(a * d - b * c);

    System.out.println("Solution: ");
    System.out.println("x: " + x);
    System.out.println("y: " + y);

  }
}
