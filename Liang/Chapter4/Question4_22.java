import java.util.Scanner;
public class Question4_22
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter string s1: ");
    String firstString = scannerObject.nextLine();

    System.out.print("Enter string s2: ");
    String secondString = scannerObject.nextLine();

    if(firstString.contains(secondString))
    {
      System.out.println(secondString + " is a substring of " + firstString);
    }
    else
    {
      System.out.println(secondString + " is not a substring of " + firstString);
    }
  }
}
