public class Question6_15 {
	public static double computeTax(int status, double taxableIncome) {
		double incomeTax = 0;
		if (status == 0)
		{
			//compute tax for single filers
			while (taxableIncome > 0.0) {
				if (372951.00 <= taxableIncome) {
					incomeTax += ((taxableIncome - 372950.00) * 0.35);
					taxableIncome = 372950.00;
				}
				else if (171551.00 <= taxableIncome && taxableIncome <= 372950.00) {
					incomeTax += ((taxableIncome - 171550.00) * 0.33);
					taxableIncome = 171550.00;
				}
				else if (82251.00 <= taxableIncome && taxableIncome <= 171550.00) {
					incomeTax += ((taxableIncome - 82250.0) * 0.28);
					taxableIncome = 82250.00;
				}
				else if (33951.00 <= taxableIncome && taxableIncome <= 82250.00) {
					incomeTax += ((taxableIncome - 33950.00) * 0.25);
					taxableIncome = 33950.00;
				}
				else if (8351.00 <= taxableIncome && taxableIncome <= 33950.00) {
					incomeTax += ((taxableIncome - 8350.00) * 0.15);
					taxableIncome = 8350.00;
				}
				else if (0.0 < taxableIncome && taxableIncome <= 8350.00) {
					incomeTax += (taxableIncome * 0.10);
					taxableIncome = 0.0;
				}
			}
		}
		else if (status == 1) {
			// compute tax for married filing jointly
			while (taxableIncome > 0.0) {
				if (372951.00 <= taxableIncome) {
					incomeTax += ((taxableIncome - 372950.00) * 0.35);
					taxableIncome = 372950.00;
				}
				else if (208851.00 <= taxableIncome && taxableIncome <= 372950.00) {
					incomeTax += ((taxableIncome - 208850.00) * 0.33);
					taxableIncome = 208850.00;
				}
				else if (137051.00 <= taxableIncome && taxableIncome <= 208850.00) {
					incomeTax += ((taxableIncome - 137050.00) * 0.28);
					taxableIncome = 137050.00;
				}
				else if (67901.00 <= taxableIncome && taxableIncome <= 137050.00) {
					incomeTax += ((taxableIncome - 67900.00) * 0.25);
					taxableIncome = 67900.00;
				}
				else if (16701.00 <= taxableIncome && taxableIncome <= 67900.00) {
					incomeTax += ((taxableIncome - 16700.00) * 0.15);
					taxableIncome = 16700.00;
				}
				else if (0.0 < taxableIncome && taxableIncome <= 16700.00) {
					incomeTax += (taxableIncome * 0.10);
					taxableIncome = 0.0;
				}
			}
		}
		else if (status == 2) {
			// compute tax for married filing separately
			while (taxableIncome > 0.0) {
				if (186476.00 <= taxableIncome) {
					incomeTax += ((taxableIncome - 186475.00) * 0.35);
					taxableIncome = 186475.00;
				}
				else if (104426.00 <= taxableIncome && taxableIncome <= 186475.00) {
					incomeTax += ((taxableIncome - 104425.00) * 0.33);
					taxableIncome = 104425.00;
				}
				else if (68526.00 <= taxableIncome && taxableIncome <= 104425.00) {
					incomeTax += ((taxableIncome - 68525.00) * 0.28);
					taxableIncome = 68525.00;
				}
				else if (33951.00 <= taxableIncome && taxableIncome <= 68525.00) {
					incomeTax += ((taxableIncome - 33950.00) * 0.25);
					taxableIncome = 33950.00;
				}
				else if (8351.00 <= taxableIncome && taxableIncome <= 33950.00) {
					incomeTax += ((taxableIncome - 8350.00) * 0.15);
					taxableIncome = 8350.00;
				}
				else if (0.0 < taxableIncome && taxableIncome <= 8350.00) {
					incomeTax += (taxableIncome * 0.10);
					taxableIncome = 0.0;
				}
			}
		}
		else if (status == 3) {
			// compute tax for the head of household
			while (taxableIncome > 0.0) {
				if (372951.00 <= taxableIncome) {
					incomeTax += ((taxableIncome - 372950.00) * 0.35);
					taxableIncome = 372950.00;
				}
				else if (190201.00 <= taxableIncome && taxableIncome <= 372950.00) {
					incomeTax += ((taxableIncome - 190200.00) * 0.33);
					taxableIncome = 190200.00;
				}
				else if (117451.00 <= taxableIncome && taxableIncome <= 190200.00) {
					incomeTax += ((taxableIncome - 117450.00) * 0.28);
					taxableIncome = 117450.00;
				}
				else if (45501.00 <= taxableIncome && taxableIncome <= 117450.00) {
					incomeTax += ((taxableIncome - 45500.00) * 0.25);
					taxableIncome = 45500.00;
				}
				else if (11951.00 <= taxableIncome && taxableIncome <= 45500.00) {
					incomeTax += ((taxableIncome - 11950.00) * 0.15);
					taxableIncome = 11950.00;
				}
				else if (0.0 < taxableIncome && taxableIncome <= 11951.00) {
					incomeTax += (taxableIncome * 0.10);
					taxableIncome = 0.0;
				}
			}
		}
		else {
			//display wrong status, return 0 taxable income
			System.out.println("Invalid status entered. ");
		}
		return incomeTax;
	}

	public static void main(String[] args) {
		System.out.println(computeTax(1, 50000));
		System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Taxable Income", "Single", "Married Joint", "Married Separate", "Head of a House");
		System.out.printf("%20s%20s%20s%20s%20s\n", "--------------------", "--------------------", "--------------------", "--------------------", "--------------------");
		for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {
			System.out.printf("%-20d%-20d%-20d%-20d%-20d\n", taxableIncome, Math.round(computeTax(0, taxableIncome)), Math.round(computeTax(1, taxableIncome)), Math.round(computeTax(2, taxableIncome)), Math.round(computeTax(3, taxableIncome)));
		}
	}
}
