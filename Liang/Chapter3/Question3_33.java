import java.util.Scanner;
public class Question3_33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double firstPackageWeight = scanner.nextDouble();
		double firstPackagePrice = scanner.nextDouble();

		System.out.print("Enter weight and price for package 2: ");
		double secondPackageWeight = scanner.nextDouble();
		double secondPackagePrice = scanner.nextDouble();

		scanner.close();

		double firstPackageRate = firstPackageWeight / firstPackagePrice;
		double secondPackageRate = secondPackageWeight / secondPackagePrice;

		if (firstPackageRate > secondPackageRate) {
			System.out.println("Package 1 has a better price. ");
		} else if (firstPackageRate == secondPackageRate) {
			System.out.println("Two packages have the same price. ");
		} else {
			System.out.println("Package 2 has a better price. ");
		}
	}
}