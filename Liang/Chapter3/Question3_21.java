import java.util.Scanner;

public class Question3_21
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		int dayOfTheWeek, dayOfTheMonth, month, year, century, yearOfTheCentury;
		String dayOfTheWeekString = null;

		System.out.print("Enter year. ");
		year = scannerObject.nextInt();

		System.out.print("Enter month (1 - 12): ");
		month = scannerObject.nextInt();

		if(month == 1 || month == 2)
		{
			month += 12;
			year -= 1;
		}

		System.out.print("Enter the day of the month(1 - 31): ");
		dayOfTheMonth = scannerObject.nextInt();
		scannerObject.close();

		century = year / 100;
		yearOfTheCentury = year % 100;

		dayOfTheWeek = (dayOfTheMonth + 26 * (month + 1) / 10 + yearOfTheCentury + yearOfTheCentury/4 + century / 4 + 5 * century) % 7;

		switch(dayOfTheWeek)
		{
			case 0: dayOfTheWeekString = "Saturday";
			break;
			case 1: dayOfTheWeekString = "Sunday";
			break;
			case 2: dayOfTheWeekString = "Monday";
			break;
			case 3: dayOfTheWeekString = "Tuesday";
			break;
			case 4: dayOfTheWeekString = "Wednesday";
			break;
			case 5: dayOfTheWeekString = "Thursday";
			break;
			case 6: dayOfTheWeekString = "Friday";
			break;
		}

		System.out.print("Day of the week is " + dayOfTheWeekString);
	}
}
