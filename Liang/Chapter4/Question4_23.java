import java.util.Scanner;
public class Question4_23
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    String employeeName = null;
    double weeklyWorkHours = 0, hourlyPayRate = 0, federalTaxRate = 0, stateTaxRate = 0;

    System.out.print("Enter employee's name: ");
    employeeName = scanner.nextLine();

    System.out.print("Enter Number of hours worked in a week: ");
    weeklyWorkHours = scanner.nextDouble();

    System.out.print("Enter Hourly pay rate: ");
    hourlyPayRate = scanner.nextDouble();

    System.out.print("Enter Feferal Tax Withholding Rate: ");
    federalTaxRate = scanner.nextDouble();

    System.out.print("Enter State Tax Withholding Rate: ");
    stateTaxRate = scanner.nextDouble();

    double grossPay = weeklyWorkHours * hourlyPayRate;
    double federalWithholding = grossPay * federalTaxRate;
    double stateWithholding = grossPay * stateTaxRate;
    double totalDeduction = federalWithholding + stateWithholding;
    double netPay = grossPay - totalDeduction;

    System.out.printf("\nEmployee Name: %s", employeeName);
    System.out.printf("\nHours Worked: $%3.2f", weeklyWorkHours);
    System.out.printf("\nPay Rate: $%3.2f", hourlyPayRate);
    System.out.printf("\nGross Pay: $%3.2f", grossPay);
    System.out.printf("\nDeductions:");
    System.out.printf("\n\tFederal Withholding (%3.2f%%): $%3.2f", 100 * federalTaxRate, federalWithholding);
    System.out.printf("\n\tState Withholding (%3.2f%%): $%3.2f", 100 * stateTaxRate, stateWithholding);
    System.out.printf("\n\tNet Deduction: $%3.2f", totalDeduction);
    System.out.printf("\nNet Pay: $%3.2f", netPay);
    //could not get exact output. Still can't get the issue here
  }
}
