public class ExponentMethodsInMathClass
{
  public static void main(String[] args)
  {
    System.out.println("e^1: " + Math.exp(1));
    System.out.println("e^2: " + Math.exp(2));

    System.out.println("2^3: " + Math.pow(2.0,3.0000000000));

    System.out.println("log(Math.E): " + Math.log(Math.E));
    System.out.println("log(Math.E ^ 2): " + Math.log(Math.E * Math.E));

    System.out.println("log10(10): " + Math.log10(10));
    System.out.println("log10(100): " + Math.log10(100));

    System.out.println("root-2: " + Math.sqrt(2));
    System.out.println("root-4.41: " + Math.sqrt(0.0441));
  }
}
