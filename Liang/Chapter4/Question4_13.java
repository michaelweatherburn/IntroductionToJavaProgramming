import java.util.Scanner;
public class Question4_13
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter a letter: ");
    char inputCharacter = scannerObject.next().charAt(0);

    if(Character.isLetter(inputCharacter))
    {
      if(inputCharacter == 'a' || inputCharacter == 'e' || inputCharacter == 'i' || inputCharacter == 'o' || inputCharacter == 'u' || inputCharacter == 'A' || inputCharacter == 'E' || inputCharacter == 'I' || inputCharacter == 'O' || inputCharacter == 'U')
      {
        System.out.println(inputCharacter + " is a vowel. ");
      }
      else
      {
        System.out.println(inputCharacter + " is a consonant.");
      }
    }
    else
    {
      System.out.println(inputCharacter + " is invalid input. ");
    }
  }
}
