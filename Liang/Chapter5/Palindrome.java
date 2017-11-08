import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the input String. ");
		String inputString = scannerObject.nextLine();

		int inputStringLength = inputString.length();
		int i = 0;

		boolean isPalindrome = true;		
		while (i <= (inputStringLength / 2) - 1)
		{
			if(inputString.charAt(i) != inputString.charAt(inputStringLength - 1 - i))
			{
				isPalindrome = false;
				break;
			}
			i++;
		}

		if(isPalindrome)
			System.out.println("The given String is a palindrome. ");
		else
			System.out.println("The given String is not a palindrome. ");
	}

}