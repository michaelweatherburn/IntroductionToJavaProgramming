import java.util.Scanner;
public class LargestElementLastOccurrence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the list: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];

		System.out.println("Enter " + myList.length + " elements: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scanner.nextDouble();
		}

		double max = myList[0];	// the first element is the largest element as the array hasn't been traversed yet
		int indexOfMax = 0; // the index of the largest element is 0, for the above reason

		for (int i = 1; i < myList.length; i++) { 	// Again, we start from 1, because max already contains myList[0]
			if (myList[i] > max) {	//update the indexOfMax even if the current element has a value EQUAL to max
				max = myList[i];
				indexOfMax = i;
			}
		}

		System.out.println("Max: " + max + ", Index: " + indexOfMax);
	}
}