import java.util.Scanner;
public class Question4_8
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an ASCII code: ");
    int number = scanner.nextInt();

    if(number >= 0 && number <= 127)
    {
      System.out.println("The character for ASCII code " + number + " is " + (char)number);
    }
    else
    {
      System.out.println("The number that you entered does not correspond to any ASCII character. ");
    }
  }
}
