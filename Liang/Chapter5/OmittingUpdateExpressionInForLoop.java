public class OmittingUpdateExpressionInForLoop
{
	public static void main(String[] args)
	{
		int i = 5;
		for(; i < 10;)		//....omitted the update-expression
		{
			System.out.println(i);
			i++;	//...and wrote it in the loop body instead, like we do for while loops in general
		}
	}
}
