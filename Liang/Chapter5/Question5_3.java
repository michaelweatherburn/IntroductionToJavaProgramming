import java.util.Scanner;
public class Question5_3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%-8s%8s\n", "Kilograms", "Pounds");
		for (int i = 1; i < 200; i++)
		{
			System.out.printf("%-8d%8.1f\n", i, (i * 2.2));
		}
	}
}