public class Question1_11 {
	public static void main(String[] args) {
		final int NEW_BIRTH_TIME_IN_SECONDS = 7;
		final int NEW_DEATH_TIME_IN_SECONDS = 13;
		final int NEW_IMMIGRATION_TIME_IN_SECONDS = 45;
		final long SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
		double currentPopulation = 312_032_486;

		double birthsPerYear = (double) SECONDS_PER_YEAR / NEW_BIRTH_TIME_IN_SECONDS;
		double deathsPerYear = (double) SECONDS_PER_YEAR / NEW_DEATH_TIME_IN_SECONDS;
		double immigrationsPerYear = (double) SECONDS_PER_YEAR / NEW_IMMIGRATION_TIME_IN_SECONDS;

		double cumulativeBirthCount = 0;
		double cumulativeDeathCount = 0;
		double cumulativeImmigrationCount = 0;

		long runningPopulationCount = (long) currentPopulation;
		System.out.println("Year 0: " + runningPopulationCount);
		for (int i = 0; i < 5; i++) {
			cumulativeBirthCount += birthsPerYear;
			cumulativeDeathCount += deathsPerYear;
			cumulativeImmigrationCount += immigrationsPerYear;
			runningPopulationCount = (long) (currentPopulation) + (long) (cumulativeBirthCount) - (long) cumulativeDeathCount + (long) cumulativeImmigrationCount;
			System.out.println("Year " + (i + 1) + ": " + runningPopulationCount);
		}
	}
}