import java.util.Scanner;

public class Question12
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter the distance in miles. ");
    double distanceMiles = scannerObject.nextDouble();
    double distanceKilometers = distanceMiles * 1.6;

    System.out.println("Enter time as directed. ");
    System.out.print("Hours: ");
    double hours =scannerObject.nextDouble();

    System.out.print("Minutes: ");
    double minutes =scannerObject.nextDouble();

    System.out.print("Seconds: ");
    double seconds = scannerObject.nextDouble();

    hours = hours + minutes / 60 + seconds / 3600;
    double average = distanceKilometers / hours;

    System.out.println("Average Speed: " + average);
  }
}
