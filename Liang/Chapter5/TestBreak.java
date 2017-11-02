public class TestBreak
{
	public static void main(String[] args)
	{
		for(int i = 0; i <= 5; i++)
		{
			if(i > 2)
				break;
			System.out.println(i);	//would not be executed for i = 3, 4, and 5.
		}
	}
}