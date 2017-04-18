import java.util.Scanner;

public class SimpleIfDemo
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    int number = scannerObject.nextInt();

    if(number % 2 == 0)
      System.out.println("This number is divisible by 2. ");
      {
    }

    if(number % 5 == 0)
    {
      System.out.println("This number is divisible by 5. ");
    }
  }
}
