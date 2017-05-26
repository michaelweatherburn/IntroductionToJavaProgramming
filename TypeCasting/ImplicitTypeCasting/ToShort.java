public class ToShort
{
  public static void main(String[] args)
  {
    //literals to short type

    //integer literal within short range
    short s1 = 10000;

    //integer literal outside short range
    short s2 = 70000;

    //long literal within short range
    short s3 = 10000l;

    //long literal outside short range
    short s4 = 70000l;

    //float literal within short range
    short s5 = 1000.0f;

    //float literal outside short range
    short s6 = 70000.0f;

    //double literal within short range
    short s7 = 1000.0;

    //double literal outside short range
    short s8 = 70000.0;

    //variables to short type
    byte b1 = 30;
    short s9 = 20000;
    char c1 = 'a';
    int i1 = 23000000;
    long l1 = 2323232323232323l;
    float f1 = 123.45f;
    double d1 = 1234.5678;

    //byte variable to short variable
    short s10 = b1;

    //short variable to short variable
    s10 = s9;

    //int variable to short variable
    s10 = i1;

    //long variable to short variable
    s10 = l1;

    //float variable to short variable
    s10 = f1;

    //double variable to short variable
    s10 = d1;

    //character variable to short variable
    s10 = c1;
  }
}
