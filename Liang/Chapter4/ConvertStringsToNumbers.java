public class ConvertStringsToNumbers
{
  public static void main(String[] args)
  {
    String doubleValue = "123.45";
    String wrongDoubleValue = "123.2.3";

    String integerValue = "123";
    String wrongIntegerValue = "123a5";

    System.out.println(Integer.parseInt(integerValue));
    //  System.out.println(Integer.parseInt(wrongIntegerValue));
    //  Throws a number format exception
    System.out.println(Double.parseDouble(doubleValue));
    //  System.out.println(Double.parseDouble(wrongDoubleValue));
    //  Throws a number format exception

    /* Every wrapper class has its own parseXXX method that reads a value from a String and converts it into the datatype corresponding to that wrapper class. */
  }
}
