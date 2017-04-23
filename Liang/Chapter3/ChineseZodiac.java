import java.util.Scanner;
public class ChineseZodiac
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter the year. ");
    short year = scannerObject.nextShort();


    switch(year % 12)
    {
      case 0: System.out.println("Your zodiac is Monkey. ");
      break;

      case 1: System.out.println("Your zodiac is Rooster. ");
      break;

      case 2: System.out.println("Your zodiac is dog. ");
      break;

      case 3: System.out.println("Your zodiac is pig. ");
      break;

      case 4: System.out.println("Your zodiac is rat. ");
      break;

      case 5: System.out.println("Your zodiac is ox. ");
      break;

      case 6: System.out.println("Your zodiac is tiger. ");
      break;

      case 7: System.out.println("Your zodiac is rabbit. ");
      break;

      case 8: System.out.println("Your zodiac is dragon. ");
      break;

      case 9: System.out.println("Your zodiac is snake. ");
      break;

      case 10: System.out.println("Your zodiac is horse. ");
      break;

      case 11: System.out.println("Your zodiac is sheep. ");
      break;

      //no default required: the cases WILL be from 0 to 11, that is how the modulo operator works
    }
  }
}
