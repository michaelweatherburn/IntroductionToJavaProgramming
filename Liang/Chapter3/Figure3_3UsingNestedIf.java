import java.util.Scanner;

public class Figure3_3UsingNestedIf
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("Enter the score. ");
		score = scanner.nextInt();
		scanner.close();

		if(score > 90)
		{
			System.out.print("A");
		}
		else
		{
			if(score > 80)
			{
				System.out.print("B");
			}
			else
			{
				if(score > 70)
				{
					System.out.print("C");
				}
				else
				{
					if(score > 60)
					{
						System.out.print("D");
					}
					else
					{
						if(score > 33)
						{
							System.out.print("E");
						}
						else
						{
							System.out.print("F");
						}
					}
				}
			}
		}
	}
}

//This is an example of unneccesarily high levels of code nesting. Bad practice and should be avoided.
