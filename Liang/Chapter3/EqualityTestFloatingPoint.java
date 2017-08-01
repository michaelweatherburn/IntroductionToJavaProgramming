
public class EqualityTestFloatingPoint
{
  public static float EPSILON_FLOAT = 1E-7f;
  public static double EPSILON_DOUBLE = 1E-15;

  public static boolean areEqualFloatingPoint(float a, float b)
  {
    if(Math.abs(a - b) <= EPSILON_FLOAT)
    {
      return true;
    }
    return false;
  }

  public static boolean areEqualFloatingPoint(double a, double b)
  {
    if(Math.abs(a - b) <= EPSILON_DOUBLE)
    {
      return true;
    }
    return false;
  }

  public static void main(String[] args)
  {
    float x = 1.0f - 0.1f - 0.1f - 0.1f - 0.1f - 0.1f;
    System.out.println(x);
    System.out.println(x == 0.5);

    if(areEqualFloatingPoint(x, 0.5f))
    {
      System.out.println("The two numbers are equal. ");
    }
    else
    {
      System.out.println("The two numbers are not equal. ");
    }
  }
}
