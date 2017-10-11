public class ConvertStringsToNumbers
{
  public static void main(String[] args)
  {

    String byteValue = "12";
    String wrongByteValue = "12c";

    String shortValue = "1234";
    String wrongShortValue = "-1000000";

    String integerValue = "123";
    String wrongIntegerValue = "123a5";

    String longValue = "1234567890l";  //why is this a problem...
    String wrongLongValue = "1.2";

    String floatValue = "123.45f";  //but this isn't?
    String wrongFloatValue = "123.45.6f";

    String doubleValue = "123.45";
    String wrongDoubleValue = "123.2.3";

    System.out.println(Byte.parseByte(byteValue));
    // System.out.println(Byte.parseByte(wrongByteValue));

    System.out.println(Short.parseShort(shortValue));
    // System.out.println(Short.parseShort(wrongShortValue));

    System.out.println(Integer.parseInt(integerValue));
    //  System.out.println(Integer.parseInt(wrongIntegerValue));
    //  Throws a number format exception

    System.out.println(Long.parseLong(longValue));   //why is this a problem...
   // System.out.println(Long.parseLong(wrongLongValue));

    System.out.println(Float.parseFloat(floatValue)); //and this isn't?
    // System.out.println(Float.parseFloat(wrongFloatValue));

    System.out.println(Double.parseDouble(doubleValue));
    //  System.out.println(Double.parseDouble(wrongDoubleValue));
    //  Throws a number format exception

    /* Every wrapper class has its own parseXXX method that reads a value from a String and converts it into the datatype corresponding to that wrapper class. */
  }
}
