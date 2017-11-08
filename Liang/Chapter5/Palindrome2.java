import java.util.Scanner;
public class Palindrome2
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the input String. ");
		String inputString = scannerObject.nextLine();

		int low = 0;
		int high = inputString.length() - 1;

		boolean isPalindrome = true;
		while (low < high)
		{
			if(inputString.charAt(low) != inputString.charAt(high))
			{
				isPalindrome = false;
				break;
			}
			low++;
			high--;
		}

		if(isPalindrome)
			System.out.println("This string is a palindrome. ");
		else
			System.out.println("This string is not a palindrome. ");
	}
}