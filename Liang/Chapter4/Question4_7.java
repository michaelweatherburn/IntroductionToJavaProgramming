import java.util.Scanner;
public class Question4_7
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the radius of the bounding circle: ");
    double radius = scanner.nextDouble();

    //calculate the numbers:
    double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5;

    x1 = radius * Math.cos(Math.PI / 10);
    y1 = radius * Math.sin(Math.PI / 10);

    x2 = radius * Math.cos(Math.PI / 2);
    y2 = radius * Math.sin(Math.PI / 2);

    x3 = -1 * radius * Math.cos(Math.PI / 10);
    y3 = radius * Math.sin(Math.PI / 10);

    x4 = -1 * radius * Math.cos(3 * Math.PI / 10);
    y4 = -1 * radius * Math.sin(3 * Math.PI / 10);

    x5 = radius * Math.cos(3 * Math.PI / 10);
    y5 = -1 * radius * Math.sin(3 * Math.PI / 10);

    System.out.println("The co-ordinates of five points on the bounded pentagon are: ");
    System.out.printf("(%6.4f, %6.4f)", x1, y1);
    System.out.printf("\n(%6.4f, %6.4f)", x2, y2);
    System.out.printf("\n(%6.4f, %6.4f)", x3, y3);
    System.out.printf("\n(%6.4f, %6.4f)", x4, y4);
    System.out.printf("\n(%6.4f, %6.4f)", x5, y5);

    //I drew diagrams and pre-calculated the exact angle each point makes with respect to the positive X-axis, that is why results are a little different from the ones in the book
  }
}
