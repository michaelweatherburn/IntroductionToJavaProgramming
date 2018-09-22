public class CheckPoint5_7_6
{
	public static void main(String[] args)
	{
		long sum = 0;
		for(int i = 0; i <= 1000; i++)
			sum = sum + i;

		System.out.println(sum);
		//corresponding while loop
		sum = 0;
		int i = 0;
		while(i <= 1000)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

		//corresponding do-while loop
		sum = 0;
		i = 0;
		do
		{
			sum = sum + i;
			i++;
		}	while(i <= 1000);
		System.out.println(sum);
	}
}