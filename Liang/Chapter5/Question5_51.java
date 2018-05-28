import java.util.Scanner;
public class Question5_51
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstString = scanner.nextLine();
		System.out.println("Enter the second string: ");
		String secondString = scanner.nextLine();
		String commonPrefix = "";
		for (int i = 0, length = Math.min(firstString.length(), secondString.length()); i <= length - 1; i++)
		{
			if (firstString.charAt(i) == secondString.charAt(i))
				commonPrefix += firstString.charAt(i);
			else
				break;
		}
		if (commonPrefix.length() > 0)
		{
			System.out.println("The common prefix is " + commonPrefix);
		}
		else
		{
			System.out.println(firstString + " and " + secondString + " have no common prefix");
		}
	}
}