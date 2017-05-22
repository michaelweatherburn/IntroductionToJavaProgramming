import java.util.Scanner;
public class NextLineMethodInScannerObject
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    /*The nextLine() method works very differently from the other methods. If the input buffer contains
    a newLine, possibly left over by another method, then nextLine() cannot skip over it. This can cause
    some really unintended outcomes, as follows:
    */

    System.out.println("Enter the roll number of the student. ");
    int rollNumber = scannerObject.nextInt();

    //System.out.println("Enter the students' mother's name. ");
    //String mothersName  = scannerObject.nextLine();

    System.out.println("Enter the name of the student. ");
    String fullName = scannerObject.nextLine();

    System.out.println("Details: " + rollNumber /* + mothersName */ + fullName);

    /* on running this program, you'll see that nextLine() is unable to see through the
    newline that was left in the buffer after nextInt() method finished its' job.

    Oddly enough, nextLine() does not leave any newline in the buffer after it is done. That is why two nextline() methods perform well with each other.

    Also, other methods in the Scanner class are designed to jump over the first character in the buffer if it is a newline(or any other whitespace character for that matter), but the nextLine() method wasn't designed to be so.

    */
  }
}
