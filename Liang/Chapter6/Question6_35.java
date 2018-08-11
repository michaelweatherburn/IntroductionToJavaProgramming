import java.util.Scanner;
public class Question6_35 {
	public static double area(double side) {
		return ((5 * side * side) / (4 * Math.tan(Math.PI / 5)));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = scanner.nextDouble();
		System.out.println("The area of the pentagon is " + area(side));
	}
}