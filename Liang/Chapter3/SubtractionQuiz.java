import java.util.Scanner;
public class SubtractionQuiz
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    int firstNumber = (int)(Math.random() * 10);
    int secondNumber = (int)(Math.random() * 10);
    int result, answerProvided, temporary;
    if(firstNumber < secondNumber)
    {
      temporary = firstNumber;
      firstNumber = secondNumber;
      secondNumber = temporary;
    } //swap code

    result = firstNumber - secondNumber;

    System.out.print("What is " + firstNumber + " - " + secondNumber + " ? ");
    answerProvided = scannerObject.nextInt();

    if(result == answerProvided)
    {
      System.out.print("That's right!");
    }
    else
    {
      System.out.print("Nope. ");
    }
  }
}
