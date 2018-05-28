import java.util.Scanner;
public class Question5_44
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scanner.nextInt();

		boolean isNegative = (number < 0);
		int mostSignificantBit = isNegative ? 1 : 0;
		number = isNegative ? -number : number;

		String otherBits = "";
		for (int i = 1; i <= 15; i++)
		{
			otherBits = ((number + mostSignificantBit) % 2) + otherBits;
			number /= 2;
		}
		String result = otherBits;
		System.out.println("1s: " + result);
		String answer = "";
		if (isNegative)
		{
			String untouched = "";
			String touched = "";
			String altered = "";
			int lastIndexOfZero = result.lastIndexOf('0');
			if (lastIndexOfZero == -1)
			{
				untouched = "";
				touched = result;
			}
			else 
			{
				untouched = result.substring(0, lastIndexOfZero);
				touched = result.substring(lastIndexOfZero);
			}
			for (int i = 0; i <= touched.length() - 1; i++)
				altered += ((touched.charAt(i) == '0') ? '1' : '0');
			answer = untouched + altered;
		}
		else
		{
			answer = result;
		}
		answer = mostSignificantBit + answer;
		System.out.println("The bits are " + answer);
	}
}