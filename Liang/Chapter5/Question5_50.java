import java.util.Scanner;
public class Question5_50
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		int numberOfUpperCaseCharacters = 0;
		for (int i = 0, stringLength = inputString.length(); i <= stringLength - 1; i++)
			if (Character.isUpperCase(inputString.charAt(i)))
				numberOfUpperCaseCharacters++;

		System.out.println("The number of uppercase letters is " + numberOfUpperCaseCharacters);
	}
}