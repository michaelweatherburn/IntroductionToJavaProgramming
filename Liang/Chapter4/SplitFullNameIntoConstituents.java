import java.util.Scanner;
public class SplitFullNameIntoConstituents
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the full name of the person. ");
    String fullName = scanner.nextLine();
    fullName = fullName.trim();
    //remove any useless extra characters from the string

    String firstName = null, lastName = null;

    int positionOfSpaceCharacterInString = fullName.indexOf(' ');
    if(positionOfSpaceCharacterInString == -1)
    {
      //the character is not present in the string, and hence this cannot be a fullname
      System.out.println("The provided name doesn't contain the surname. ");
    }
    else
    {
      //there are spaces in the name, let's split the name
      firstName = fullName.substring(0, positionOfSpaceCharacterInString);
      lastName = fullName.substring(positionOfSpaceCharacterInString + 1);

      System.out.println("First Name: " + firstName);
      System.out.println("Last Name: " + lastName);
    }





  }
}
