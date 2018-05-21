public class MultipleInitialisationsInForLoop
{
	public static void main(String[] args)
	{
		for(int i = 1, j = 4; i < 5; i++)
			System.out.println(i + " " + j);

		System.out.println();

		//you can make plain variable declarations as well. It doesn't have to be variable initialisation
		for(int i = 1, j; i < 5; i++)	
			System.out.println(i + " " + (j = 5));
	}
	//If there are multiple initialisations in a for-loop, they need to be separated by commas
}