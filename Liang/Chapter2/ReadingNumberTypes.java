import java.util.Scanner;

public class ReadingNumberTypes
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a byte value. ");
		byte byteValue = scanner.nextByte();

		System.out.println("Enter a short value. ");
		short shortValue = scanner.nextShort();

		System.out.println("Enter an integer value. ");
		int integerValue = scanner.nextInt();

		System.out.println("Enter a long value. ");
		long longValue = scanner.nextLong();

		System.out.println("Enter a floating-point single precision value. ");
		float floatValue = scanner.nextFloat();

		System.out.println("Enter a floating-point double precision value. ");
		double doubleValue = scanner.nextDouble();

		scanner.close();
	}
}
