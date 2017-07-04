import java.util.Scanner;
public class Question4_9
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char character = scannerObject.next().charAt(0);
    System.out.println("The Unicode for that particular character is " + (int)character);
  }
}
