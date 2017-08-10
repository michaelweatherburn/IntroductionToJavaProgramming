public class EmptyLoops
{
	public static void main(String[] args)
	{
		//Empty loops are loops with nothing inside the code body. To write empty for or while loops, either use a semicolon, or open and close a brace.

		for(int i = 1; i <=5; System.out.println(i), i++);	//finite loop
		/* The above line translates to:

		for(int i = 1; i <=5; System.out.println(i), i++)
		{
	
		}

		i.e. you're literally not providing anything inside the loop body. This is useful in some cases, especially in the early days when you want to create a delay loop on the console to keep output on a screen for a specified number of seconds.

		*/

		int a = 1;
		while(a < 5);	//infinite loop
		while(a > 5);	//empty loop

		/* This also translates to:

		while(a < 5)
		{
	
		}

		It is not possible to make a while loop do something meaningful with this syntax, because the update-expression statement (along with other statements) are written inside the loop body

		*/
		int b = 1;
		do
		{

		}
		while(b < 10);	//infinite loop

		/*
		Even a while loop should have braces. Trying to write a while loop like so:

		do while(b < 10);
		or...
		do
		while(b < 10);

		results in an error.
		*/
	}
}