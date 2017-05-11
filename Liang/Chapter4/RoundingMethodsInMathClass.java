public class RoundingMethodsInMathClass
{
  public static void main(String[] args)
  {
    System.out.println("Math.ceil(2.30) " + Math.ceil(2.30));
    System.out.println("Math.floor(2.54) " + Math.floor(2.54));

    /*
      When Math.rint gets an input with:
      1) 0 < fractional part < 0.5, it would behave like the floor function
      2) 0.5 < fractional part < 1, it would behave like the ceiling function
      3) fractional part = 0.5, it would round off toward the even number.
      for example, 56.5 lies square in the middle of 56 and 57. Since 56 is even, rint(56.5) would result in 56.
    */
    System.out.println("Math.rint(56.5) " + Math.rint(56.5));
    System.out.println("Math.rint(55.5) "+ Math.rint(55.5));

    /* Math.floor(), Math.ceil() and Math.rint() return doubles.

    But Math.round() is different. If you:
      provide double input, you get long output
      provide float input, you get int output

      Also, if:
      0 < input < 0.5, Math.floor() behaviour is observed
      0.5 <= input < 1, Math.ceil() behaviour is observed
    */

    System.out.println(Math.round(3.4));
    System.out.println(Math.round(3.5));
    System.out.println(Math.round(3.6));
  }
}
