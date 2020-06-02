import java.util.Scanner;

public class Question2_7
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter the number of minutes: ");
    long minutes = scannerObject.nextLong();
    scannerObject.close();

    long hours = minutes / 60;
    minutes = minutes / 60; //this part of the computation isn't useful

    long days = hours / 24;
    hours = hours / 24; //..and so is this part of the computation

    long years = days / 365;
    days = days % 365;

    System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
  }
}
