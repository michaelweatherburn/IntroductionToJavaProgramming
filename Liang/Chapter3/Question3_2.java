import java.util.Scanner;

public class Question3_2 {
public static void main(String[] args) {
	Scanner scannerObject = new Scanner(System.in);

	//generate three integers
	int firstNumber = (int)(Math.random() * 10);
	int secondNumber = (int)(Math.random() * 10);
	int thirdNumber = (int)(Math.random() * 10);

	int providedSum = 0, actualSum = 0;

	System.out.print("Enter the sum of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + ": ");
	providedSum = scannerObject.nextInt();
	actualSum = firstNumber + secondNumber + thirdNumber;

	if(providedSum == actualSum)
	{
		System.out.println("Your guess is right!");
	}
	else
	{
		System.out.println("Your guess is wrong. ");
	}
}
}
