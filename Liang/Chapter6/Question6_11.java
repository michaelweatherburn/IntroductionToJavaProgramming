public class Question6_11 {
	public static final double EPSILON_DOUBLE = 1E-16;
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		while (salesAmount > 0.0) {
			if (salesAmount >= 10000.01) {
				commission += (0.12 * (salesAmount - 10000.00));
				salesAmount = 10000.00;
			} else if (5000.01 <= salesAmount && salesAmount <= 10000.00)
			{
				commission += (0.10 * (salesAmount - 5000.00));
				salesAmount = 5000.00;
			}
			else if (0.01 <= salesAmount && salesAmount <= 5000.00) {
				commission += (0.08 * salesAmount);
				salesAmount = 0.0;
			}
		}
		return commission;
	}

	public static void main(String[] args) {
		int salesAmount = 10000;
		System.out.printf("%-20s%20s\n", "Sales Amount", "Commission");
		System.out.printf("%20s%20s\n", "--------------------", "--------------------");
		for (int i = 1; i < 20; i++, salesAmount += 5000) {
					System.out.printf("%-20d%20.1f\n", salesAmount, computeCommission(salesAmount));
					//an implicit cast from int to double is possible - the actual parameters (arguments) must match the formal parameters in compatible type only
		}
	}
}