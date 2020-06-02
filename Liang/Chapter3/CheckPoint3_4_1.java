import java.util.Scanner;

public class CheckPoint3_4_1
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);

    int score;
    double payScale = 19000;

    System.out.print("Enter score: ");
    score = scannerObject.nextInt();
    scannerObject.close();

    if(score > 90)
    {
      payScale *= 1.03;
    }
    else
    {
      payScale *= 1.01;
    }
    System.out.println("New payscale: " + payScale);
  }
}
