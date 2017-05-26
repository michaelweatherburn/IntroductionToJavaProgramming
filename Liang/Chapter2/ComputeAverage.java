import java.util.Scanner; //Scanner class is inside the java.util package

public class ComputeAverage {
  public static void main(String[] args)
  {
    //create a (local) scanner object
    Scanner scannerObject = new Scanner(System.in);

    //prompt the user to enter three numbers consecutively
    System.out.println("Enter three numbers: ");

    double number1 = scannerObject.nextDouble();
    double number2 = scannerObject.nextDouble();
    double number3 = scannerObject.nextDouble();

    double average = ( number1 + number2 + number3) / 3.0;
    System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
    
  }
}
