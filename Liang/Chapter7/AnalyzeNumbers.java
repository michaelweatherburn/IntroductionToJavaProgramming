import java.util.Scanner;
public class AnalyzeNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs: ");
		int numberOfInputs = scanner.nextInt();

		double[] numbers = new double[numberOfInputs];
		System.out.println("Enter " + numberOfInputs + " elements consecutively: ");
		double sum = 0;
		for (int i = 0; i < numberOfInputs; i++) {
			numbers[i] = scanner.nextDouble();
			sum += numbers[i];
		}

		double average = sum / numberOfInputs;

		int numbersGreaterThanAverage = 0;
		for (double number : numbers) {
			if (number > average) {
				numbersGreaterThanAverage++;
			}
		}

		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + numbersGreaterThanAverage);
	}
}