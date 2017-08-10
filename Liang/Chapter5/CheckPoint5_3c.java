public class CheckPoint5_3c
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 10)
			if((i++) % 2 == 0)
				System.out.println(i);

	}
}

	/* 
	Here, every time the conditional-check inside the if-clause happens, i's value changes.
	This is a consistent update-expression, since i's value changes on every iteration.

	This prints:
	3
	5
	7
	9

	*/