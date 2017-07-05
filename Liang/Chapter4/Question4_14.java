import java.util.Scanner;
public class Question4_14
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter a letter grade: ");
    char letterGrade = scannerObject.next().charAt(0);
    byte numericEquivalent = 0;

    //long-standing assumption: letter grades are ALWAYS in uppercase :)
    if(letterGrade >= 'A' && letterGrade <= 'D' || letterGrade == 'F')
    {
      System.out.print("The numeric value for grade " + letterGrade + " is ");
      switch(letterGrade)
      {
        case 'A': numericEquivalent = 4;
        break;
        case 'B': numericEquivalent = 3;
        break;
        case 'C': numericEquivalent = 2;
        break;
        case 'D': numericEquivalent = 1;
        break;
        case 'F': numericEquivalent = 0;
        break;
      }

      System.out.println(numericEquivalent);
    }
    else
    {
      System.out.println(letterGrade + " is an invalid grade. ");
    }
  }
}
