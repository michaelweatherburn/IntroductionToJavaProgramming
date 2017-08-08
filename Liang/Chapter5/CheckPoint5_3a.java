public class CheckPoint5_3a
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 10)
			if(i % 2 == 0)
				System.out.println(i);
	}
}

/* Infinite Loop occurs: There is no update expression in the loop.
For a loop to be finite, a minimum of three things must be set in place:

initialisation, loop-continuation-condition, update-expression
*/