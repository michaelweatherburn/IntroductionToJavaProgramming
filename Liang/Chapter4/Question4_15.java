import java.util.Scanner;
public class Question4_15
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a letter: ");
    char character = scanner.next().charAt(0);
    int correspondingNumber = 0;
    String englishAlphabetLowerCase = "abcdefghijklmnopqrstuvwxyz";
    String englishAlphabetUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabetInUse = null;

    if(Character.isLetter(character))
    {
      if(Character.isUpperCase(character))
      {
        alphabetInUse = englishAlphabetUpperCase;
      }
      else if(Character.isLowerCase(character))
      {
        alphabetInUse = englishAlphabetLowerCase;
      }

      if(alphabetInUse.substring(0,3).indexOf(character) != -1)
      {
        correspondingNumber = 2;
      }
      else if(alphabetInUse.substring(3,6).indexOf(character) != -1)
      {
        correspondingNumber = 3;
      }
      else if(alphabetInUse.substring(6,9).indexOf(character) != -1)
      {
        correspondingNumber = 4;
      }
      else if(alphabetInUse.substring(9,12).indexOf(character) != -1)
      {
        correspondingNumber = 5;
      }
      else if(alphabetInUse.substring(12,15).indexOf(character) != -1)
      {
        correspondingNumber = 6;
      }
      else if(alphabetInUse.substring(15,19).indexOf(character) != -1)
      {
        correspondingNumber = 7;
      }
      else if(alphabetInUse.substring(19,22).indexOf(character) != -1)
      {
        correspondingNumber = 8;
      }
      else if(alphabetInUse.substring(22).indexOf(character) != -1)
      {
        correspondingNumber = 9;
      }

      System.out.println("The corresponding number is " + correspondingNumber);
    }
    else
    {
      System.out.println(character + " is an invalid input. ");
    }
  }
}
//the real question is: how do I prevent myself from using the above hardcoded numbers to achieve the result?
