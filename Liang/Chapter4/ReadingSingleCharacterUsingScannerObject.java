import java.util.Scanner;

public class ReadingSingleCharacterUsingScannerObject
{
  public static void main(String[] args)
  {
    char characterToStore = ' ';
    Scanner scannerObject = new Scanner(System.in);
    //step 1. Prompt user to enter a single character
    System.out.println("Enter a single character. ");

    //step 2. Read the line that follows:
    String userInput = scannerObject.nextLine();

    //step 3 (Optional) Check whether the stringlength is 1. It maybe required for the user to enter only one character.

    if(userInput.length() == 1)
    {
      //step 4. Store the first character of the 1-lengthed String into a character...
      characterToStore = userInput.charAt(0);
      System.out.println("The required character: " + characterToStore);
    }
    else
    {
      // ...if the result of step 3 was true: else, show an error message.
      System.out.println("The input that you've provided contains an improper number of characters. You were asked for 1 character. The program will now exit. ");
    }
  }
}
