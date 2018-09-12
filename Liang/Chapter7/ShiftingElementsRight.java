import java.util.Scanner;
public class ShiftingElementsRight {
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

		double temp = myList[myList.length - 1];	// retain the last element
		for (int i = myList.length - 1; i > 0; i--) {
			myList[i] = myList[i - 1];
		}
		myList[0] = temp;

		System.out.println("List after shifting each element to the right: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
	}
}