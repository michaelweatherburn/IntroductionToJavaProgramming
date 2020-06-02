import java.util.Scanner;

//three-digit palindrome finder
public class Question3_12
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    int threeDigitNumber;
    boolean isPalindrome;

    System.out.print("Enter a three-digit integer. ");
    threeDigitNumber = scannerObject.nextInt();
    scannerObject.close();

    isPalindrome = ( threeDigitNumber % 10 == threeDigitNumber / 100 % 10) ? true : false;
    if(isPalindrome)
    {
      System.out.print(threeDigitNumber + " is a palindrome. ");
    }
    else
    {
      System.out.print(threeDigitNumber + " is not a palindrome. ");
    }
  }
}
