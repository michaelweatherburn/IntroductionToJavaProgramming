public class Question5_26
{
	public static void main(String[] args)
	{
		for (int i = 10000; i <= 100000; i += 10000)
		{
			double k = 1.0;
			double e = 1.0;
			for (int j = 1; j <= i; j++)
			{
				k *= (1 / (double) j);
				e += k;
			}

			System.out.println("i: " + i);
			System.out.println("e: " + e);
		}
	}
}