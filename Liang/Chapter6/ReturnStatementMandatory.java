public class ReturnStatementMandatory
{
	public static void main(String[] args)
	{
		System.out.println(sign(4));
	}

	public static int sign(int inputNumber)
	{
		if (inputNumber > 0)
			return 1;
		else if (inputNumber == 0)
			return 0;
		else if (inputNumber < 0)
			return -1;
	}
}