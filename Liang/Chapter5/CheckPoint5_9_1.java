public class CheckPoint5_9_1
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < i; j++)
				System.out.print((i * j) + " ");
			System.out.println();
		}
	}
}