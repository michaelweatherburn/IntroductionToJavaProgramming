import java.util.Scanner;
public class InitializingArraysWithInputValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of elements the array can have: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];

		System.out.print("Enter " + myList.length + " values: ");
		for (int i = 0; i < myList.length; i++)
			myList[i] = scanner.nextDouble();
	}
	// using a for loop to initialize the individual elements of an array
}