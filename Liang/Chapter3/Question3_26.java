import java.util.Scanner;

public class Question3_26
{
	private final static int FIRST_DIVISOR = 5;
	private final static int SECOND_DIVISOR = 6;
	public static void main(String[] args)
	{
		boolean isDivisibleByBoth = false, isDivisibleByEitherOrBoth = false, isDivisibleByEitherButNotBoth = false;

		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter the number. ");
		int number = scannerObject.nextInt();
		scannerObject.close();

		if(number % FIRST_DIVISOR == 0 && number % SECOND_DIVISOR == 0)
		{
			isDivisibleByBoth = true;
			isDivisibleByEitherOrBoth = true;
		}
		if(number % FIRST_DIVISOR == 0 || number % SECOND_DIVISOR == 0)
		{
			isDivisibleByEitherOrBoth = true;
		}
		if(number % FIRST_DIVISOR == 0 ^ number % SECOND_DIVISOR == 0)
		{
			isDivisibleByEitherButNotBoth = true;
		}

		System.out.println("Is " + number + " divisible by " + FIRST_DIVISOR + " and " + SECOND_DIVISOR + "? " + isDivisibleByBoth);
		System.out.println("Is " + number + " divisible by " + FIRST_DIVISOR + " or " + SECOND_DIVISOR + "? " + isDivisibleByEitherOrBoth);
		System.out.println("Is " + number + " divisible by " + FIRST_DIVISOR + " or " + SECOND_DIVISOR + "? " + isDivisibleByEitherButNotBoth);
	}
}
