import java.util.Scanner;

public class ComputeAreaWithConstant
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    final double PI = 3.14159;  //declare a named constant

      System.out.println("Enter a radius for the circle. ");
      double radius = scannerObject.nextDouble();

      //compute area
      double area = radius * radius * 3.14159;

      System.out.println("The area of the circle of radius " + radius + " is " + area);
      
  }
}
