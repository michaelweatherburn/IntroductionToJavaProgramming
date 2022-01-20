import java.util.Scanner;

public class Question3_7
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);

		double amount;
		int numberOfOneDollars, numberOfCents, numberOfPennies, numberOfNickels, numberOfQuarters, numberOfDimes;

		System.out.print("Enter the amount. ");
		amount = scannerObject.nextDouble();
		scannerObject.close();

		numberOfCents = (int)(amount * 100); //filtered out the unnecessary digits
		numberOfOneDollars = numberOfCents / 100;
		numberOfCents %= 100;

		numberOfQuarters = numberOfCents / 25;
		numberOfCents %= 25;

		numberOfDimes = numberOfCents / 10;
		numberOfCents %= 10;

		numberOfNickels = numberOfCents / 5;
		numberOfCents %= 5;

		numberOfPennies = numberOfCents;

		//now the interesting part: check which of these have values greater than 0
		System.out.println("Your amount " + amount + " consists of: ");

		if(numberOfOneDollars == 1)
			System.out.println(numberOfOneDollars + " Dollar");
		else if(numberOfOneDollars > 1)
			System.out.println(numberOfOneDollars + " Dollars");

		if(numberOfQuarters == 1)
			System.out.println(numberOfQuarters + " Quarter");
		else if(numberOfOneDollars > 1)
			System.out.println(numberOfQuarters + " Quarters");

		if(numberOfDimes == 1)
			System.out.println(numberOfDimes + " Dime");
		else if(numberOfDimes > 1)
			System.out.println(numberOfDimes + " Dimes");

		if(numberOfNickels == 1)
			System.out.println(numberOfNickels + " Nickel");
		else if(numberOfNickels > 1)
			System.out.println(numberOfNickels + " Nickels");

		if(numberOfPennies == 1)
			System.out.println(numberOfPennies + " Penny");
		else if(numberOfPennies > 1)
			System.out.println(numberOfPennies + " Pennies");

			//again, a lot of code that could have avoided duplication, if only we knew methods. I am thinking of revisiting all these questions once methods are done
	}
}
