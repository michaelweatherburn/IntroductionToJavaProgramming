import java.util.Scanner;
public class Question5_16
{
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the input number. ");
		int inputInteger = scannerObject.nextInt();

		int count = 2;
		String output = "";
		while (inputInteger > 1)
		{
			if (inputInteger % count == 0)
			{
				inputInteger /= count;
				output += (count + ", ");
				count = 2;
			}
			else
			{
				count++;
			}
		}
		
		if (output.length() >= 2 && output.charAt(output.length() - 1) == ' ' && output.charAt(output.length() - 2) == ',')
		{
			output = output.substring(0, output.length() - 2);	//extract a subset of the string that contains all but the last two characters
			output += ".";
			System.out.println(output);
		}
	}
}