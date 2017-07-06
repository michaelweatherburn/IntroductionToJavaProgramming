import java.util.Scanner;
public class Question4_17
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = scannerObject.nextInt();
    System.out.print("Enter a month: ");
    String month = scannerObject.next();
    int numberOfDays = 0;

    switch(month)
    {
      case "Jan":
      case "Mar":
      case "May":
      case "Jul":
      case "Aug":
      case "Oct":
      case "Dec":
        numberOfDays = 31;
        break;
      case "Apr":
      case "Jun":
      case "Sep":
      case "Nov":
        numberOfDays = 30;
        break;
      case "Feb":
        //this is where things get interesting: find if the year is a leap year or not
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
          numberOfDays = 29;
        }
        else
        {
          numberOfDays = 28;
        }
        break;
      default:
        System.out.println("Invalid input. ");
        System.exit(1); //not a good practice, though. Good for small programs like this one
        break;
    }

    System.out.println(month + " " + year + " has " + numberOfDays + " days");
  }
}
