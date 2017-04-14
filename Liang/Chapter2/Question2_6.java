import java.util.Scanner;

public class Question2_6
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int number = scannerObject.nextInt();

    int currentDigit, sumOfDigits = 0;

    while(number > 0)
    {
      currentDigit = number % 10;
      //extract the last (unit) digit of the remaining number

      number = number / 10;
      //integer-divide the number by 10, essentially removing the last digit of that number

      sumOfDigits += currentDigit;
      //add the digit obtained in the current iteration to the sum
    }

    System.out.println("The sum of the digits is " + sumOfDigits);
  }
}
