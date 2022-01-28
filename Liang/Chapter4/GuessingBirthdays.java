import java.util.Scanner;
public class GuessingBirthdays
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    String set1 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
    String set2 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
    String set3 = "4 5 6 7 12 13 14 15 18 19 22 23 27 28 30 31";
    String set4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
    String set5 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";

    System.out.println("There'll be five questions of the yes/no type. Please answer with a single character: Y/N.");

    System.out.println("Is the number any one of these? " + set1);
    boolean isWithinFirstSet = scanner.next().charAt(0) == 'Y' ? true : false;

    System.out.println("Is the number any one of these? " + set2);
    boolean isWithinSecondSet = scanner.next().charAt(0) == 'Y' ? true : false;

    System.out.println("Is the number any one of these? " + set3);
    boolean isWithinThirdSet = scanner.next().charAt(0) == 'Y' ? true : false;

    System.out.println("Is the number any one of these? " + set4);
    boolean isWithinFourthSet = scanner.next().charAt(0) == 'Y' ? true : false;

    System.out.println("Is the number any one of these? " + set5);
    boolean isWithinFifthSet = scanner.next().charAt(0) == 'Y' ? true : false;

    int number = (isWithinFirstSet ? 1 : 0) * Integer.parseInt(set1.substring(0, set1.indexOf(" "))) +
    (isWithinSecondSet ? 1 : 0) * Integer.parseInt(set2.substring(0, set2.indexOf(" "))) +
    (isWithinThirdSet ? 1 : 0) * Integer.parseInt(set3.substring(0, set3.indexOf(" "))) +
    (isWithinFourthSet ? 1 : 0) * Integer.parseInt(set4.substring(0, set4.indexOf(" "))) +
    (isWithinFifthSet ? 1 : 0) * Integer.parseInt(set5.substring(0, set5.indexOf(" ")));

    System.out.println("The number is " + number);
  }
}
