import java.util.Scanner;
public class CheckPoint3_13_4
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Enter the day number. ");
		byte day = scannerObject.nextByte();
		scannerObject.close();

		switch(day)
		{
			case 0: System.out.print("Sunday");
			break;

			case 1: System.out.print("Monday");
			break;

			case 2: System.out.print("Tuesday");
			break;

			case 3: System.out.print("Wednesday");
			break;

			case 4: System.out.print("Thursday");
			break;

			case 5: System.out.print("Friday");
			break;

			case 6: System.out.print("Saturday");
			break;

			default: System.out.print("Invalid day of week entered. The program will now exit. ");
		}
	}
}
