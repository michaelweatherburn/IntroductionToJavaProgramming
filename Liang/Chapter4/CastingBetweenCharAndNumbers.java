public class CastingBetweenCharAndNumbers
{
  public static void main(String[] args)
  {

    /* Rules:
    1) Implicit Casting to a char variable from an int literal is possible for int literals within [0, 65535].
    2) Implicit Casting to a char variable from any other literal type is impossible.
    3) Implicit Casting to a char variable from a variable of any other dataytpe is impossible. If you make a Venn Diagram, you'll find that character set does not encapsulate anything inside it FULLY.

    4) Explicit casting to a char variable from literals of any datatype is possible.
    5) For conversions to char from floating-point numbers, the number is first converted to an int, and then from an int to a char.

    */

    char a = 100;
    a = 65535;
  //  a = 65536;  //this line throws an error, as 65536 is out of range (possible loss of precision)

    a = (char)0xBA0041;
    //truncation would occur. The hexadecimal part after four digits from the right is truncated, only 0045 (hex) remains. This is what is stored in the variable a.

    int i = 100;
  //  a = i;  //this line throws an error, because the size of the RHS container is larger than the size of the LHS container

    a = (char)i;
    i = 0xBA0045;
    a = (char) i;
    //same truncation would occur
    System.out.println(a);

    a = (char)65.25;
    //two-step process: first conversion to int (by removing MSBs if required/numbers after decimal point if required), and then conversion to char from int(by removing more MSBs if required).
    System.out.println(a);
  }
}
