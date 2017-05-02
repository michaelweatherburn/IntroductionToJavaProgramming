public class TrigonometricMethodsInAction
{
  public static void main(String[] args)
  {
    System.out.println(Math.toDegrees(Math.PI / 2.0));
    System.out.println(Math.toRadians(30));
    System.out.println(Math.sin(0));
    System.out.println(Math.sin(Math.toRadians(270)));
    System.out.println(Math.sin(Math.PI / 6));
    //ouch! Does not return 0.5, as we would expect. This is one of the proofs that double mathematical calculations are inherently imprecise

    System.out.println(Math.sin(Math.PI / 2));

    System.out.println(Math.cos(0));
    System.out.println(Math.cos(Math.PI / 6));
    System.out.println(Math.cos(Math.PI / 2));
    //Okay, shit. This was unprecedented, and this could lead to huge calculation errors while solving math problems using the builtin values of PI and E. That is why we'll have to define EPSILON_FLOAT and EPSILON_DOUBLE to be 10E-7 and 10E-14, so that near-zero values can be approximated to zero.
    
    System.out.println(Math.asin(0.5));
    System.out.println(Math.acos(0.5));
    System.out.println(Math.atan(1.0));
  }
}
