import java.util.Scanner;
public class SentinelValueFor
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		int data = -1, sum = 0;
		for(; data != 0;)
		{
			System.out.print("Enter a number: ");
			data = scannerObject.nextInt();
			sum += data;
		}

		System.out.println("Sum: " + sum);
	}
}