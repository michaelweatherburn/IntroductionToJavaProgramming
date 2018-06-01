public class TestMax
{
	public static void main(String[] args)
	{
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}

	public static int max(int i1, int i2)
	{
		int result;
		if (i1 > i2)
		{
			result = i1;
		}
		else 
		{
			result = i2;
		}
		return result;
	}
}