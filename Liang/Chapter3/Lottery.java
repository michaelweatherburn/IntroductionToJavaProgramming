import java.util.Scanner;

public class Lottery
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int enteredNumber, generatedNumber;
		int enteredUnitDigit, enteredTensDigit;
		int generatedUnitDigit, generatedTensDigit;

		double award = 0.00;

		System.out.print("Enter your lottery pick (two digits). ");
		enteredNumber = scanner.nextInt();
		scanner.close();

		generatedNumber = (int)(Math.random() * 100.0);

		/*
		 made only to test the code

		System.out.println("Enter the lottery winning number. ");
		generatedNumber = scanner.nextInt();

		*/

		enteredUnitDigit = enteredNumber % 10;
		enteredTensDigit = enteredNumber / 10;
		//I'd earlier thought of doing (enteredNumber / 10) % 10, but later realised that (enteredNumber / 10) would evaluate to a single digit anyway. No point in the remainder operator

		generatedUnitDigit = generatedNumber % 10;
		generatedTensDigit = generatedNumber / 10;

		System.out.println("The lottery number is " + generatedNumber);

		if(enteredNumber == generatedNumber)
		{
			System.out.print("Full match. ");
			award = 10_000.00;
		}
		else if((enteredUnitDigit == generatedTensDigit) && (enteredTensDigit == generatedUnitDigit))
		{
			System.out.print("All digits match. ");
			award = 3_000;
		}
		else if( ((enteredUnitDigit == generatedUnitDigit) || (enteredUnitDigit == generatedTensDigit)) ^  ((enteredTensDigit == generatedUnitDigit) || (enteredTensDigit == generatedTensDigit)) )
		{
			System.out.print("One digit match. ");
			award = 1_000;
		}
		System.out.print("Your award: $" + award);
	}
}
