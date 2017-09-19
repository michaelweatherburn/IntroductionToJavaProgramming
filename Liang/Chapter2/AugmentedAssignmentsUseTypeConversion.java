
public class AugmentedAssignmentsUseTypeConversion
{
  public static void main(String[] args)
  {

    int a = 200;
    int b = a += 4.5;
    int c = a *= 4.5;
    int d = a -= 4.5;
    int e = a /= 4.5;
    int f = a %= 4L;
    System.out.println(b + " " + c + " " + d + " " + e + " " + f);
    /* expressions of the form:

    a += b
    or
    a /= 4.5

    are called augmented assignment expressions. An augmented assignment expression of the form:

    a op= b;
    actually unfolds as:
    a = (typeof a)(a op b);

    The end result after the division is converted back to a's type implicitly, but following the same rules for explicit casting. So,
    int a = 3;
    a += 4.5;
    actually returns 7. This is because:
    a += 4.5
    unfolds as:
    a = (int) (3 + 4.5);
    thus the integer 3 is implicitly converted to 3.0 (double) to make addition possible,
    then the result is 7.5. That result is seemingly-type casted to an int, which is the datatype for a.

    */
  }
}
