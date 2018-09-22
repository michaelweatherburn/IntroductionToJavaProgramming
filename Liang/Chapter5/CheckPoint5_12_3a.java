//TestBreak
public class CheckPoint5_12_3a
{
	public static void main(String[] args)
	{
		int sum = 0, number = 0;

		boolean isSumGreaterThan100 = false;
		while (number < 20 && !isSumGreaterThan100)
		{
			number++;
			sum += number;
			if (sum >= 100)
				isSumGreaterThan100 = true;
		}

		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}