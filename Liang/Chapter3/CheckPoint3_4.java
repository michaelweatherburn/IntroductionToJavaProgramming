import java.util.Scanner;
public class CheckPoint3_4
{
  public static void main(String[] args)
  {
    int x = 0, y = 0;
    Scanner scannerObject = new Scanner(System.in);
    System.out.println("Enter a value for y. ");
    y = scannerObject.nextInt();

    if(y > 0)
    {
      x = 1;
    }
  }
}
