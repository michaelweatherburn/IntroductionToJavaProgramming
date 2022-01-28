import java.util.Scanner;

public class HexadecimalDigitToDecimalValue2
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
    else if(!(Character.isDigit(userInput.charAt(0)) || userInput.charAt(0) >= 65 && userInput.charAt(0) <= 70 || userInput.charAt(0) >= 97 && userInput.charAt(0) <= 102))
    {
      //I know, I know, too many calls to a method. I should store the value of the first character in a variable instead. This is a quick solution, not a comprehensive one.
      System.out.println("You must enter a valid hexadecimal digit. ");
    }
    else
    {
      System.out.print("The decimal value for hex digit " + userInput.charAt(0) + ": ");
      if(Character.isDigit(userInput.charAt(0)))
          System.out.print(userInput.charAt(0));
      else if(Character.isUpperCase(userInput.charAt(0)))
          System.out.println(userInput.charAt(0) - 'A' + 10);
      else if(Character.isLowerCase(userInput.charAt(0)))
          System.out.println(userInput.charAt(0) - 'a' + 10);
    }
  }
}
