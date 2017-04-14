import java.util.Scanner;
public class Question2_4
{
  private static final double KILOGRAMS_PER_POUND = 0.454;
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    double kilograms, pounds;
    System.out.print("Enter a number in pounds: ");
    pounds = scannerObject.nextDouble();

    kilograms = KILOGRAMS_PER_POUND * pounds;
    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}
