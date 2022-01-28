import java.util.Scanner;

public class Question3_8
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int firstNumber, secondNumber, thirdNumber;

		System.out.print("Enter three integers consecutively: ");
		firstNumber = scanner.nextInt();
		secondNumber = scanner.nextInt();
		thirdNumber = scanner.nextInt();
		scanner.close();

		//what is the best way to sort three numbers (if you can't have them as an array)?
		System.out.print("Sorted Order: ");
		if(firstNumber > secondNumber)
		{
			//figure out where in the three positions does c fit into
			if(thirdNumber < secondNumber)
			{
				System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
			}
			else if(thirdNumber > firstNumber)
			{
				System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
			}
			else
			{
				System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
			}
		}
		else  //assume that secondNumber > firstNumber
		{
			//figure out where c fits into
			if(thirdNumber < firstNumber)
			{
				System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
			}
			else if(thirdNumber > secondNumber)
			{
				System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
			}
			else
			{
				System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
			}
		}
	}
}
