import java.util.Scanner;

public class Question1_8{

	static final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius of the circle. ");
		double radius = scanner.nextDouble();
		scanner.close();

		double perimeter = 2 * PI * radius;
		double area = PI * radius * radius;

		System.out.println("Perimeter: " + perimeter);
		System.out.println("Area: " + area);
	}
}
