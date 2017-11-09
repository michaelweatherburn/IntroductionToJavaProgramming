import java.util.Scanner;
public class Palindrome2
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the input string. ");
		String inputString = scannerObject.nextLine();

		boolean isPalindrome = true;
		int i = 0;

		while (i <= inputString.length() / 2 - 1)		
		{
			if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i))
			{
				isPalindrome = false;
				break;
			}
			i++;
		}

		if (isPalindrome)
			System.out.println(inputString + " is a palindrome. ");
		else
			System.out.println(inputString + " is not a palindrome. ");
	}
}