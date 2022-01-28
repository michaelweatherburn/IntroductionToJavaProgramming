import java.util.Scanner;
public class Question4_25
{
  static final int lowermostUpperCaseLetterValue = 65;
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    double randomNumber = Math.random();

    String randomNumberString = ("" + randomNumber).substring(2);
    String licenseNumericPart = randomNumberString.substring(0,4);
    String licenseStringPart = "" + (char)((Integer.parseInt(randomNumberString.substring(4,6)) % 26) + lowermostUpperCaseLetterValue) +  (char)((Integer.parseInt(randomNumberString.substring(6,8)) % 26) + lowermostUpperCaseLetterValue) + (char)((Integer.parseInt(randomNumberString.substring(8,10)) % 26) + lowermostUpperCaseLetterValue);
    //that was really a shortcut. I took the double value (random) one, converted it into a string, and shaved off the characters before the decimal
    //then I picked 4 MSDs and separated them out for the numeric part
    //then, I picked numbers two at a time from the remaining numbers and I converted them into integers, modulo-ed them by 26, hereby generating 4 numbers between 0 and 25.
    //Then, I added those four numbers to the Unicode decimal value of the first uppercase letter (A, value 65) and converted the results into four characters. I concatenated the four chars to form the letters part.

    //putting it all together
    String licenseNumber = licenseStringPart + "-" + licenseNumericPart;
    System.out.println("A random license plate number is " + licenseNumber);

  }
}
