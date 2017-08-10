public class MultipleUpdateExpressionsInForLoop
{
	public static void main(String[] args)
	{
		for(int i = 0, j = 4; i < 5; i++, j+=2)
			System.out.println(i + " " + j);
	//although it is not allowed to have multiple conditional checks in a for loop, you can still combine the multiple checks you're supposed to do using the Logical AND &&/the Logical OR && operators. As an example:
		System.out.println();

		for(int i = 0, j = 4; i < 5 && j < 10; i++, j+=2)
		{
			System.out.println(i + " " + j);
		}

		System.out.println();

		//You can also regular Java statements inside the update-expression part of the loop, like so:
		for(int i = 0; i < 5; System.out.println(i), i++);
		//the above line outputs 0 1 2 3 4. That's because println is called first (Comma has LTR associativity)
	}
}