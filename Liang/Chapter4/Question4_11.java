import java.util.Scanner;
public class Question4_11
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.print("Enter an integer between 0 and 15: ");
    int number = scannerObject.nextInt();

    if(number >= 10 && number <= 15)
    {
      System.out.println("The hex value is " + (char)(number - 10 + 65));
    }
    else if(number >= 0 && number <= 9)
    {
      System.out.println("The hex value is " + (char)(number + 48));
    }
    else
    {
      System.out.println(number + "is an invalid input. ");
    }
  }
}
