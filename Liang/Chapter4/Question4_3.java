import java.util.Scanner;
public class Question4_3
{
  private static final String ATLANTA_GPS_COORDINATES = "33.7490, 84.3880";
  private static final String ORLANDO_GPS_COORDINATES = "28.5383, 81.3792";
  private static final String SAVANNAH_GPS_COORDINATES = "32.0835, 81.0998";
  private static final String CHARLOTTE_GPS_COORDINATES = "35.2271, 80.8431";

  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double atlanta_latitude = Double.parseDouble(ATLANTA_GPS_COORDINATES.substring(0, ATLANTA_GPS_COORDINATES.indexOf(',')));
    double atlanta_longitude = Double.parseDouble(ATLANTA_GPS_COORDINATES.substring(ATLANTA_GPS_COORDINATES.lastIndexOf(' ')));

    double orlando_latitude = Double.parseDouble(ORLANDO_GPS_COORDINATES.substring(0, ORLANDO_GPS_COORDINATES.indexOf(',')));
    double orlando_longitude = Double.parseDouble(ORLANDO_GPS_COORDINATES.substring(ORLANDO_GPS_COORDINATES.lastIndexOf(' ')));

    double savannah_latitude = Double.parseDouble(SAVANNAH_GPS_COORDINATES.substring(0, SAVANNAH_GPS_COORDINATES.indexOf(',')));
    double savannah_longitude = Double.parseDouble(SAVANNAH_GPS_COORDINATES.substring(SAVANNAH_GPS_COORDINATES.lastIndexOf(' ')));

    double charlotte_latitude = Double.parseDouble(CHARLOTTE_GPS_COORDINATES.substring(0, CHARLOTTE_GPS_COORDINATES.indexOf(',')));
    double charlotte_longitude = Double.parseDouble(CHARLOTTE_GPS_COORDINATES.substring(CHARLOTTE_GPS_COORDINATES.lastIndexOf(' ')));

    
  }
}
