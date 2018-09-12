import java.util.Scanner;
public class InitializingArraysWithRandomValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements that the array should have: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];
		for (int i = 0; i < myList.length; i++) {
			myList[i] = (Math.random() * 100);	// unique numbers within [0.0, 100.0)
		}
	}
}