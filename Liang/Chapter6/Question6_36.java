import java.util.Scanner;
public class Question6_36 {
	public static double area(int n, double side) {
		return ((n * side * side) / (4 * Math.tan(Math.PI / n)));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int n = scanner.nextInt();
		System.out.println("Enter the side: ");
		double side = scanner.nextDouble();
		System.out.println("The area of the polygon is " + area(n, side));
	}
}