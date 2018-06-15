import java.util.Scanner;
public class Hex2Dec
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a hexadecimal number: ");
		String hexadecimalNumber = scanner.nextLine();

		System.out.println("The decimal value for hex number " + hexadecimalNumber + " is " + hexToDecimal(hexadecimalNumber.toUpperCase()));
	}

	public static int hexToDecimal(String hexadecimalNumber) {
		int sum = 0;
		for (int i = 0; i <= hexadecimalNumber.length() - 1; i++)
		{
			sum = sum * 16 + hexCharacterToDecimal(hexadecimalNumber.charAt(i));
		}
		return sum;
	}

	public static int hexCharacterToDecimal(char hexCharacter) {
		if (Character.isLetter(hexCharacter))	//assuming that the input is perfect
			return hexCharacter - 'A' + 10;
		else
			return hexCharacter - '0';
	}
}