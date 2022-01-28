import java.util.Scanner;

public class Question3_19
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		double firstSide, secondSide, thirdSide;
		double perimeter;
		System.out.print("Enter the sides of the triangle. ");

		firstSide = scanner.nextDouble();
		secondSide = scanner.nextDouble();
		thirdSide = scanner.nextDouble();
		scanner.close();

		if(firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && thirdSide + firstSide > secondSide)
		{
			perimeter = firstSide + secondSide + thirdSide;
			System.out.print("Perimeter of the triangle: " + perimeter);
		}
		else
		{
			System.out.print("Invalid input. ");
		}
	}
}
