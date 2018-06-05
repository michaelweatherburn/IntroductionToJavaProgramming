public class ReturnStatementMandatoryFix
{

	public static int sign(int inputNumber)
	{
		int result = -2;	/* this is an impossible value for the signum method, but it has to be included
		because you can't ever USE a variable (for example, print its value, or return it) without initializing it

		If you avoid writing this initialization and simply declare the variable, the error
		"This variable might not have been initialized"
		is shown.
		*/
		if (inputNumber > 0)
			result = 1;
		else if (inputNumber == 0)
			result = 0;
		else if (inputNumber < 0)
			result = -1;
		return result;
	}
	public static void main(String[] args)
	{

	}
}