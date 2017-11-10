public class Question5_12a
{
	public static void main(String[] args)
	{

		/* one-liner solution: take the square root of 12,000 and truncate digits after decimal point
		add one to the result 
		the most accurate answer would be -110 however, since squaring a negative integer would yield a 
		positive number
		*/
		System.out.println((int)(Math.sqrt(12000)) + 1);
	}
}