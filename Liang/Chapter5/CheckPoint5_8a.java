public class CheckPoint5_8a
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i < 10; i++)
		{
			sum += i;
		}

		System.out.println("Sum: " + sum);

		sum = 0;
		for(int i = 0; i < 10; ++i)
		{
			sum += i;
		}
		
		System.out.println("Sum: " + sum);

		/* the prefix operator changes the value of the variable before placing it in the expression.
		the postfix operator places the (unchanged) value of the variable in the expression, lets the expression be evaluated, and then increases the value of the variable.

		*/
	}
}