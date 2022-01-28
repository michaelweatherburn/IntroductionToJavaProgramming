//A modification of the program GuessBirthday.java

import java.util.Scanner;
public class Question4_10
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String set1 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
    String set2 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
    String set3 = "4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
    String set4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
    String set5 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
    char isBirthdayInSet1 = 'N', isBirthdayInSet2 = 'N', isBirthdayInSet3 = 'N', isBirthdayInSet4 = 'N', isBirthdayInSet5 = 'N';
    int birthday = 0;

    System.out.println("Does your birthday fall into this set? (Y/N)");
    System.out.println(set1);
    isBirthdayInSet1 = scanner.next().charAt(0);

    System.out.println("How about this one? (Y/N)");
    System.out.println(set2);
    isBirthdayInSet2 = scanner.next().charAt(0);

    System.out.println("Well, how about this one? (Y/N)");
    System.out.println(set3);
    isBirthdayInSet3 = scanner.next().charAt(0);

    System.out.println("And how about this set? (Y/N)");
    System.out.println(set4);
    isBirthdayInSet4 = scanner.next().charAt(0);

    System.out.println("Finally, does the birthday fall into this set? (Y/N)");
    System.out.println(set5);
    isBirthdayInSet5 = scanner.next().charAt(0);

    birthday += (isBirthdayInSet1 == 'Y' ? 1 : 0) + (isBirthdayInSet2 == 'Y' ? 2 : 0) + (isBirthdayInSet3 == 'Y' ? 4 : 0) + (isBirthdayInSet4 == 'Y' ? 8 : 0) + (isBirthdayInSet5 == 'Y' ? 16 : 0);

    System.out.println("Your birthday is " + birthday);
  }
}
