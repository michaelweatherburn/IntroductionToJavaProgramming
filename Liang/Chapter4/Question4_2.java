import java.util.Scanner;
public class Question4_2
{
  private final static double EARTH_RADIUS = 6371.01;
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter Point 1 (latitude and longitude) in degrees: ");
    String location1 = scannerObject.nextLine();
    System.out.println("Enter Point 2 (latitude and longitude) in degrees: ");
    String location2 = scannerObject.nextLine();

    double location1_latitude = Double.parseDouble(location1.substring(0, location1.indexOf(",")));
    double location1_longitude = Double.parseDouble(location1.substring(location1.lastIndexOf(" ")));

    double location2_latitude = Double.parseDouble(location2.substring(0, location2.indexOf(", ")));
    double location2_longitude = Double.parseDouble(location2.substring(location2.lastIndexOf(" ")));

    System.out.println(location1_latitude + " " + location1_longitude + " " + location2_latitude + " " + location2_longitude);

    location1_latitude = Math.toRadians(location1_latitude);
    location1_longitude = Math.toRadians(location1_longitude);

    location2_latitude = Math.toRadians(location2_latitude);
    location2_longitude = Math.toRadians(location2_longitude);

    System.out.println(location1_latitude + " " + location1_longitude + " " + location2_latitude + " " + location2_longitude);

    double distance = EARTH_RADIUS * Math.acos(Math.sin(location1_latitude) * Math.sin(location2_latitude) + Math.cos(location1_latitude) * Math.cos(location2_latitude) * Math.cos(location1_longitude - location2_longitude));

    System.out.println("The distance between the two points is " + distance);
  }
}
