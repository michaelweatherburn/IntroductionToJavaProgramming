import java.util.Scanner;
public class Question4_15
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter a letter: ");
    char character = scannerObject.next().charAt(0);
    int lowerCaseStartingCharacter = 65;
    int upperCaseStartingCharacter = 97;

    if(Character.isLowerCase(character))
    {

    }
    else if(Character.isUpperCase(character))
    {

    }
    else
    {
      System.out.println(character + " is an invalid input. ");
    }
  }
}
