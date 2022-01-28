import java.util.Scanner;
public class Dec2Hex
{
	public static final int RADIX = 16;
	public static final int DECIMAL_RADIX = 10;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String hexadecimalEquivalent = "";

		System.out.println("Enter the decimal number. ");
		int decimalNumber = scanner.nextInt();
		String remainder = null;

		while(decimalNumber != 0)
		{
			if(decimalNumber % RADIX >= 0 && decimalNumber % RADIX <= 9)
				remainder = Integer.toString(decimalNumber % RADIX);
			else
				remainder = Character.toString((char)(decimalNumber % RADIX  + 'A' - DECIMAL_RADIX));
			
			hexadecimalEquivalent = remainder + hexadecimalEquivalent;
			System.out.println(hexadecimalEquivalent);
			decimalNumber = decimalNumber / RADIX;
		}

		System.out.println("The hexadecimal equivalent: " + hexadecimalEquivalent);

	}
}