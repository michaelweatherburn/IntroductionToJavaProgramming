public class OmittingConditionalCheckInForLoop
{
	public static void main(String[] args)
	{
		int i = 5;	//initialised the loop control variable outside the loop
		for(;;)		//made the for loop completely empty
		{
			System.out.println(i);
			i++;	//incremented the loop control variable in the loop body
		}
		//This loop, although seeemingly innocent, is actually an infinite loop. 
		//Reason: if you omit conditional-check expression, you're actually implicitly implying "true".
	}
}