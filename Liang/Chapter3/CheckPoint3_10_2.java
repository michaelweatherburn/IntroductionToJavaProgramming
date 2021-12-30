import java.util.Scanner;
public class CheckPoint3_10_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number. ");
		double number = scanner.nextDouble();
		scanner.close();
		
		if (1 < number && number < 100) {
			System.out.println("The number is between 1 and 100, both exclusive. ");
		}

		if (number < 0 || (1 < number && number < 100)) {
			System.out.println("The number is between 1 and 100 (both exclusive), or is negative. ");
		}
	}
}