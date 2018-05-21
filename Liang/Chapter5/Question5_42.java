import java.util.Scanner;
public class Question5_42
{
	public static final double BASE_SALARY = 5000;
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expected salary. (Must be greater than 5000.00)");
		double salarySought = scanner.nextDouble();
		double salesAmount = 0.0;

		for (double commissionSought = salarySought - BASE_SALARY; commissionSought > 0.0;)
		{
			if (commissionSought > 900.0)
			{
				salesAmount += ((commissionSought - 900.0) / 0.12);
				commissionSought = 900.0;
			}
			else if (commissionSought > 400.0)
			{
				salesAmount += ((commissionSought - 400.0) / 0.1);
				commissionSought = 400.0;
			}
			else if (commissionSought > 0.0)
			{
				salesAmount += (commissionSought / 0.08);
				commissionSought = 0.0;
			}
		}

		System.out.println("Sales Amount: " + salesAmount);
	}
}