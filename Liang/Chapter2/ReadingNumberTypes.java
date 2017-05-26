import java.util.Scanner;

public class ReadingNumberTypes
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter a byte value. ");
    byte byteValue = scannerObject.nextByte();

    System.out.println("Enter a short value. ");
    short shortValue = scannerObject.nextShort();

    System.out.println("Enter an integer value. ");
    int integerValue = scannerObject.nextInt();

    System.out.println("Enter a long value. ");
    long longValue = scannerObject.nextLong();

    System.out.println("Enter a floating-point single precision value. ");
    float floatValue = scannerObject.nextFloat();

    System.out.println("Enter a floating-point double precision value. ");
    double doubleValue = scannerObject.nextDouble();

  }
}
