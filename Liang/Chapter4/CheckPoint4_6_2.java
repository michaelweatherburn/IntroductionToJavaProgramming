public class CheckPoint4_6_2
{
  public static void main(String[] args)
  {
    System.out.printf("\n%5d %d", 1, 2, 3);
    // You can provide number of items larger than or equal to the number of format specifiers in the format string, not less than. No error above.
    System.out.printf("\n%5d %f", 1);
    // Runtime error: MissingFormatArgumentException
    // The number of items here is less than the number of format specifiers in the format string
    System.out.printf("\n%5d %f", 1, 2);
    // The second item is an integer passed to a floating-point format specifier. Casting DOES NOT HAPPEN in case of format specifiers
    // Runtime Error: IllegalFormatConversionException
    System.out.printf("\n%.2f\n%0.3f\n", 1.23456, 2.34);
    // A width of 0 is not allowed. If you've applied 0, it is assumed that you're asking of padding of the formatted string with leftover zeroes after you've used up some of the minimum-field-width. If you specify that you want to pad the input with leading zeroes, but do not specify the minimum-field-width, an exception would be thrown.
    System.out.printf("\n%08s\n", "Java");
    // The "0" flag is applicable to numbers only.
  }
}
