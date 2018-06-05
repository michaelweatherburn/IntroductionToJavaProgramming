public class TestVoidMethodReturn
{
	public static void printGrade(double score)
	{
		if (score > 100.0 || score < 0.0)
		{
			System.out.println("Invalid. ");
			return;
		}
		if (score > 90.0)
			System.out.println('A');
		else if (score > 80.0)
			System.out.println('B');
		else if (score > 70.0)
			System.out.println('C');
		else if (score > 60.0)
			System.out.println('D');
		else 
			System.out.println('F');
	}

	public static void main(String[] args)
	{
		System.out.print("The grade is ");
		printGrade(78.5);
		System.out.print("The grade is ");
		printGrade(59.5);
	}
}