import java.util.Scanner;
public class Question5_5
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%-10s%10s%5s|%5s%-10s%10s\n", "Kilograms", "Pounds", "", "", "Pounds", "Kilograms");
		for (int i = 1, j = 20; i < 200 && j <= 515; i+=2, j+=5)
		{
			System.out.printf("%-10d%10.1f%5s|%5s%-10d%10.2f\n", i, (2.2 * i), "", "", j, (double) j / 2.2);
		}
	}
}