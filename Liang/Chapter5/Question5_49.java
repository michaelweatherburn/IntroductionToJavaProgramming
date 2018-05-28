import java.util.Scanner;
public class Question5_49
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		int numberOfVowels = 0, numberOfConsonants = 0;
		char currentCharacter = ' ';
		for (int i = 0, stringLength = inputString.length(); i <= stringLength - 1; i++)
		{
			currentCharacter = inputString.charAt(i);
			if (Character.isLetter(currentCharacter))
				if (currentCharacter == 'A' || currentCharacter == 'E' || currentCharacter == 'I' || currentCharacter == 'O' || currentCharacter == 'U' || currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u')
					numberOfVowels++;
				else
					numberOfConsonants++;
		}
		System.out.println("The number of vowels is " + numberOfVowels);
		System.out.println("The number of consonants is " + numberOfConsonants);
	}
}