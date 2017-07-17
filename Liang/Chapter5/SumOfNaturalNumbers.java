import java.util.Scanner;
public class SumOfNaturalNumbers
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter the number of terms until which you wish to calculate the sum. ");
    int sum = 0;
    int count;
    int numberOfTerms = scannerObject.nextInt();

    if(numberOfTerms < 0)
    {
      System.out.println("Number of terms cannot be negative. ");
    }
    else
    {
      for(count = 1; count <= numberOfTerms; count++)
      {
        sum = sum + count;
      }

      System.out.println("The sum of the first " + numberOfTerms + " natural numbers is " + sum);
    }
  }
}
