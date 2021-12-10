import java.util.Scanner;
public class Question2_1{
	public static void main(String[] args) {
		final double KILOMETERS_PER_MILE = 1.6;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter distance in miles. ");
		double miles = scanner.nextDouble();
		scanner.close();

		double kilometers = miles * KILOMETERS_PER_MILE;

		System.out.println(((int) (miles * 1000) / 1000.0) + " miles is " + ((int) (kilometers * 1000) / 1000.0) + " kilometers");
	}
}