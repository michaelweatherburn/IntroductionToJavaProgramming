public class Question5_12
{
	public static void main(String[] args)
	{
		/* no-brainer solution */

		int i = 1;
		while(i * i < 12000)
			i++;
		System.out.println("Required number: " + i);
	}
}