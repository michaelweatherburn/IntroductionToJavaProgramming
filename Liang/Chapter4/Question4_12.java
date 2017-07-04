
import java.util.Scanner;
public class Question4_12
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    System.out.println("Enter a hexadecimal digit. ");
    char hexadecimalDigit = scannerObject.next().charAt(0);
    int correspondingNumber = 0;
    String binaryValue = null;

    //since loops haven't been explained to us, author wants us to do it the "mapping" way, instead of using a for loop to convert the hexadecimal value to decimal, and then binary. Use: switch case
    if(Character.isDigit(hexadecimalDigit))
    {
      //from numbers 0-9
      correspondingNumber = hexadecimalDigit - 48;
    }
    else if(hexadecimalDigit >= 'A' && hexadecimalDigit <= 'F')
    {
      //from number 10-15, entered as capital letters
      correspondingNumber = hexadecimalDigit - 65 + 10;
    }
    else if(hexadecimalDigit >= 'a' && hexadecimalDigit <= 'f')
    {
      //from 10-15, entered in lowercase letters
      correspondingNumber = hexadecimalDigit - 97 + 10;
    }
    else
    {
      System.out.println(hexadecimalDigit + " is an invalid input. ");
      System.exit(1);
    }

    switch(correspondingNumber)
    {
      case 0: binaryValue = "0000";
      break;
      case 1: binaryValue = "0001";
      break;
      case 2: binaryValue = "0010";
      break;
      case 3: binaryValue = "0011";
      break;
      case 4: binaryValue = "0100";
      break;
      case 5: binaryValue = "0101";
      break;
      case 6: binaryValue = "0110";
      break;
      case 7: binaryValue = "0111";
      break;
      case 8: binaryValue = "1000";
      break;
      case 9: binaryValue = "1001";
      break;
      case 10: binaryValue = "1010";
      break;
      case 11: binaryValue = "1011";
      break;
      case 12: binaryValue = "1100";
      break;
      case 13: binaryValue = "1101";
      break;
      case 14: binaryValue = "1110";
      break;
      case 15: binaryValue = "1111";
      break;
    }

    System.out.println("The binary value is " + binaryValue);
  }
}
