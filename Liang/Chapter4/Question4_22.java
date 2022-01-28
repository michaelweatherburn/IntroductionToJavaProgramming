import java.util.Scanner;
public class Question4_22
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter string s1: ");
    String firstString = scanner.nextLine();

    System.out.print("Enter string s2: ");
    String secondString = scanner.nextLine();

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
