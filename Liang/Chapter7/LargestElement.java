import java.util.Scanner;
public class LargestElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements within the list: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];

		System.out.println("Enter " + myList.length + " elements: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scanner.nextDouble();
		}

		double max = myList[0];

		for (int i = 1; i < myList.length; i++) {	// we skipped the first element, as we have already set it to max
			if (myList[i] > max) {	// if the current element has a value greater than max...
				max = myList[i];	// replace the old value of the max with the current element's value
			}
		}

		System.out.println("Max: " + max);
	}
}