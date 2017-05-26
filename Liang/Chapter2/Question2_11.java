import java.util.Scanner;

public class Question2_11
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    long currentPopulation = 312_032_486;
    long runningPopulation = currentPopulation;
    System.out.print("Enter the number of years you need to project population for. ");
    int numberOfYears = scannerObject.nextInt();

    for(int i = 1; i <= numberOfYears; i++)
    {
      runningPopulation += (365 * 24 * 60 * 60)*(1/7.0 - 1/13.0 + 1/45.0);
      System.out.println("After Year " + i + ": " + runningPopulation);
    }
  }
}
