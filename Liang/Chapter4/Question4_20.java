import java.util.Scanner;
public class Question4_20
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    System.out.println("First Character of the String: " + input.charAt(0));
    System.out.println("Length of the String: " + input.length());
  }
}
