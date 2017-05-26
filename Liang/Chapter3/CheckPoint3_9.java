public class CheckPoint3_9
{
  public static void main(String[] args)
  {
    int x = 3;
    int y = 2;
    if(x > 2)
      if(y > 2)
      {
        int z = x + y;
        System.out.print("z is " + z);
      }
      else
        System.out.print("x is " + x);

        /*this was tricky. Which if would this else associate with?
        The only solution is to start seeking the closest if to associate with. (i.e. the one with the deepest level of nesting or indentation) that comes before this else.
        */
  }
}
