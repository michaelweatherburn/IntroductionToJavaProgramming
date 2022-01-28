import java.util.Scanner;
public class Question4_21
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a SSN: ");
    String enteredString = scanner.next();

    if(enteredString.length() == 11 && enteredString.charAt(3) == '-' && enteredString.charAt(6) == '-' && Character.isDigit(enteredString.charAt(0)) && Character.isDigit(enteredString.charAt(1)) && Character.isDigit(enteredString.charAt(2)) && Character.isDigit(enteredString.charAt(4)) && Character.isDigit(enteredString.charAt(5)) && Character.isDigit(enteredString.charAt(7)) && Character.isDigit(enteredString.charAt(8)) && Character.isDigit(enteredString.charAt(9)) && Character.isDigit(enteredString.charAt(10)))
    {
      System.out.println(enteredString + " is a valid social security number. ");
    }
    else
    {
      System.out.println(enteredString + " is an invalid social security number. ");
    }

  }
}
