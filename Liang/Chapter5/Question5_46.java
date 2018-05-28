import java.util.Scanner;
public class Question5_46
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		String reverse = "";
		for (int i = inputString.length() - 1; i >= 0; i--)
		{
			reverse += inputString.charAt(i);
		}
		System.out.println("The reversed string is " + reverse);
	}
}