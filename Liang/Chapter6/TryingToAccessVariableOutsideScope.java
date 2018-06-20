public class TryingToAccessVariableOutsideScope
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 10; i++) {
		}
		System.out.println(i);	// i's scope is limited to the for loop (all iterations inside the loop), hence trying to access i here would result in a cannot find symbol - since there is no symbol i defined outside the scope of the for loop, within the scope of the main method
	}
}