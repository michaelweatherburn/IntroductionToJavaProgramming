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

    /* In case of floating point numbers, there is this takeaway:
      1) If there are more digits of precision provided than there are numbers after the zero, there would be extra zeroes added after the number is written.

      2) If there are more digits in total than there are numbers provided before the decimal point, there would be extra spaces added to compensate. NOTE: zeroes are NOT added to the beginning of a number.

      For example, %4.2f means, 4 places in total, two places after decimal.
      So, 1.1 would be shown as <blank-space>1.10

      In short, more significant digits (before the decimal point) than are required = significant digits become leading empty spaces.
      More significant digits (after the decimal point) than are required = significant digits become trailing zeroes.
    */

  }
}
