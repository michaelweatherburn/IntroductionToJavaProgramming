import java.util.Scanner;
public class PrintCalendar
{
	public static void main(String[] args)
	{
		//readInput method contents
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter full year (e.g. 2012): ");
		int year = scanner.nextInt();
		System.out.println("Enter month as number between 1 and 12: ");
		int monthNumber = scanner.nextInt();

		printMonth(year, monthNumber);
	}

	public static void printMonth(int year, int monthNumber) {
		printMonthTitle(year, monthNumber);
		printMonthBody(year, monthNumber);
	}

	public static void printMonthTitle(int year, int monthNumber) {
		String monthName = getMonthName(monthNumber);
		System.out.printf("\t%s %s\n", monthName, year);
		System.out.printf("-----------------------------------\n");
		System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
	}

	public static String getMonthName(int monthNumber) {
		String monthName = "";
		switch (monthNumber) {
			case 1: monthName = "January";
			break;
			case 2: monthName = "February";
			break;
			case 3: monthName = "March";
			break;
			case 4: monthName = "April";
			break;
			case 5: monthName = "May";
			break;
			case 6: monthName = "June";
			break;
			case 7: monthName = "July";
			break;
			case 8: monthName = "August";
			break;
			case 9: monthName = "September";
			break;
			case 10: monthName = "October";
			break;
			case 11: monthName = "November";
			break;
			case 12: monthName = "December";
			break;
		}
		return monthName;
	}

	public static void printMonthBody(int year, int monthNumber) {
		//method stub
	}
}