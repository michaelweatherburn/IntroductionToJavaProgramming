public class CheckPoint6_13a
{
	public static void main(String[] args)
	{
		int max = 0;
		max(1, 2, max);
		System.out.println(max);
	}

	public static void max(int value1, int value2, int max) {
		if (value1 > value2)
			max = value1;
		else
			max = value2;
	}
}