import java.util.Scanner;
public class Question4_20
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scannerObject.nextLine();

    System.out.println("First Character of the String: " + input.charAt(0));
    System.out.println("Length of the String: " + input.length());
  }
}
