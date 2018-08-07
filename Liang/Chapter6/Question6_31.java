/* Wherever I've added my own methods not in the list of methods that were supposed to be used in the solution, I've added my own names for formal parameters that are more suited to the situation. However, I've left the signatures of the method stubs provided in the question untouched 

It might feel as if I've made way too many methods, each having way too little functionality, but that makes individual methods concise and easy to debug

Current Situation - Incomplete
*/

import java.util.Scanner;
public class Question6_31 {

	public static final int PREFIX_VISA_CARDS = 4;
	public static final int PREFIX_MASTER_CARDS = 5;
	public static final int PREFIX_AMERICAN_EXPRESS_CARDS = 37;
	public static final int PREFIX_DISCOVER_CARDS = 6;

	public static boolean isCreditCardNumberLengthValid(long creditCardNumber) {
		int creditCardNumberLength = getSize(creditCardNumber);
		return (creditCardNumberLength >= 13 && creditCardNumberLength <= 16);
	}

	public static boolean hasValidCreditCardNumberPrefix(long creditCardNumber) {
		return prefixMatched(creditCardNumber, PREFIX_VISA_CARDS) || prefixMatched(creditCardNumber, PREFIX_MASTER_CARDS) || prefixMatched(creditCardNumber,  PREFIX_AMERICAN_EXPRESS_CARDS) || prefixMatched(creditCardNumber, PREFIX_DISCOVER_CARDS);
	}

	public static boolean hasValidDigitSumValue(long creditCardNumber) {
		return (sumOfOddPlace(creditCardNumber) + sumOfDoubleEvenPlace(creditCardNumber)) % 10 == 0;
	}

	public static boolean isValid(long number) {
		return isCreditCardNumberLengthValid(number) && hasValidCreditCardNumberPrefix(number) && hasValidDigitSumValue(number);
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sumOfDoubleEvenPlaces = 0;
		number /= 10; 	//skim off the first digit of the number
		while (number > 0) {
			sumOfDoubleEvenPlaces += getDigit(2 * (int)(number % 10));
			number /= 100;	//Even places from right to left: od-places from right to left, when the last digit of the number is skimmed off
		}
		return sumOfDoubleEvenPlaces;
	}

	public static int getDigit(int number) {
		int sum = 0;
		while (number > 0) {
			sum += (number % 10);
			number /= 10;
			}	// This seems like over-engineering, because we know that getDigit can only have one-digit numbers or two-digit numbers as their inputs, but this ensures consistency. Basically getDigit means getSumOfDigits, which makes all around sense for the situations that it is going to be used in - 1) If the number is a single digit number, the while loop runs only once, and then returns the value; 2) If the number has two digits, the while loop will run exactly twice and give you the sum of the two digits.
			return sum;
		}


	public static int sumOfOddPlace(long number) {
		// Odd places from right to left: even places from right to left in 0-indexed systems
		int sumOfOddPlaces = 0;
		while (number > 0) {
			sumOfOddPlaces += (number % 10);
			number /= 100;	// start from the last digit (index is 1) and then jump two places rightward.
		}
		return sumOfOddPlaces;
	}

	public static boolean prefixMatched(long number, int d) {
		return d == getPrefix(number, getSize(d));
	}

	public static int getSize(long d) {
		// the method returns the number of digits in a long number
		int count = 0;
		while (d > 0) {
			d /= 10;
			count++;
		}
		return count;
	}

	public static long getPrefix(long number, int k) {
		//Here getSize can be called with int parameter - since int is a compatible type for long (basically, int can be implicit-cast to long)
		int divisorSize = getSize(number) - k; //get the number of digits you want to chop off to achieve the result
		if (divisorSize >= 0) {
		int divisor = (int)(Math.rint(Math.pow(10, divisorSize)));	//basically 10^inputSize, but due to the nature of floating-point arithmetic, you never know what the outcome can be if you aren't careful
		return number / divisor;
		}
		else 
			return number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a credit card number as a long integer: ");
		long creditCardNumber = scanner.nextLong();
		System.out.println(creditCardNumber + " is " + (isValid(creditCardNumber) ? "valid" : "invalid"));
	}
}