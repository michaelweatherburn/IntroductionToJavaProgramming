import java.util.Scanner;
public class CopyingArrayReferenceVariables {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] firstReference;	// declared an array reference variable
		firstReference = new int[3];	// created a new array inside the heap and passed the reference to that array to the reference variable firstReference
		System.out.println("\nEnter three new values (stored using the second reference): ");
		for (int i = 0; i < 3; i++) {
			firstReference[i] = scanner.nextInt();
		}

		System.out.println("\nThe values (displayed using the first reference): ");
		for (int number: firstReference) {
			System.out.print(number + " ");
		}

		int[] secondReference;	// declared another array reference variable
		secondReference = firstReference; // as expected, the reference from the first variable is being copied over to the second variable, nothing more. This means that the array has not been copied - in fact, both array reference variables point to the same array within the heap. So changing the contents of the array using one reference variable would mean accessing the array using the other reference variable shows the changed values

		System.out.println("\nEnter three new values (stored using the second reference): ");
		for (int i = 0; i < 3; i++) {
			secondReference[i] = scanner.nextInt();
		}

		System.out.println("\nThe values (displayed using the first reference): ");
		for (int number: firstReference) {
			System.out.print(number + " ");
		}
	}
}