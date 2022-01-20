public class InfiniteLoop
{
	public static void main(String[] args)
	{
		int count = 0;
		while (count < 100)
		{
			System.out.println("Welcome to Java!");
		}
		//note that there is no update expression. This will keep the value of count at 0, hence the loop conditional check would always return true, and the loop will run ad infinitum.
	}
}