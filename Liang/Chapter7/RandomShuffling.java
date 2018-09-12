import java.util.Scanner;
public class RandomShuffling {
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

		for (int i = 0; i < myList.length; i++) {
			int j = (int) (Math.random() * myList.length);
			//swap code
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}

		System.out.println("List after shuffling: ");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		System.out.println();
	}
}