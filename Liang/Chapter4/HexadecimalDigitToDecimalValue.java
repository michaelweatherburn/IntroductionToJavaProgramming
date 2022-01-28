import java.util.Scanner;

public class HexadecimalDigitToDecimalValue
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a hexadecimal digit. ");
    String userInput = scanner.next();

    if(userInput.length() > 1)
    {
      System.out.println("You must enter exactly one hexadecimal character. ");
    }
    else if(!(userInput.charAt(0) >= 48 && userInput.charAt(0) <= 57 || userInput.charAt(0) >= 65 && userInput.charAt(0) <= 70 || userInput.charAt(0) >= 97 && userInput.charAt(0) <= 102))
    {
      //I know, I know, too many calls to a method. I should store the value of the first character in a variable instead. This is a quick solution, not a comprehensive one.
      System.out.println("You must enter a valid hexadecimal digit. ");
    }
    else
    {
      System.out.print("The decimal value for hex digit " + userInput.charAt(0) + ": ");
      switch(userInput.charAt(0))
      {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          System.out.print(userInput.charAt(0));
          break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
          System.out.println(userInput.charAt(0) - 87);
          break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
          System.out.println(userInput.charAt(0) - 55);
          break;
      }
    }
  }
}
