public class CheckPoint5_2_3
{
	public static void main(String[] args)
	{
		int x = 80000000;
		while (x > 0)
		{
			x++;
		}
		System.out.println("x is " + x);	
	}
}

/* x keeps on increasing until it reaches the maximum value permissible for an integer. After that is reached, adding 1 to the value causes it to overflow and wrap-around (read 2's complement to understand how integers are stored and why this overflow occurs.)

Upon this point, x becomes the *lowest* permissible integer (which, being negative, is not x > 0 not anymore)
Hence we break out of the loop, and x contains that lowest integer value.

*/