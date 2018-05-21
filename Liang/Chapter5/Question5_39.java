import java.util.Scanner;
public class Question5_39
{
	static final double SALARY_SOUGHT = 30000;
	static final double BASE_SALARY = 5000;
	static final double COMMISSION_SOUGHT = SALARY_SOUGHT - BASE_SALARY;
	// the goal salary is 30000 per year, and commission sought is goal salary minus base salary of 5000
	public static void main(String[] args)
	{
		Scanner scannerObject = new Scanner(System.in);
		double commissionSought = SALARY_SOUGHT - BASE_SALARY;
		double salesAmount = 0.0;
		do {
			if (commissionSought > 900.00)
			{
				salesAmount += ((commissionSought - 900.00) / 0.12);
				commissionSought = 900.00;
			}
			else if (commissionSought > 400.00)
			{
				salesAmount += ((commissionSought - 400.00) / 0.1);
				commissionSought = 400.00;
			}
			else if (commissionSought > 0.0)
			{
				salesAmount += (commissionSought / 0.08);
				commissionSought = 0.0;
			}
		} while (commissionSought > 0.0);
		System.out.println("Sales Amount: " + salesAmount);
	}
}
