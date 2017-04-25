import java.util.Scanner;

public class Question3_11
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    int month, year, numberOfDays = 0;
    String monthName = null;
    boolean isLeapYear;

    System.out.print("Enter the month (1-12): ");
    month = scannerObject.nextInt();

    System.out.print("Enter the year: ");
    year = scannerObject.nextInt();

    //Step 1: Check the "leapness" of the leap year
    isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    //Step 2: Prepare the monthName switch
    switch(month)
    {
      case 1: monthName = "January";
      numberOfDays = 31;
      break;
      case 2: monthName = "February";
      numberOfDays = isLeapYear ? 29 : 28;
      break;
      case 3: monthName = "March";
      numberOfDays = 31;
      break;
      case 4: monthName = "April";
      numberOfDays = 30;
      break;
      case 5: monthName = "May";
      numberOfDays = 31;
      break;
      case 6: monthName = "June";
      numberOfDays = 30;
      break;
      case 7: monthName = "July";
      numberOfDays = 31;
      break;
      case 8: monthName = "August";
      numberOfDays = 31;
      break;
      case 9: monthName = "September";
      numberOfDays = 30;
      break;
      case 10: monthName = "October";
      numberOfDays = 31;
      break;
      case 11: monthName = "November";
      numberOfDays = 30;
      break;
      case 12: monthName = "December";
      numberOfDays = 31;
      break;
    }

    System.out.print(monthName + " " + year + " has " + numberOfDays + " days. ");
  }
}
