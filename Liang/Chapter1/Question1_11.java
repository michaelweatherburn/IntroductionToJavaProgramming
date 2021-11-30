public class Exercise1_11 {
	public static void main(String[] args) {
		final int BIRTHS_PER_SECOND = 7;
		final int DEATHS_PER_SECOND = 13;
		final int IMMIGRATIONS_PER_SECOND = 45;
		final long SECONDS_PER_YEAR = 60 * 60 * 24 * 365;
		double currentPopulation = 312_032_486;

		double birthsPerYear = SECONDS_PER_YEAR / BIRTHS_PER_SECOND;
		double deathsPerYear = SECONDS_PER_YEAR / DEATHS_PER_SECOND;
		double immigrationsPerYear = SECONDS_PER_YEAR / DEATHS_PER_SECOND;

		double cumulativeBirthCount = 0;
		double cumulativeDeathCount = 0;
		double cumulativeImmigrationCount = 0;

		long runningPopulationCount = (long) currentPopulation;
		System.out.println("Year 0: " + runningPopulationCount);
		for (int i = 0; i < 5; i++) {
			cumulativeBirthCount += birthsPerYear;
			cumulativeDeathCount += deathsPerYear;
			cumulativeImmigrationCount += immigrationsPerYear;
			runningPopulationCount += (long) (Math.floor(cumulativeBirthCount) - Math.floor(cumulativeDeathCount) + Math.floor(cumulativeImmigrationCount));
			System.out.println("Year " + (i + 1) + ": " + runningPopulationCount);
		}
	}
}