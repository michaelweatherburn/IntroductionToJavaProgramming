import java.util.Scanner;

public class Question1_10
{
  public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter the distance in km. ");
    double distance = scannerObject.nextDouble();

    System.out.println("Enter the time in hours, minutes and seconds. ");
    System.out.print("Hours: ");
    double hours = scannerObject.nextDouble();

    System.out.print("Minutes: ");
    double minutes = scannerObject.nextDouble();

    System.out.println("Seconds: ");
    double seconds = scannerObject.nextDouble();

    scannerObject.close();

    hours = hours + minutes / 60 + seconds / 3600;
    double distanceMiles = distance / 1.6;

    double average = distanceMiles/hours;
    System.out.println("Required average speed: " + average);
  }
}
