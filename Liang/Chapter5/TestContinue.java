public class TestContinue
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			if(i == 2 || i == 3)
				continue;	//the next line would not be executed when i is 2 or 3, hence output would be 1, 4, or 5
			System.out.println(i);
		}
	}
}