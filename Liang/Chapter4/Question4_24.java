import java.util.Scanner;
public class Question4_24
{
  public static void main(String[] args)
  {
    Scanner scanner  = new Scanner(System.in);
    String firstCity = null, secondCity = null, thirdCity = null, swap = null;

    //input
    System.out.print("Enter the first city: ");
    firstCity = scanner.nextLine();

    System.out.print("Enter the second city: ");
    secondCity = scanner.nextLine();

    System.out.print("Enter the third city: ");
    thirdCity = scanner.nextLine();

    if(firstCity.compareToIgnoreCase(secondCity) > 0)
    {
      swap = firstCity;
      firstCity = secondCity;
      secondCity = swap;
    }
    if(secondCity.compareToIgnoreCase(thirdCity) > 0)
    {
      swap = secondCity;
      secondCity = thirdCity;
      thirdCity = swap;
    }
    if(firstCity.compareToIgnoreCase(secondCity) > 0)
    {
      swap = firstCity;
      firstCity = secondCity;
      secondCity = swap;
    }

    System.out.println("The three cities in ascending order are: " + firstCity + " " + secondCity + " " + thirdCity);
  }
}
