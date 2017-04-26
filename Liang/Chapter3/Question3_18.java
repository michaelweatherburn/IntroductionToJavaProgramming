import java.util.Scanner;

public class Question3_18
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    double costOfShipping = 0.0;
    double weightInPounds;

    System.out.print("Enter the weight of the product. ");
    weightInPounds = scannerObject.nextDouble();

    if(weightInPounds > 0 && weightInPounds <= 1)
      costOfShipping = 3.5;
    else if(weightInPounds > 1 && weightInPounds <= 3)
      costOfShipping = 5.5;
    else if(weightInPounds > 3 && weightInPounds <= 10)
      costOfShipping = 8.5;
    else if(weightInPounds > 10 && weightInPounds <= 20)
      costOfShipping = 10.5;
    else if(weightInPounds > 50)
      costOfShipping = -1.0;
    else
      costOfShipping = -2.0;

    if(costOfShipping == -1)
    {
      System.out.print("The package cannot be shipped. ");
    }
  else if(costOfShipping == -2)
    {
      System.out.print("Invalid weight entered. ");
    }
  else
    {
      System.out.print("Shipping Cost: " + costOfShipping);
    }
  }
}
