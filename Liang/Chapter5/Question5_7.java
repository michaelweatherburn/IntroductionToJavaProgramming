public class Question5_7
{
	public static void main(String[] args)
	{
		double currentTuition = 10000;
		double rateOfIncrement = 0.05;
		int numberOfYears = 10;
		double totalTuitionFee = 0;

		double tuitionAfterTenYears = currentTuition * Math.pow((1 + rateOfIncrement), numberOfYears);
		System.out.printf("Tuition after ten years: %.2f\n", tuitionAfterTenYears);

		for (int i = 1; i <= 4; i++)
		{
			totalTuitionFee += tuitionAfterTenYears;
			tuitionAfterTenYears *= (1 + rateOfIncrement);
		}

		System.out.printf("Total 4-year tuition fee, counted after the ten years: %.2f\n", totalTuitionFee);
	}
}