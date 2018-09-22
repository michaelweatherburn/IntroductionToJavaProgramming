public class CheckPoint5_7_4
{
	public static void main(String[] args)
	{
		for(; ;)
			System.out.println("Hello World!");

		//any number of statements put within a for loop of this kind would cause an infinite loop
		//that is because any empty loop-continuation-condition in case of for loop is automatically 
		//considered as (true).

		//this is unlike while and do... while loops, where it is mandatory to fill out loop-continuation-condition.
	}
}