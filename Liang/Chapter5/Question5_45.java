import java.util.Scanner;
public class Question5_45
{
	public static final int NUMBER_OF_QUESTIONS = 10;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double sum = 0.0;
		double squaredSum = 0.0;
		double currentValue = 0.0;
		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++)
		{
			currentValue = scanner.nextDouble();
			sum += currentValue;
			squaredSum += Math.pow(currentValue, 2);
		}

		double mean = sum / NUMBER_OF_QUESTIONS;
		double standardDeviation = Math.sqrt((squaredSum - (Math.pow(sum, 2) / NUMBER_OF_QUESTIONS)) / (NUMBER_OF_QUESTIONS - 1));
		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.5f", standardDeviation);
	}
}