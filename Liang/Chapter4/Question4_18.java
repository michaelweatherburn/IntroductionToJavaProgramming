import java.util.Scanner;
public class Question4_18
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two characters: ");
    String inputString = scanner.next();
    String major = null, year = null;
    if(inputString.length() != 2)
    {
      System.out.println("Invalid input. ");
      System.exit(1);
    }

    char firstInputCharacter = inputString.charAt(0);
    char secondInputCharacter = inputString.charAt(1);

    switch(firstInputCharacter)
    {
      case 'M':
        major = "Mathematics";
        break;
      case 'I':
        major = "Information Technology";
        break;
      case 'C':
        major = "Computer Science";
        break;
      default:
        System.out.println("Invalid input. ");
        System.exit(1);
    }

    switch(secondInputCharacter)
    {
      case '1': year = "Freshman";
        break;
      case '2': year = "Sophomore";
        break;
      case '3': year = "Junior";
        break;
      case '4': year = "Senior";
        break;
      default: System.out.println("Invalid input. ");
      System.exit(0);
      break;
    }

    System.out.println(major + " " + year);
  }
}
