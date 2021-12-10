import java.util.Scanner;
public class Question2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of the side and height of the equilateral triangle. ");
		double lengthOfSide = scanner.nextDouble();
		scanner.close();
		
		double area = Math.sqrt(3) * Math.pow(lengthOfSide, 2) / 4;
		double volume = area * lengthOfSide;

		System.out.println("The area is " + (int) (area * 100) / 100.0);
		System.out.println("The volume of the equalateral prism is " + ((int) (volume * 1000) / 1000.0));
	}
}