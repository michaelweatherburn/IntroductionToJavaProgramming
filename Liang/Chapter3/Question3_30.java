import java.util.Scanner;

public class Question3_30
{
  public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);

    String meridiem = "AM";
    long millisecondsSinceUnixEpoch = System.currentTimeMillis();
    //get the seconds
    long seconds = millisecondsSinceUnixEpoch / 1000;
    //get the minutes
    long minutes = seconds / 60;
    //now remove excess seconds from seconds
    seconds = seconds % 60;
    //get the hours
    long hours = minutes / 60;
    //now remove excess minutes from minutes
    minutes = minutes % 60;

    //add or subtract the offset from the hours
    System.out.print("Enter the time zone offset to GMT. ");
    long offsetInHours = scannerObject.nextInt();
    scannerObject.close();
    
    hours += offsetInHours;
    //remove whole days from hours
    hours %= 24;

    if(hours > 12)
    {
      hours %= 12;
      meridiem = "PM";
    }

    System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds  + " " + meridiem);

  }
}
