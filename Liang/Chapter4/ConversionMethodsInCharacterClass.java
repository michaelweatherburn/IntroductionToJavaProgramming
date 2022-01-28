import java.util.Scanner;

public class ConversionMethodsInCharacterClass
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    //this method returns the opposite case of whatever case you passed it.

    System.out.println("Enter a letter. ");
    char inputCharacter = scanner.nextLine().charAt(0);

    if(Character.isLetter(inputCharacter))
    {
      if(Character.isLowerCase(inputCharacter))
      {
        System.out.println("Uppercase equivalent: " + Character.toUpperCase(inputCharacter));
      }
      else if(Character.isUpperCase(inputCharacter))
      {
        System.out.println("Lowercase equivalent: " + Character.toLowerCase(inputCharacter));
      }
    }
    else
    {
      System.out.println("The entered character is not a letter. ");
    }
  }
}
