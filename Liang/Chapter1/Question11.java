public class Question11{
  public static void main(String[] args)
  {
    final long CURRENT_POPULATION = 312032486;
    long runningPopulationCount = CURRENT_POPULATION;
    long secondsInAYear = 365 * 24 * 60 * 60;

    long yearlyBirths = secondsInAYear/7;
    long yearlyDeaths = secondsInAYear/13;
    long yearlyImmigrants = secondsInAYear/45;

    System.out.println("Before: " + CURRENT_POPULATION);
    for(int i = 0; i <= 5; i++)
    {
      runningPopulationCount = runningPopulationCount + yearlyBirths - yearlyDeaths + yearlyImmigrants;
      System.out.println("After Year " + i +": " + runningPopulationCount);
    }
    
  }
}
