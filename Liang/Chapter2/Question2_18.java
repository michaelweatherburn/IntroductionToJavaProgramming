import java.util.Scanner;
public class Question2_18
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    System.out.print("Enter the number of entries that should appear in the table. ");
    int numberOfRows = scannerObject.nextInt();
    scannerObject.close();

    for(int i = 1; i <= numberOfRows; i++)
    {
      System.out.println(i + "\t" + (i + 1) + "\t" + (int) Math.pow(i, i+1));
    }
  }
}
