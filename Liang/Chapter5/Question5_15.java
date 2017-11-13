public class Question5_15
{
	public static void main(String[] args)
	{
		char startingCharacter = '!';
		char endingCharacter = '~';
		final int CHARACTERS_PER_LINE = 10;

		int count = 0;
		for (char c = startingCharacter; c <= endingCharacter; c++)
		{
			count++;
			System.out.print(c + " ");
			if(count % CHARACTERS_PER_LINE == 0)
				System.out.println();
		}
	}
}