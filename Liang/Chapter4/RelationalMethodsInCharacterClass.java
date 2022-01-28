import java.util.Scanner;
public class RelationalMethodsInCharacterClass
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a character. ");
    char inputCharacter = scanner.nextLine().charAt(0);
    if(Character.isLetterOrDigit(inputCharacter))
    {
      //this is a digit/letter
      if(Character.isDigit(inputCharacter))
      {
        System.out.println("This is a digit. ");
      }
      else if(Character.isLetter(inputCharacter))
      {
        if(Character.isUpperCase(inputCharacter))
        {
          System.out.println("This is an uppercase character. ");
        }
        else if(Character.isLowerCase(inputCharacter))
        {
          System.out.println("This is a lowercase character. ");
        }
      }
    }
    else
    {
      System.out.println("This is a special character. ");
    }
  }
}
