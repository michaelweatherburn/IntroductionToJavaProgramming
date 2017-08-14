public class CheckPoint5_17
{
	public static void main(String[] args)
	{
		int i, sum = 0;
		for(i = 0; i < 10; i++)
			sum += i;

		int j = 5;
		if(i < j)
			System.out.println(i);
		else
			System.out.println(j);

		while(j < 10)
			j++;

		do
			j++;
		while(j < 10);
	}
}