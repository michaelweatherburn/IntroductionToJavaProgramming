import java.util.Scanner;
public class Question5_4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%-10s%-10s\n", "Miles", "Kilometers");
		for (int i = 1; i <= 10; i++)
		{
			System.out.printf("%-10d%-10.3f\n", i, (i * 1.609));
		}
	}
}