//this version of ComputeChange.java takes the input of the currency in String instead of as a double
import java.util.Scanner;
public class Question4_26
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an amount, for example, 11.56: ");
    String input = scanner.next();  //since it just *has* to be a currency value, and it cannot have spaces in between

    int numberOfOneDollars = Integer.parseInt(input.substring(0, input.indexOf('.')));
    int remainingAmount = Integer.parseInt(input.substring(input.indexOf('.') + 1));

    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    int numberOfPennies = remainingAmount;

    System.out.println("Your amount " + input + " consists of: ");
    System.out.println(numberOfOneDollars + " dollars");
    System.out.println(numberOfQuarters + " quarters");
    System.out.println(numberOfDimes + " dimes");
    System.out.println(numberOfNickels + " nickels");
    System.out.println(numberOfPennies + " pennies");
  }
}
