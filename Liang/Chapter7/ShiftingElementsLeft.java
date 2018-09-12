import java.util.Scanner;
public class ShiftingElementsLeft {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of list items: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];

		System.out.println("Enter " + myList.length + " elements: ");
		for (int i = 0; i < myList.length; i++) {
			myList[i] = scanner.nextDouble();
		}

		System.out.println("List in original order: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();

		double temp = myList[0];	// safely retain the first element (because on the first iteration of the for loop, this element's value would be overwritten)
		for (int i = 1; i < myList.length; i++) {	// skip the 0th element...
			myList[i - 1] = myList[i];	// copy every element over to the previous element
		}
		// at the end of the for loop, the last element is now present at two indices: myList.length - 2 and myList.length - 1. To fix that, we'll overwrite the value present in index myList.length - 1 with the value in temp
		myList[myList.length - 1] = temp;


		System.out.println("List after shifting each element to the left: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
	}
}