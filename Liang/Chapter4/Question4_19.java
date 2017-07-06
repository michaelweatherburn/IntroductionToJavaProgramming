import java.util.Scanner;
public class Question4_19
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter the first 9 digits of ISBN as a String: ");
    String firstNineISBNDigits = scannerObject.next();
    int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, d10 = 0;
    d1 = firstNineISBNDigits.charAt(0) - 48;
    d2 = firstNineISBNDigits.charAt(1) - 48;
    d3 = firstNineISBNDigits.charAt(2) - 48;
    d4 = firstNineISBNDigits.charAt(3) - 48;
    d5 = firstNineISBNDigits.charAt(4) - 48;
    d6 = firstNineISBNDigits.charAt(5) - 48;
    d7 = firstNineISBNDigits.charAt(6) - 48;
    d8 = firstNineISBNDigits.charAt(7) - 48;
    d9 = firstNineISBNDigits.charAt(8) - 48;

    //probably the worst, most time-consuming way to do it.
    int checksum = (d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9)%11;

    System.out.print("The ISBN-10 number is " + firstNineISBNDigits);
    if(checksum == 10)
    {
      System.out.println('X');
    }
    else
    {
      System.out.println(checksum);
    }

  }
}
