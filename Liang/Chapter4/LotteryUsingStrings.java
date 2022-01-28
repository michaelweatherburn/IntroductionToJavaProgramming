import java.util.Scanner;
public class LotteryUsingStrings
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    //first, generate a random two-digit integer, then convert it into String

    String lotteryString = "" + (int)Math.floor(Math.random() * 10) + (int)Math.floor(Math.random() * 10);
    //If you try to multiply by 100 directly, it would work, but there's the probability of getting Strings like "8", which wouldn't show up as "08", unlike what we're expecting

    System.out.println("Enter the lottery string. ");
    lotteryString = scanner.nextLine();

    System.out.print("Enter your lottery pick (two digits): ");
    String userInput = scanner.nextLine();

    System.out.println("The lottery number is " + lotteryString);
    if(lotteryString.equals(userInput))
    {
      System.out.println("Exact match: you win $10,000. ");
    }
    else if(lotteryString.equals("" + userInput.charAt(1) + userInput.charAt(0)))
    {
      System.out.println("Match all digits: you win $3,000. ");
    }
    else if(lotteryString.charAt(0) == userInput.charAt(0) || lotteryString.charAt(1) == userInput.charAt(1) || lotteryString.charAt(0) == userInput.charAt(1) || lotteryString.charAt(1) == userInput.charAt(0))
    {
      System.out.println("Match one digit: you win $1,000. ");
    }
    else
    {
      System.out.println("Sorry: no match. ");
    }
  }
}
