public class CheckPoint6_3
{
	public static int max(int i1, int i2)
	{
		return (i1 > i2 ? i1 : i2);
	}

	public static void main(String[] args)
	{
		int i = 5;
		int j = 2;
		int k = max(i, j);
		System.out.println("The maximum of " + i + " and " + j + " is " + k);
	}
}