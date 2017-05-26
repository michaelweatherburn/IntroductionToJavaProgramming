import java.util.Scanner;
public class Question3_17
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    //rock paper scissor

    byte computerChoice, yourChoice;
    String computerChoiceString = null, yourChoiceString = null;

    computerChoice = (byte)(Math.random() * 3);
    System.out.print("Scissor(0), rock(1), paper(2): ");
    yourChoice = scannerObject.nextByte();

    switch(computerChoice)
    {
      case 0: computerChoiceString = "Scissor";
      break;
      case 1: computerChoiceString = "Rock";
      break;
      case 2: computerChoiceString = "Paper";
      break;
    }

    switch(yourChoice)
    {
      case 0: yourChoiceString = "Scissor";
      break;
      case 1: yourChoiceString = "Rock";
      break;
      case 2: yourChoiceString = "Paper";
      break;
    }

    System.out.print("The computer is " + computerChoiceString + ". You are " + yourChoiceString + ". ");
    if(yourChoice == computerChoice)
    {
      System.out.print("It's a draw. ");
    }
    else if((yourChoice + 1) % 3 == computerChoice)
    {
      System.out.print("The computer won. ");
    }
    else
    {
      System.out.print("You won. ");
    }
  }
}
