import java.util.Scanner;
public class DisplayingArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements the array has: ");
		int listSize = scanner.nextInt();
		double[] myList = new double[listSize];

		for (int i = 0; i < myList.length; i++) {
			myList[i] = (Math.random() * 100);	// some random values
		}

		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
	}
}