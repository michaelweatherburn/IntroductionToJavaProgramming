import java.util.Scanner;

public class TestBooleanOperators
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    //get an integer number from the user
    System.out.print("Enter the integer to be tested. ");
    int input = scannerObject.nextInt();
    scannerObject.close();

    if(input % 2 == 0 && input % 3 == 0)
    {
      //this is logical AND
      System.out.println("This number is divisible by both 2 and 3. ");
      //optimised code: simply divide by 6
    }

    if(input % 2 == 0 || input % 3 == 0)
    {
      //this is logical OR
      System.out.println("This number is divisible by either 2 or 3, or both. ");
    }

    if(input % 2 == 0 ^ input % 3 == 0)
    {
      //this is logical exclusion (!!!), also known as bitwise XOR
      System.out.println("This number is divisible by either 2 or 3, but not both. ");
    }
  }
}
