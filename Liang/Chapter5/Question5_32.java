import java.util.Scanner;
public class Question5_32
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int enteredNumber = scannerObject.nextInt();

		int generatedTensDigit = (int) (Math.random() * 10);
		int generatedUnitDigit;
		do
		{
			generatedUnitDigit = (int) (Math.random() * 10);
		} while (generatedUnitDigit == generatedTensDigit);	// two unique digits generated, used the do-while since the unit digit has to be generated at least once

		int enteredUnitDigit = enteredNumber % 10;
		int enteredTensDigit = enteredNumber / 10;	// this depends on an assumption: the number contains only two digits

		System.out.println("Lottery Number: " + generatedTensDigit + generatedUnitDigit);

		if (enteredUnitDigit == generatedUnitDigit && enteredTensDigit == generatedTensDigit)
			System.out.println("Exact match: you win $10,000 ");
		else if (enteredUnitDigit == generatedTensDigit && enteredTensDigit == generatedUnitDigit)
			System.out.println("Match all digits: you win $3000 ");
		else if (enteredUnitDigit == generatedUnitDigit || enteredUnitDigit == generatedTensDigit || enteredTensDigit == generatedTensDigit || enteredTensDigit == generatedUnitDigit)
			System.out.println("Match one digit: you win $1,000 ");
		else
			System.out.println("Sorry, no match. ");
	}
}