import java.util.Scanner;
public class CheckPoint3_3_1
{
	public static void main(String[] args)
	{
		int x = 0, y = 0;
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter a value for y. ");
		y = scannerObject.nextInt();
		scannerObject.close();

		if(y > 0)
		{
			x = 1;
		}
	}
}
