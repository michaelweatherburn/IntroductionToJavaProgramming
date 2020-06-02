import java.util.Scanner;

public class Question2_20
{
  public static void main(String[] main)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter balance and interest rate: (e.g. 3 for 3%): ");
    double balance = scannerObject.nextDouble();
    double interestRatePercentage = scannerObject.nextDouble();
    scannerObject.close();

    double interest = balance * (interestRatePercentage/1200.0);

    System.out.println("The interest is " + interest);
  }
}
