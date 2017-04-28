import java.util.Scanner;

public class Question3_33
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    double firstPackageWeight, secondPackageWeight, firstPackagePrice, secondPackagePrice;

    System.out.print("Enter weight and price for package 1. ");
    firstPackageWeight = scannerObject.nextDouble();
    firstPackagePrice = scannerObject.nextDouble();

    System.out.print("Enter weight and price for package 2. ");
    secondPackageWeight = scannerObject.nextDouble();
    secondPackagePrice = scannerObject.nextDouble();

    if((firstPackageWeight/firstPackagePrice) > (secondPackageWeight/secondPackagePrice))
    {
      System.out.println("Package 1 has a better price. ");
    }
    else if((firstPackageWeight/firstPackagePrice) == (secondPackageWeight/secondPackagePrice))
    {
      System.out.println("Both packages have the same price. ");
    }
    else
    {
      System.out.println("Package 2 has a better price. ");
    }
  }
}
