import java.util.Scanner;
// a year is leap if its divisible by 4 but not by 100, or if it is divisible by 400.
public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the year that you want to check for leapness. ");

		int yearProvided = scannerObject.nextInt();
		scannerObject.close();

		//finish it within a one-liner
		if((yearProvided % 4 == 0 && yearProvided % 100 != 0 ) || yearProvided % 400 == 0)
		{
			System.out.println("The year entered is a leap year. ");
		}
		else
		{
			System.out.println("The year entered is a non-leap year. ");
		}

	}
}
