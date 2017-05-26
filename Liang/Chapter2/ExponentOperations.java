import java.util.Scanner;

public class ExponentOperations{
  public static void main(String[] args)
  {
    //create a Scanner object
    Scanner scannerObject = new Scanner(System.in);

    //ask for user input
    System.out.println("Enter the number. ");
    double base = scannerObject.nextDouble();

    System.out.println("Enter the exponent you want to raise the number to. ");
    double exponent = scannerObject.nextDouble();

    System.out.println("Answer: " + Math.pow(base, exponent));
  }
}
