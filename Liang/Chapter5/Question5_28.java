import java.util.Scanner;
public class Question5_28
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Year: ");
		int year = scannerObject.nextInt();
		System.out.print("What day is the first Day of January? (0-6, 0 for Sunday) ");
		int firstDayOfYear = scannerObject.nextInt();

		// Step 1. Determine whether the year is a leap year. If it is, then the number of days in a February would be 29, else 28

		boolean isLeapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			isLeapYear = true;

		int daysToBeAdded = 0;
		int j = firstDayOfYear;
		String dayOfWeek = "";
		String month = "";
		for (int i = 1; i <= 12; i++)
		{
			// Step 2. Determine the month name and daysToBeAdded for that particular month (number of days to be added - number of days in the previous month, except for January, because we know what day of the month that is, it is specified in the input)
			switch (i)
			{
				case 1: month = "January";
				daysToBeAdded = 0;
				break;
				case 2: month = "February";
				daysToBeAdded = 31;
				break;
				case 3: month = "March";
				daysToBeAdded = isLeapYear ? 29: 28;
				break;
				case 4: month = "April";
				daysToBeAdded = 31;
				break;
				case 5: month = "May";
				daysToBeAdded = 30;
				break;
				case 6: month = "June";
				daysToBeAdded = 31;
				break;
				case 7: month = "July";
				daysToBeAdded = 30;
				break;
				case 8: month = "August";
				daysToBeAdded = 31;
				break;
				case 9: month = "September";
				daysToBeAdded = 31;
				break;
				case 10: month = "October";
				daysToBeAdded = 30;
				break;
				case 11: month = "November";
				daysToBeAdded = 31;
				break;
				case 12: month = "December";
				daysToBeAdded = 30;
				break;
			}

			// Step 3. Add the specified number of days, then modulus by 7 to get the day of the week in number format
			j = j + daysToBeAdded;
			j %= 7;

			// Step 4. Map day of the week from number to string
			switch (j)
			{
				case 0: dayOfWeek = "Sunday";
				break;
				case 1: dayOfWeek = "Monday";
				break;
				case 2: dayOfWeek = "Tuesday";
				break;
				case 3: dayOfWeek = "Wednesday";
				break;
				case 4: dayOfWeek = "Thursday";
				break;
				case 5: dayOfWeek = "Friday";
				break;
				case 6: dayOfWeek = "Saturday";
				break;
			}

			System.out.println(month + " 1, " + year + " is " + dayOfWeek);
		}
	}
}