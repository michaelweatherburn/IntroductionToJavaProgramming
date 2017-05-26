public class EqualityTestFloatingPoint
{
  static private final double EPSILON_DOUBLE = 1E-14;
  static private final float EPSILON_FLOAT = 1E-7f;

  public static void main(String[] args)
  {
    double x = 1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;

    System.out.println(x);
    System.out.println(x == 0.5);

    //apparently double arithmetic is messed up. Not a fault of the Java language. This problem is with the IEEE 754 specification.

    /*  the way to avoid this problem? Define infinitesimal. Define a value so small that if two numbers have differences less than that value, they must be one and the same. Then, arbitrarily choose which of the numbers' values you wish to use thereafter.

    */
    if(Math.abs(x - 0.5) < EPSILON_DOUBLE)
    {
      System.out.println("The difference between the numbers is so small, that we can say they're equal. ");
    }

  }
}
