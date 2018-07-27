import java.util.Scanner;
public class Question6_5 {
	public static void displaySortedNumbers (double num1, double num2, double num3) {
		double largest = 0, middle = 0, smallest = 0;
		if (num1 > num2 && num1 > num3) {
			largest = num1;
			if (num2 > num3) {
				middle = num2;
				smallest = num3;
			}
			else {
				middle = num3;
				smallest = num2;
			}
		}
		else if (num2 > num1 && num2 > num3) {
			largest = num2;
			if (num1 > num3) {
				middle = num1;
				smallest = num3;
			}
			else {
				middle = num3;
				smallest = num1;
			}
		}
		else {
			largest = num3;
			if (num1 > num2) {
				middle = num1;
				smallest = num2;
			}
			else {
				middle = num2;
				smallest = num1;
			}
		}
		System.out.println("Correct Order: " + smallest + ", " + middle + ", " + largest);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		double firstNumber = scanner.nextDouble();
		double secondNumber = scanner.nextDouble();
		double thirdNumber = scanner.nextDouble();
		displaySortedNumbers(firstNumber, secondNumber, thirdNumber);		
	}
}