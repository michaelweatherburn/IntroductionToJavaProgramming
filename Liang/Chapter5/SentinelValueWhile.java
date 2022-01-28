import java.util.Scanner;
public class SentinelValueWhile
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int data = -1, sum = 0;
		while(data != 0)
		{
			System.out.print("Enter a number. ");
			data = scanner.nextInt();
			sum += data;
		}

		System.out.println("Sum: " + sum);
	}
}