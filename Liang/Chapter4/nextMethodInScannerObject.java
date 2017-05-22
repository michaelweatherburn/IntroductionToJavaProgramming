import java.util.Scanner;

public class NextMethodInScannerObject
{
  public static void main(String[] args)
  {

    /*
      The next method in the scanner class is used to read the next token in the input String,
      considering that tokens are separated with whitespace characters. So if words are divided
      by blank spaces, newlines, formfeeds, carriage returns or horizontal tabs, next considers the first word in the input buffer in such a situation.

      Also, next(), like other methods, jumps over the first character if that first character is a whitespace. This is unlike the nextLine() method, which cannot ignore the newline character, no matter wherever it is used in a program. This is why next() can be used to enter data which requires multiple words, like so:
    */

    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter the name. ");
    String firstName = scannerObject.next();
    String lastName = scannerObject.next();

    System.out.println("The Name is: " + firstName + lastName);
    /* notice that the use of next() does not leave room for whitespaces in the middle of the two words. The first next() does not read (consume) the character in the buffer. It stays there, until the other next() merely skips over it in order to find something useful.

     */
  }
}
