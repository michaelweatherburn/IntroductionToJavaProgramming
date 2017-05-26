public class TrigonometricMethodsInMathClass
{
  public static void main(String[] args)
  {
    System.out.println("Trigonometric Methods: ");
    //all trigonometric methods take in the angle in (double) radians.
    System.out.println("sin(pi/2): " + Math.sin(Math.PI / 2));

    //Interestingly both the cos and tan functions had errors (insignificant, but still)
    System.out.println("cos(pi/2): " + Math.cos(Math.PI / 2));
    System.out.println("tan(pi/4): " + Math.tan(Math.PI / 4));
    System.out.println("toDegrees(pi/2): " + Math.toDegrees(Math.PI / 2));
    System.out.println("toRadians(45): " + Math.toRadians(45));
    System.out.println(Math.sin(0));
    System.out.println(Math.sin(Math.toRadians(270)));
    System.out.println(Math.sin(Math.PI / 6));
    System.out.println(Math.sin(Math.PI / 2));

    System.out.println(Math.cos(0));
    System.out.println(Math.cos(Math.PI / 6));
    System.out.println(Math.cos(Math.PI / 2));
    System.out.println(Math.asin(0.5));
    System.out.println(Math.acos(0.5));
    System.out.println(Math.atan(1.0));

    
  }
}
