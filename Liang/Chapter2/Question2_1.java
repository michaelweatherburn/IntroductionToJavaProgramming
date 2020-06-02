import java.util.Scanner;
public class Question2_1
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.print("Enter a degree in Celsius: ");
    double celsiusValue = scannerObject.nextDouble();

    scannerObject.close();

    double fahrenheitValue = 9.0 * celsiusValue / 5.0 + 32;
    System.out.println(celsiusValue + " Celsius is " + fahrenheitValue + " Fahrenheit. ");
  }
}
