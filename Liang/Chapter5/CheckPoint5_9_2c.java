public class CheckPoint5_9_2c
{
	public static void main(String[] args)
	{
		int i = 5;
		while (i >= 1) {
			int num = 1;	//Notice that num has been declared inside the while loop. So it is redeclared on each iteration, and has no existence outside the while loop
			for(int j = 1; j <= i; j++)
			{
				System.out.print(num + "xxx");
				num *= 2;
			}
			System.out.println();
			i--;
		}
	}
}