import java.util.Scanner;
public class FallthroughExample
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the day number. (0-6)");
		byte dayOfWeek = scanner.nextByte();
		scanner.close();

		switch (dayOfWeek)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			//good practice: always mention in comments that you've omitted break statements on purpose
			case 5: System.out.println("This is a weekday. ");
							break;
			case 6:
			case 0: System.out.println("This is a weekend. ");
							break;
			default: System.out.println("Invalid input. ");
		}
	}
}
