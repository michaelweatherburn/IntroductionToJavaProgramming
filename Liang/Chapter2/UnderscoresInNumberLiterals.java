public class UnderscoresInNumberLiterals
{
	public static void main(String[] args)
	{
		byte number1 = 1_2_3;
		short number2 = 1_2_3_4_5;
		int number3 = 1_2_3_4_5_6_7_8;
		long number4 = 1_2_3_4_5_6_7_8_9L;
		float number5 = 1_2_3.4_5f;
		double number6 = 1_2_3.4_5_6_7_8_9D;

		float number7 = 1_2.3_4_5E+3F;
		double number8 = 1_2.3_4_5E-3;
		double number9 = 1E+1_0_0;

		int number10 = -1_2_3_4_5;

		/*
		Rules for using underscores to make literals more legible on screen:

		Underscores are not allowed before and after the numeric part of the number.

		_12345 and 12345_ are wrong.

		When a suffix specifies the type of numeral (long, float, double), then
		underscores are not allowed between the number and the single-letter suffix.
		They're also not allowed after the suffix
		 So,

		_12345L, 12345_L and 12345L_ are also wrong.

		When floating-point numbers are present,
		underscores are not allowed around either side of the decimal point.

		123_.45f and 123._45 are wrong.

		Also, when scientific-notation is used to assign floating-point numbers,

		The underscore must not be around the decimal point, around the e/E symbol, or around the suffix (if any)

		123.45_e1f, 123.45e_1f, 123.45e1_f and 123.451f_ are all wrong.

		Note that if the exponent part of the number has two or more digits, we can also use underscores 
		for the exponent itself.

		For negative numbers, the underscore should not be on either side of the minus symbol
		(It doesn't matter if the number is an integer, floating-point, the abscissa or the exponent of a floating-point number)
		*/
	}
}