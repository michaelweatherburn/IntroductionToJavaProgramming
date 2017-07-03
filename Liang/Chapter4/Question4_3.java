import java.util.Scanner;
public class Question4_3
{
  private static final String ATLANTA_GPS_COORDINATES = "33.7490, 84.3880";
  private static final String ORLANDO_GPS_COORDINATES = "28.5383, 81.3792";
  private static final String SAVANNAH_GPS_COORDINATES = "32.0835, 81.0998";
  private static final String CHARLOTTE_GPS_COORDINATES = "35.2271, 80.8431";
  private static final double EARTH_RADIUS = 6371.01;

  public static void main(String[] args)
  {
    //convert from String notation to individual variables
    Scanner scannerObject = new Scanner(System.in);
    double atlanta_latitude = Double.parseDouble(ATLANTA_GPS_COORDINATES.substring(0, ATLANTA_GPS_COORDINATES.indexOf(',')));
    double atlanta_longitude = Double.parseDouble(ATLANTA_GPS_COORDINATES.substring(ATLANTA_GPS_COORDINATES.lastIndexOf(' ')));

    double orlando_latitude = Double.parseDouble(ORLANDO_GPS_COORDINATES.substring(0, ORLANDO_GPS_COORDINATES.indexOf(',')));
    double orlando_longitude = Double.parseDouble(ORLANDO_GPS_COORDINATES.substring(ORLANDO_GPS_COORDINATES.lastIndexOf(' ')));

    double savannah_latitude = Double.parseDouble(SAVANNAH_GPS_COORDINATES.substring(0, SAVANNAH_GPS_COORDINATES.indexOf(',')));
    double savannah_longitude = Double.parseDouble(SAVANNAH_GPS_COORDINATES.substring(SAVANNAH_GPS_COORDINATES.lastIndexOf(' ')));

    double charlotte_latitude = Double.parseDouble(CHARLOTTE_GPS_COORDINATES.substring(0, CHARLOTTE_GPS_COORDINATES.indexOf(',')));
    double charlotte_longitude = Double.parseDouble(CHARLOTTE_GPS_COORDINATES.substring(CHARLOTTE_GPS_COORDINATES.lastIndexOf(' ')));

    //convert from degrees to radians (reuse variables)
    atlanta_latitude = Math.toRadians(atlanta_latitude);
    atlanta_longitude = Math.toRadians(atlanta_longitude);
    orlando_latitude = Math.toRadians(orlando_latitude);
    orlando_longitude = Math.toRadians(orlando_longitude);
    savannah_latitude = Math.toRadians(savannah_latitude);
    savannah_longitude = Math.toRadians(savannah_longitude);
    charlotte_latitude = Math.toRadians(charlotte_latitude);
    charlotte_longitude = Math.toRadians(charlotte_longitude);

    double ao_distance = EARTH_RADIUS * Math.acos(Math.sin(atlanta_latitude) * Math.sin(orlando_latitude) + Math.cos(atlanta_latitude) * Math.cos(orlando_latitude) * Math.cos(atlanta_longitude - orlando_longitude));

    double os_distance = EARTH_RADIUS * Math.acos(Math.sin(orlando_latitude) * Math.sin(savannah_latitude) + Math.cos(orlando_latitude) * Math.cos(savannah_latitude) * Math.cos(savannah_longitude - orlando_longitude));

    double as_distance = EARTH_RADIUS * Math.acos(Math.sin(atlanta_latitude) * Math.sin(savannah_latitude) + Math.cos(atlanta_latitude) * Math.cos(savannah_latitude) * Math.cos(atlanta_longitude - savannah_longitude));

    double ac_distance = EARTH_RADIUS * Math.acos(Math.sin(atlanta_latitude) * Math.sin(charlotte_latitude) + Math.cos(atlanta_latitude) * Math.cos(charlotte_latitude) * Math.cos(atlanta_longitude - charlotte_longitude));

    double cs_distance = EARTH_RADIUS * Math.acos(Math.sin(charlotte_latitude) * Math.sin(savannah_latitude) + Math.cos(charlotte_latitude) * Math.cos(savannah_latitude) * Math.cos(charlotte_longitude - savannah_longitude));

    //plot the coordinates relative to each other on a peice of paper, and find out their natural order. If you don't do this, and pick any three mutually exclusive points to form triangles, there's a possibility that the triangles end up inersect with each other. (Variables reused)

    double s = (ao_distance + os_distance + as_distance)/2;
    double areaOfFirstTriangle = Math.sqrt(s * (s - ao_distance) * (s - os_distance) * (s - as_distance));

    s = (ac_distance + cs_distance + as_distance)/2;
    double areaOfSecondTriangle = Math.sqrt(s * (s - ac_distance) * (s - cs_distance) * (s - as_distance));

    double totalArea = areaOfFirstTriangle + areaOfSecondTriangle;
    System.out.println("The area enclosed by the four cities is " + totalArea);
  }
}
