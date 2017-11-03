import java.util.Scanner;
public class SmallestFactor2 {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the number. ");
		int n = scannerObject.nextInt();

		boolean found = false;
		int factor = 2;
		while (factor <= n && !found) {
			if (n % factor == 0)
				found = true;
			else
				factor++;
		}

		System.out.println("The smallest factor other than 1 for " + n + " is " + factor);
	}
}