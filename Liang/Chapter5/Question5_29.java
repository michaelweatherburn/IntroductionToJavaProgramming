import java.util.Scanner;
public class Question5_29
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Year: ");
		int year = scanner.nextInt();
		System.out.print("First Day of the Year (0-6, 0 stands for Sunday): ");
		int firstDayOfYear = scanner.nextInt();
		int firstDayOfMonth = firstDayOfYear;
		int numberOfDaysInCurrentMonth = 0;
		// initially set to 0 since January 1's day is being provided by the user

		String month = "";

		// determine whether year is leap or not
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		for (int i = 1; i <= 12; i++)
		{

			int count = 0;
			// first loop prints blanks, until the number (firstDayOfMonth) is reached

			// first Day of month is calculated by adding the number of days of the previous month to the last month's firstDayOfMonth


			// switch statement to calculate the first day of the month, based on the first day of the year

			// before the beginning of this switch statement, the numberOfDaysInCurrentMonth contains the number of days in the previous month

			// add that value to last month's first day of month value, modulus it by 7 to get the first day of month's value

			firstDayOfMonth += numberOfDaysInCurrentMonth;
			firstDayOfMonth %= 7;

			switch (i)
			{
				case 1: numberOfDaysInCurrentMonth = 31;
				month = "January";
				break;
				case 2: numberOfDaysInCurrentMonth = isLeapYear ? 29 : 28;
				month = "February";
				break;
				case 3: numberOfDaysInCurrentMonth = 31;
				month = "March";
				break;
				case 4: numberOfDaysInCurrentMonth = 30;
				month = "April";
				break;
				case 5: numberOfDaysInCurrentMonth = 31;
				month = "May";
				break;
				case 6: numberOfDaysInCurrentMonth = 30;
				month = "June";
				break;
				case 7: numberOfDaysInCurrentMonth = 31;
				month = "July";
				break;
				case 8: numberOfDaysInCurrentMonth = 31;
				month = "August";
				break;
				case 9: numberOfDaysInCurrentMonth = 30;
				month = "September";
				break;
				case 10: numberOfDaysInCurrentMonth = 31;
				month = "October";
				break;
				case 11: numberOfDaysInCurrentMonth = 30;
				month = "November";
				break;
				case 12: numberOfDaysInCurrentMonth = 31;
				month = "December";
				break;
			}

			System.out.printf("\n%10s%-15s%10s\n", "", (month + " " + year), "");
			System.out.printf("-----------------------------------\n");
			System.out.printf(" %3s  %3s  %3s  %3s  %3s  %3s  %3s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

			for (int j = 0; j < firstDayOfMonth; j++)
			{
				System.out.printf("  %2s ", "");
				count++;
			}
			for (int k = 1; k <= numberOfDaysInCurrentMonth; k++)
			{
				System.out.printf("  %2d ", k);
				count++;

				if (count % 7 == 0)
					System.out.printf("\n");
			}
			// seven columns
			System.out.printf("\n\n");
		}
	}
}