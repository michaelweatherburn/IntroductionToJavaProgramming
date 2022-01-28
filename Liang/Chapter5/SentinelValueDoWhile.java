import java.util.Scanner;
public class SentinelValueDoWhile
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int data = 0, sum = 0;
		do
		{
			sum += data;
			System.out.print("Enter a number. ");
			data = scanner.nextInt();
		} while(data != 0);
		System.out.println("Sum: " + sum);
	}
}