import java.util.Scanner;
public class Question2_9
{
  public static void main(String[] args)
  {
    Scanner scannerObject = new Scanner(System.in);
    double finalVelocity, initialVelocity, time;

    System.out.print("Enter v0, v1 and t: ");
    initialVelocity = scannerObject.nextDouble();
    finalVelocity = scannerObject.nextDouble();
    time = scannerObject.nextDouble();
    scannerObject.close();

    double averageAcceleration = (finalVelocity - initialVelocity)/time;
    System.out.println("The average acceleration is " + averageAcceleration);
  }
}
