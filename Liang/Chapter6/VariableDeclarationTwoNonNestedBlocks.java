public class VariableDeclarationTwoNonNestedBlocks
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 1;
		for (int i = 1; i < 10; i++)
			x += i;
		for (int i = 1; i < 10; i++)
			y += i;
	}
}