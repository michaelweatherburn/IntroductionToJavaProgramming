import java.util.Scanner;

public class Question1_9{
	public static void main(String[] args)
	{
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter the height of the rectangle. ");
			double height = scanner.nextDouble();

			System.out.println("Enter the width of the rectangle. ");
			double width = scanner.nextDouble();

			scanner.close();

			double area = height * width;
			double perimeter = 2 * (height + width);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);


	}
}
