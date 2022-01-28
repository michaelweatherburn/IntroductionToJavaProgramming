	import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string that needs to be checked. ");
		String inputString = scanner.nextLine();

		int low = 0;	//the index of the first character in the String
		int high = inputString.length() - 1;	// the index of the last character in the String

		boolean isPalindrome = true;
		while (low < high)
		{
			if (inputString.charAt(low) != inputString.charAt(high))
			{
				isPalindrome = false;
				break;
			}

			low++;
			high--;
		}

		if (isPalindrome)
			System.out.println(inputString + " is a palindrome. ");
		else
			System.out.println(inputString + " is not a palindrome. ");
	}
}