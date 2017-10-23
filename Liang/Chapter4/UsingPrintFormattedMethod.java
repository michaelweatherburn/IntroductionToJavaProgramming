public class UsingPrintFormattedMethod
{
  public static void main(String[] args)
  {
    double amount = 12618.98;
    double interestRate = 0.0013;
    double interest = amount * interestRate;
    System.out.printf("Interest is $%4.2f", interest);
    System.out.printf("A few integers are: %5d, %6d and %7d", 1, 34, 456);
    System.out.printf("\nA few characters are: %5c, %6c, %7c", 'a', 'b', 'c');
    System.out.printf("\nA few floating-point numbers are: %5.2f, %10.5f, %7.4f", 1.1, 23.32, 45.45);
    System.out.printf("\nBoolean numbers are: %10b, %11b", true, false);
    System.out.printf("\nRandom string value: %10s", "hello");

    /* In case of floating point numbers, there is this takeaway:
      1) If there are more digits of precision provided than there are numbers after the zero, there would be extra zeroes added after the number is written.

      2) If there are more digits allocated to the variable (the "minimum field width") than there are numbers to show, there would be extra spaces added to compensate. NOTE: zeroes are NOT added to the beginning of a number.

      For example, %5.2f means, 5 places in total, two places after decimal, and one place for the decimal point.
      So, 1.1 would be shown as <blank-space>1.10
      And, 21.5 would be shown as 21.50
      And, 3500.5 would be shown as 3500.50

      Notice that the decimal point, if present, also CONSUMES ONE OF THE CHARACTER SPACES from the minimum field width, thereby demanding its place in the format. So %7.2f means two places after the decimal point, one place FOR the decimal point, and 7 - 1 - 2 = 4 places (minimum) before the decimal point.

      If there's more digits of precision than we specify in the format, we lose numbers from the end of the number. If there are more significant digits at the left of the number than the field width allows, the field width expands to allow for that.

      In short, more significant digits (before the decimal point) than are required = most significant digits become leading empty spaces.
      More significant digits (after the decimal point) than are required = least significant digits become trailing zeroes.
    */

    System.out.printf("\n%4.2f", 5.45); //four places, four characters to show
    System.out.printf("\n%4.2f", 123.4);  //four places, five characters to show
    // Notice that precision does not compensate for field width.

    System.out.printf("\n%2.4f", 23.34);
    // As expected, if we have mnore number of characters to represent before the decimal point, the (minimum field width) restriction is sacrificed. No problems for the precision value. Precision is never sacrificed.

    System.out.printf("\n%4.2f", 1.2345);
    // As expected, digits from the end are truncated.

    System.out.printf("\n%10.2e", 11.2);
    //As already mentioned, the "field width" is 10, hence 10 places (at minimum) would be reserved for the number. In case of the exponential notation of the number, the decimal point, the "e" character and the + or - symbol after the number, alongwith the zero in the exponent notation, all have their places. That is why the total number of places occupied by the blank spaces in the beginning is just 2 in this case.

    System.out.printf("\n%4.2f", 51.7683);
    //notice that truncation doesn't take place here - rounding does.
    // Since 51.76 is the number to be formed by truncation... notice that 6 is followed by 8. If that last digit to feature in the output has a number > 5 directly following it, the last digit is rounded off to a higher value.

    /*
      51.76|83
      Since 8 > 5,
      51.76|83  //input
      51.77|00  //output
    */

    System.out.printf("\n%6d", 5432);
    System.out.printf("\n%-6d", 5432);
    // the (minimum) field width information automatically reserves a minimum of places required to show the required character. If you use minus after the percentage symbol, it changes the alignment to RTL (default is LTR within the range of the minimum field width)

    System.out.printf("\n%%");
    // unfortunately, a % symbol inside a printf cannot be escaped in the usual manner (putting a backslash before the character). One % symbol inside a printf must be escaped by adding the same symbol before it. So two %s equal one in the output.
  }
}
