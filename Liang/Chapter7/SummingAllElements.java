import java.util.Scanner;
public class SummingAllElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements the array must have: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];
		double total = 0;
		System.out.println("Enter " + myList.length + " elements: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scanner.nextDouble();
		}	//read listSize values into the array

		for (int i = 0; i < myList.length; i++) {
			total += myList[i];	// add one element of the array to total per iteration
		}
		// by the time the second loop ends, total will contain the total of all elements within the array.
		System.out.println("Total: " + total);
	}
}