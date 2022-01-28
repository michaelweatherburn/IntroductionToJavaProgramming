import java.util.Scanner;

public class Question2_8
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    long timeSinceUnixEpoch = System.currentTimeMillis();
    System.out.print("Enter the time zone offset to GMT: ");
    byte timezoneOffsetHours = scanner.nextByte();
    scanner.close();

    timeSinceUnixEpoch /= 1000;
    timeSinceUnixEpoch += (timezoneOffsetHours * 60 * 60);  //add/subtract the requisite amount of hours to epoch time

    long minutes = timeSinceUnixEpoch / 60;
    long seconds = timeSinceUnixEpoch % 60;

    long hours = minutes / 60;
    minutes %= 60;

    hours %= 24;
    System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds);
  }
}
