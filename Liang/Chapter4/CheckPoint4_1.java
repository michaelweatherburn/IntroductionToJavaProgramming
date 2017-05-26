public class CheckPoint4_1
{
  public static void main(String[] args)
  {
    System.out.println(Math.sqrt(4));
    System.out.println(Math.sin( 2 * Math.PI)); //should return 0, is returning a really small non-zero value
    System.out.println(Math.cos( 2 * Math.PI));
    System.out.println(Math.pow(2, 2));
    System.out.println(Math.log(Math.E));
    System.out.println(Math.exp(1));
    System.out.println(Math.max(2, Math.min(3,4)));
    System.out.println(Math.rint(-2.5));
    System.out.println(Math.ceil(-2.5));
    System.out.println(Math.floor(-2.5));
    System.out.println(Math.round(-2.5f));
    System.out.println(Math.round(-2.5));
    System.out.println(Math.rint(-2.5));
    System.out.println(Math.ceil(2.5));
    System.out.println(Math.floor(2.5));
    System.out.println(Math.round(2.5f));
    System.out.println(Math.round(2.5));
    System.out.println(Math.round(Math.abs(-2.5)));
  }
}
