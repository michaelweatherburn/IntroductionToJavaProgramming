import java.util.Scanner;

public class InputTypeMismatch
{
  public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);
    int numberInput = scannerObject.nextInt();
    System.out.println(numberInput);
  }
}
