import java.util.Scanner;
public class Question3_21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = scanner.nextInt();

		System.out.print("Enter month (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter the day of the month (1-31): ");
		int dayOfMonth = scanner.nextInt();

		scanner.close();

		if (month == 1 || month == 2) {
			month += 12;
			year--;
		}

		int century = year / 100;
		int yearOfCentury = year % 100;

		int dayOfWeek = (dayOfMonth + (26 * (month + 1) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + 5 * century) % 7;

		String dayOfWeekString = null;
		switch (dayOfWeek) {
		case 0:
			dayOfWeekString = "Saturday";
			break;
		case 1:
			dayOfWeekString = "Sunday";
			break;
		case 2:
			dayOfWeekString = "Monday";
			break;
		case 3:
			dayOfWeekString = "Tuesday";
			break;
		case 4:
			dayOfWeekString = "Wednesday";
			break;
		case 5:
			dayOfWeekString = "Thursday";
			break;
		case 6:
			dayOfWeekString = "Friday";
			break;
		}

		System.out.println("Day of the week is " + dayOfWeekString);
	}
}