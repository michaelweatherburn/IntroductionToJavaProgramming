public class OmittingConditionalCheckInLoops
{
	public static void main(String[] args)
	{
		int i = 5;
		while()
		{
			i++;
			System.out.println(i);
		}

		do
		{
			i++;
			System.out.println(i);
		}while();

		for(;;i++)
		{
			System.out.println(i);
		}

		/* If you try to omit conditional-check in other loops, it would result in a compilation error.

		However, you can omit conditional-check in a for loop. However, this converts the for loop into an infinite loop (it implicitly puts a "true" condition there).

		*/
	}
}