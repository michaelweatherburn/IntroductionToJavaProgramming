public class Question6_16 {
	public static boolean isYearLeap(int year) {
		return (year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
	}
	public static int numberOfDaysInAYear(int year) {
		return isYearLeap(year) ? 366 : 365;
	}

	public static void main(String[] args) {
		System.out.printf("%-10s%-10s\n", "Year", "Days");
		System.out.printf("%10s%10s\n", "----------", "----------");
		for (int currentYear = 2000; currentYear <= 2020; currentYear++) {
			System.out.printf("%-10d%-10d\n", currentYear, numberOfDaysInAYear(currentYear));
		}
	}
}