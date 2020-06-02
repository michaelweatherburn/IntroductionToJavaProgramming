import java.util.Scanner;

public class Question3_15
{
public static void main(String[] args)
{
	Scanner scannerObject = new Scanner(System.in);

	int providedNumber, generatedNumber;
	int providedUnit, generatedUnit;
	int providedTens, generatedTens;
	int providedHundreds, generatedHundreds;

	generatedNumber = (int)(Math.random() * 1000);
	System.out.print("Enter your guess three digit number. ");
	providedNumber = scannerObject.nextInt();
	scannerObject.close();

	providedUnit = providedNumber % 10;
	providedTens = (providedNumber / 10) % 10;
	providedHundreds = (providedNumber / 100) % 10;

	generatedUnit = generatedNumber % 10;
	generatedTens = (generatedNumber / 10) % 10;
	generatedHundreds = (generatedNumber / 100) % 10;

	if(providedNumber == generatedNumber)
	{
		System.out.println("Congratulations! You won 10000");
	}
	else if(
	        (generatedUnit == providedUnit ^ generatedUnit == providedTens ^ generatedUnit == providedHundreds)
	        &&
	        (generatedTens == providedUnit ^ generatedTens == providedTens ^ generatedTens == providedHundreds)
	        &&
	        (generatedHundreds == providedUnit ^ generatedHundreds == providedTens ^ generatedHundreds == providedHundreds)
	        )
	{
		System.out.print("Congratulations! You won 3000");
	}
	else if(
	        (generatedUnit == providedUnit ^ generatedUnit == providedTens ^ generatedUnit == providedHundreds)
	        ||
	        (generatedTens == providedUnit ^ generatedTens == providedTens ^ generatedTens == providedHundreds)
	        ||
	        (generatedHundreds == providedUnit ^ generatedHundreds == providedTens ^ generatedHundreds == providedHundreds)
	        )
	{
    System.out.println("Congratulations! You won 1000");
	}
  else
  {
    System.out.println("Sorry, better luck next time. ");
  }

  System.out.println("Winning number: " + generatedNumber);
}
}
