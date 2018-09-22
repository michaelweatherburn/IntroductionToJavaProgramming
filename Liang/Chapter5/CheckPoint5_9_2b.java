public class CheckPoint5_9_2b
{
	public static void main(String[] args)
	{
		int i = 0;	//initial action
		while (i < 5 /* loop-continuation-condition */) {
			for (int j = i; j > 1; j--)
				System.out.print(j + " ");
			System.out.println("****");
			i++;	//update expression
		}
	}
}