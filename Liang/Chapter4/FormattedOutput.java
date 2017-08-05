public class FormattedOutput
{
  public static void main(String[] args)
  {
    System.out.printf("\nhello, %s", "Subham");
    System.out.printf("\nhello, %10s", "Subham");
    System.out.printf("\nhello, %-10s", "Subham");
    System.out.printf("\nhello, %-10.5s", "Subham");
    //Surprisingly, the above line works (?!?!)

    System.out.printf("\nMy marks are %d", 45);
    // System.out.printf("\nMy marks are %.5d", 23);
    //notice that you can't force precision on a decimal (integer), because integers are thought of as having zero precision
    //System.out.printf("\nMy marks are %f", 43);
    //you can't force the display of an integer as a floating-point number...
    // System.out.printf("\nMy marks are %d", 45.5);
    //you can't make a double number to be treated as a decimal

    System.out.printf("\nMy marks are %10d", 45);
    System.out.printf("\nMy marks are %-10d", 45);

    System.out.printf("\nDid I pass? %b", true);
    System.out.printf("\nDid I pass? %10b", true);
    System.out.printf("\nDid I pass? %-10b", true);
    System.out.printf("\nDid I pass? %10.2b", true);
    System.out.printf("\nDid I pass? %-10.2b", true);
    System.out.printf("\nDid I pass? %10.7b", true);

    //"Precision" is actually the number of characters that would be shown from the input.
    //The values are extracted from the input from left-to-right, hence seeing the "tr".

    //"Minimum field width" is the compromisable field width (if the number of characters in the input variable is more than this number, the field expands to occupy the extra characters.)

    //"Precision" does the opposite. Precision is the number of characters extracted from the input, left-to-right.
  }
}