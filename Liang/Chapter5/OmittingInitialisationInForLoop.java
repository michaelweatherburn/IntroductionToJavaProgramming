public class OmittingInitialisationInForLoop
{
	public static void main(String[] args)
	{
		int i = 5;	//initialising loop counter variable BEFORE the loop construct, so initialisation is not required
		for(; i < 10; i++)
			System.out.println(i);
	}
}