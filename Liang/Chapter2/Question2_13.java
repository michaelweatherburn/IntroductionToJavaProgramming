import java.util.Scanner;
public class Question2_13
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    int numberOfMonths;
    double balanceUptoPreviousMonth = 0.0;
    double monthlyInterestRate = 0.05/12, runningAccountBalance = 0;

    System.out.print("Enter the monthly saving amount: ");
    monthlySavingAmount = scannerObject.nextDouble();

    System.out.println("Enter the number of months until which you're to calculate the amount. ");
    numberOfMonths = scannerObject.nextInt();
    scannerObject.close();

    for(int i = 1; i <= numberOfMonths; i++)
    {
      runningAccountBalance = (100 + balanceUptoPreviousMonth)*(1 + monthlyInterestRate);
      //System.out.println("Running account balance for month " + i + ": " + runningAccountBalance);
      balanceUptoPreviousMonth = runningAccountBalance;
    }

    System.out.println("After the " + numberOfMonths + " month, the accont balance: " + runningAccountBalance);
  }
}
