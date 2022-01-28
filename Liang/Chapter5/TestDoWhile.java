import java.util.Scanner;
public class TestDoWhile
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int data;
		do
		{
			System.out.println("Enter an integer (0 to exit loop): ");
			data = scanner.nextInt();
			sum += data;
		} while (data != 0);

		System.out.println("Sum so far: " + sum);
	}
}