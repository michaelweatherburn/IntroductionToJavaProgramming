public class CheckPoint5_12_1b
{
	public static void main(String[] args)
	{
		int balance = 10;
		while (true) {
			if (balance < 9)
				continue;
			balance = balance - 9;
		}

		System.out.println("Balance is " + balance);
		//I was expecting it to run, causing an infinite loop, but the Java compiler really impressively,
		//mentions in a CTE that line 12 is "Unreachable code"
	}
}