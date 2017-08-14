public class MultiplicationTable
{
	public static void main(String[] args)
	{

		System.out.printf("Multiplication Table\n\n");
		System.out.printf("    ");
		for(int k = 1; k <= 9; System.out.printf("%4d", k),k++);
		System.out.printf("\n");
		for(int i = 1; i <= 40; System.out.printf("_"), i++);
		System.out.printf("\n\n");
		for(int i = 1; i <= 9; i++)
		{
			System.out.printf("%d | ", i);
			for(int j = 1; j <= 9; j++)
			{
				System.out.printf("%4d", (i*j));
			}
			System.out.printf("\n");
		}
	}
}