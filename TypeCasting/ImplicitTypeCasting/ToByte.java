public class ToByte
{
  public static void main(String[] args)
  {

      //literals to byte variable

      //integer literal within byte range
      byte b1 = 100;

      //integer literal outside byte range
      byte b2 = 10000;

      //long literal within byte range
      byte b3 = 100l;

      //long literal outside byte range
      byte b4 = 10000l;

      //float literal "within" byte range
      byte b5 = 100.0f;

      //float literal outside byte range
      byte b6 = 10000.0f;

      //double literal "within" byte range
      byte b7 = 100.0;

      //double literal outside byte range
      byte b8 = 10000.0;

      //char literal within byte range
      byte b9 = 'a';

      //char literal outside byte range
      byte b10 = (char) -1;

      //variable to byte variable

      byte b11 = 12;
      short s1 = 1234;
      int i1 = 1234567;
      long l1 = 12345678903434l;
      float f1 = 123.456f;
      double d1 = 12345.6789;

      //byte variable to byte variable
      byte b12 = b11;

      //short variable to byte variable
      b12 = s1;

      //int variable to byte variable
      b12 = i1;

      //long variable to byte variable
      b12 = l1;

      //float variable to byte variable
      b12 = f1;

      //double variable to byte variable
      b12 = d1;

  }
}
