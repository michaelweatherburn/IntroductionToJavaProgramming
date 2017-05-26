import java.util.Scanner;

public class Question3_5
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    int today, daysElapsed, futureDay;
    String todayString = null, futureDayString = null;

    System.out.print("Enter today's day: ");
    today = scannerObject.nextInt();
    //assuming that the user knows better than to mess with the system and enter something within 0-6

    System.out.print("Enter the number of days that have elapsed since today: ");
    daysElapsed = scannerObject.nextInt();

    futureDay = (today + daysElapsed) % 7;

    switch(today)
    {
      case 1: todayString = "Monday";
      break;
      case 2: todayString = "Tuesday";
      break;
      case 3: todayString = "Wednesday";
      break;
      case 4: todayString = "Thursday";
      break;
      case 5: todayString = "Friday";
      break;
      case 6: todayString = "Saturday";
      break;
      case 0: todayString = "Sunday";
      break;
    }

    //notice that code duplication happens here. Had we known the concept of methods we could have called a method with a switch statement in it. Solving problems like these makes you fully appreciate the value of structures like methods and arrays and the like.

    switch(futureDay)
    {
      case 1: futureDayString = "Monday";
      break;
      case 2: futureDayString = "Tuesday";
      break;
      case 3: futureDayString = "Wednesday";
      break;
      case 4: futureDayString = "Thursday";
      break;
      case 5: futureDayString = "Friday";
      break;
      case 6: futureDayString = "Saturday";
      break;
      case 0: futureDayString = "Sunday";
      break;
    }

    System.out.print("Today is " + todayString + " and the future day is " + futureDayString);
    //I've been coding for three chapters, and I've not even touched loops.
    //Code duplication is already beginning to feel stupid
  }
}
