public class TestSum
{
	public static void main(String[] args)
	{
		float sum = 0;
		for (float i = 0.01f; i <= 1.0f; sum += i, i += 0.01f);
		System.out.println("The sum is: " + sum);

	/* 
		Expected Result: 50.50
		Actual Result: 50.499985

		*/
	}
}