public class ReturnStatementMayNotReturnAValue
{
	public static int sign(int inputNumber)
	{
		if (inputNumber > 0)
			return 1;
		else if (inputNumber == 0)
			return 0;
		else if (inputNumber < 0)
			return -1;
		/* At this point, the compiler is able to sense that there is a possibility of the return statement never being called (it fails to understand that the conditions >, == and < are mutually exclusive and complete the range of integer)

		That's why a missing return statement is shown in the error description
		*/
	}
	public static void main(String[] args)
	{
		System.out.println(sign(4));
	}
}