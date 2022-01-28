import java.util.Scanner;
public class Question4_1
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the length of a pentagon from the center to the vertex. ");
    double radius = scanner.nextDouble();
    double area = Math.pow(radius, 2) * 2.5 * Math.sin((Math.PI * 2.0)/5.0);

    //alternative: using System.out.printf() to display rounded-off output
    System.out.printf("\nThe area of the pentagon is %.2f\n", area);

    //usual method: taking help from the Math.round()/Math.rint() methods to round off the output
    area = (double)Math.round(area * 100) / 100.0;
    System.out.println("The area of the pentagon is " + area);
  }
}
