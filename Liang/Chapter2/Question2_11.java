import java.util.Scanner;
public class Question2_11 {
	public static void main(String[] args) {
		final int NEW_BIRTH_TIME_IN_SECONDS = 7;
		final int NEW_DEATH_TIME_IN_SECONDS = 13;
		final int NEW_IMMIGRATION_TIME_IN_SECONDS = 45;
		final long SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
		double currentPopulation = 312_032_486;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int numberOfYears = scanner.nextInt();
		scanner.close();

		double birthsPerYear = (double) SECONDS_PER_YEAR / NEW_BIRTH_TIME_IN_SECONDS;
		double deathsPerYear = (double) SECONDS_PER_YEAR / NEW_DEATH_TIME_IN_SECONDS;
		double immigrationsPerYear = (double) SECONDS_PER_YEAR / NEW_IMMIGRATION_TIME_IN_SECONDS;

		double cumulativeBirthCount = birthsPerYear * numberOfYears;
		double cumulativeDeathCount = deathsPerYear * numberOfYears;
		double cumulativeImmigrationCount = immigrationsPerYear * numberOfYears;

		long runningPopulationCount = (long) currentPopulation + (long) cumulativeBirthCount - (long) cumulativeDeathCount + (long) cumulativeImmigrationCount;

		System.out.println("The population in " + numberOfYears + " years is " + runningPopulationCount);
	}
}