import java.util.Scanner;
public class RelationalOperatorsWithChar
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please provide a character. ");
    char input = scanner.nextLine().charAt(0);

    if('a' <= input && input <= 'z')
    {
      System.out.println("This is a lowercase character. ");
    }
    else if('A' <= input && input <= 'Z')
    {
      System.out.println("This is an uppercase character. ");
    }
    else if('0' <= input && input <= '9')
    {
      System.out.println("This is a digit. ");
    }
    else
    {
      System.out.println("This is a special character. ");
    }


  }
}
