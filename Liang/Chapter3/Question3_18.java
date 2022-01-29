import java.util.Scanner;
public class Question3_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the weight of the package in pounds. ");
		double weightInPounds = scanner.nextDouble();
		scanner.close();

		double shippingCost = 0.0;

		if (0 < weightInPounds && weightInPounds <= 20) {
			
			if (0 < weightInPounds && weightInPounds <= 2) {
				shippingCost = 2.5;
			} else if (2 < weightInPounds && weightInPounds <= 4) {
				shippingCost = 4.5;
			} else if (4 < weightInPounds && weightInPounds <= 10) {
				shippingCost = 7.5;
			} else if (10 < weightInPounds && weightInPounds <= 20) {
				shippingCost = 10.5;
			}

			System.out.println("Shipping Cost: " + shippingCost);
		} else if (20 < weightInPounds) {
			System.out.println("The package cannot be shipped. ");
		} else {
			System.out.println("Package to be shipped cannot have negative weight. ");
		}
	}
}