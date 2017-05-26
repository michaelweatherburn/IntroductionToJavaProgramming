public class IntegerOverflow
{
  public static void main(String[] args)
  {
    int a = 2147483647; //the largest possible value that can be stored inside an integer
    a = a + 1;
    System.out.println(a);

    //goes on to demonstrate that if you try an operation that would render the result out of range for the specific datatype, overflow occurs, and the number loops around the range (for integers)

    a = -2147483648;
    a = a - 1;
    System.out.println(a);
    //the above line demonstrates integer overflow in a reverse direction.
  }
}
