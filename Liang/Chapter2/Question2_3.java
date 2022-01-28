import java.util.Scanner;
public class Question2_3
{
	static private final double METERS_PER_FOOT = 0.305;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a value for feet: ");
		double valueInFeet = scanner.nextDouble();

		scanner.close();

		double valueInMeters = valueInFeet * METERS_PER_FOOT;
		System.out.println(valueInFeet + " feet is " + valueInMeters + " meters");
	}
}
