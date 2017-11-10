public class Question5_13
{
	public static void main(String[] args)
	{
		/* no-brainer solution */
		int i = 1;
		while (i * i * i < 12000)
			i++;
		i--;
		System.out.println(i);
	}
}