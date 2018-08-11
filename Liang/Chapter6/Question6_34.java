import java.util.Scanner;
public class Question6_34
{
	public static void main(String[] args)
	{
		//readInput method contents
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter full year (e.g. 2012): ");
		int year = scanner.nextInt();
		if (year < 1800) {
			System.out.println("This calendar program can only show results for years 1800 and ahead. Terminating program. ");
			System.exit(0);
		}
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
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
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
			int startDay = getStartDay(year, monthNumber);	// a number between 1 and 7
			int numberOfDaysInCurrentMonth = getNumberOfDaysInMonth(year, monthNumber);	// a number between 1 and 31
			int currentPosition = 0;
			for (int i = 1; i < startDay; i++) {
				System.out.printf("%5s", " ");
				currentPosition++;
			}
			for (int i = 1; i <= numberOfDaysInCurrentMonth; i++) {
				if (currentPosition % 7 == 0) {
					System.out.println();
					currentPosition = 0;
				}
				System.out.printf("%5s", i);
				currentPosition++;
			}
		}

		public static int getStartDay(int year, int monthNumber) {
			int startDay;
			if (monthNumber == 1 || monthNumber == 2) {
				monthNumber += 12;
				year--;
			}

			int century = year / 100;
			int yearOfCentury = year % 100;
			int dayOfMonth = 1;

			startDay = (dayOfMonth + 26 * (monthNumber + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
			startDay = (startDay + 7 - 2) % 7 + 1;	//crucial, changing saturday-start, 0-indexed to monday-start, 1 indexed
			return startDay;
		}

		public static int getNumberOfDaysInMonth(int year, int monthNumber) {
			int numberOfDaysInMonth = 0;
			switch (monthNumber) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				numberOfDaysInMonth = 31;
				break;
				case 4:
				case 6:
				case 9:
				case 11:
				numberOfDaysInMonth = 30;
				break;
				case 2: 
				numberOfDaysInMonth = isLeapYear(year) ? 29 : 28;
				break;
			}
			return numberOfDaysInMonth;
		}

		public static boolean isLeapYear(int year) {
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		}

		public static int getTotalNumberOfDays(int currentYear, int monthNumber) {
			int totalNumberOfDays = 0;
			for (int i = 1800; i < currentYear; i++) {
				totalNumberOfDays += (isLeapYear(i) ? 366 : 365);
			}
			for (int j = 1; j < monthNumber; j++) {
				totalNumberOfDays += getNumberOfDaysInMonth(currentYear, j);
			}
			return totalNumberOfDays;
		}

	}