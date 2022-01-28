import java.util.Scanner; //Scanner class is inside the java.util package

public class ComputeAverage {
	public static void main(String[] args)
	{
		//create a (local) scanner object
		Scanner scanner = new Scanner(System.in);

		//prompt the user to enter three numbers consecutively
		System.out.println("Enter three numbers: ");

		double number1 = scanner.nextDouble();
		double number2 = scanner.nextDouble();
		double number3 = scanner.nextDouble();

		scanner.close();

		double average = ( number1 + number2 + number3) / 3.0;
		System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);
		
	}
}
