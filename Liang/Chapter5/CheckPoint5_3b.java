public class CheckPoint5_3b
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i < 10)
			if(i % 2 == 0)
				System.out.println(i++);
	}
}
/* 

Infinite loop occurs again. Update expression works only when i = {2, 4, 6, 8}.
But when i = 1, update expression does not work, so i stays at 1, resulting in infinite loop.

*/

