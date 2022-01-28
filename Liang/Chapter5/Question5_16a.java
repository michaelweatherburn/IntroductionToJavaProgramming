import java.util.Scanner;
public class Question5_16a
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input number. ");
		int inputInteger = scanner.nextInt();

		int count = 2;
		String output = "";
		while (inputInteger > 1)
		{
			while (inputInteger % count == 0)
			{
				inputInteger /= count;
				output += (count + ", ");
			}	//slight improvisation, so we don't have to go back to 2 every tiem we encounter a multiple of a larger number, say 5
				count++;
		}
		
		if (output.length() >= 2 && output.charAt(output.length() - 1) == ' ' && output.charAt(output.length() - 2) == ',')
		{
			output = output.substring(0, output.length() - 2);	//extract a subset of the string that contains all but the last two characters
			output += ".";
			System.out.println(output);
		}
	}
}