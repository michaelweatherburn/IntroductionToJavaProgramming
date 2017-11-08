public class CheckPoint5_25b
{
	public static void main(String[] args)
	{
		// in case of the for loop, the action-after-each-iteration is performed after continue skips over some of the code in the previous loop iteration. in case of the while loop, the increment of the loop variable is never carried out, since it was the part of the "previous iteration" that was skipped over
		int i = 0, sum = 0;
		while (i < 4)
		{
			if (i % 3 == 0)
			{
				i++;
				continue;
			}
			sum += i;
			i++;
		}

		System.out.println("Sum: " + sum);
	}
}