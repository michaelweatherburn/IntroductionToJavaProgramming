import java.util.Scanner;
public class Question6_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the three sides consecutively: ");
		double firstSide = scanner.nextDouble();
		double secondSide = scanner.nextDouble();
		double thirdSide = scanner.nextDouble();
		if (MyTriangle.isValid(firstSide, secondSide, thirdSide)) {
			System.out.println("The area of the triangle is " + MyTriangle.area(firstSide, secondSide, thirdSide));
		}
		else {
			System.out.println("Invalid input. ");
		}
	}
}