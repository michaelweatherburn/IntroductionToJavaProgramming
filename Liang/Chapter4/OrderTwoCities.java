import java.util.Scanner;
public class OrderTwoCities
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the two city names, in two separate lines: ");

    String firstCity = scanner.nextLine();
    String secondCity = scanner.nextLine();

    System.out.print("The cities in alphabetical order are ");
    if(firstCity.compareTo(secondCity) < 0)
    {
      //the key thing to remember: if the CURRENT String is ahead, the result is positive
      System.out.print(firstCity + " " + secondCity);
    }
    else
    {
      System.out.print(secondCity + " "  + firstCity);
    }
  }
}
