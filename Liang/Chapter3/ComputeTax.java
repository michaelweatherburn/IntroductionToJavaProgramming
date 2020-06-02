import java.util.Scanner;

public class ComputeTax {

  private final static double SINGLE_UPPERLIMIT_TAXBRACKET1 = 8350.0;
  private final static double SINGLE_UPPERLIMIT_TAXBRACKET2 = 33950.0;
  private final static double SINGLE_UPPERLIMIT_TAXBRACKET3 = 82250.0;
  private final static double SINGLE_UPPERLIMIT_TAXBRACKET4 = 171550.0;
  private final static double SINGLE_UPPERLIMIT_TAXBRACKET5 = 372950.0;

  private final static double MFJQW_UPPERLIMIT_TAXBRACKET1 = 16700.0;
  private final static double MFJQW_UPPERLIMIT_TAXBRACKET2 = 67900.0;
  private final static double MFJQW_UPPERLIMIT_TAXBRACKET3 = 137050.0;
  private final static double MFJQW_UPPERLIMIT_TAXBRACKET4 = 208850.0;
  private final static double MFJQW_UPPERLIMIT_TAXBRACKET5 = 372950.0;

  private final static double MFS_UPPERLIMIT_TAXBRACKET1 = 8350.0;
  private final static double MFS_UPPERLIMIT_TAXBRACKET2 = 33950.0;
  private final static double MFS_UPPERLIMIT_TAXBRACKET3 = 68525.0;
  private final static double MFS_UPPERLIMIT_TAXBRACKET4 = 104425.0;
  private final static double MFS_UPPERLIMIT_TAXBRACKET5 = 186475.0;

  private final static double HH_UPPERLIMIT_TAXBRACKET1 = 11950.0;
  private final static double HH_UPPERLIMIT_TAXBRACKET2 = 45500.0;
  private final static double HH_UPPERLIMIT_TAXBRACKET3 = 117450.0;
  private final static double HH_UPPERLIMIT_TAXBRACKET4 = 190200.0;
  private final static double HH_UPPERLIMIT_TAXBRACKET5 = 372950.0;


//arguably the worst way to define constants. The proper way to do it is to create an array and store the contents there, indexed from 0 to 3. Hence we'll avoid a lot of duplicate code creation and end up with code that does NOT require writing the outer if that we'll write now
//but since the book hasn't introduced us to arrays yet, we'll have to do everything manually.
  public static void main(String[] args) {
    Scanner scannerObject = new Scanner(System.in);

    double taxableIncome = 0, incomeTax = 0;

     System.out.print("Enter the amount of taxable income. ");
     taxableIncome = scannerObject.nextDouble();

     scannerObject.close();

     //enable useful error message
     if(taxableIncome <= 0)
     {
       System.out.println("Invalid income entered. The program will now exit.");
       System.exit(1);
     }

     System.out.println("Tax Menu. ");
     System.out.println("0. Single Filers ");
     System.out.println("1. Married Filing Jointly / Qualified Widow(er)");
     System.out.println("2. Married Filing Separately. ");
     System.out.println("3. Head of Household. ");

     System.out.print("Enter your choice. ");
     byte choice = scannerObject.nextByte();

     if(choice == 0)
     {
       //calculate tax for single filers
       if(taxableIncome <= SINGLE_UPPERLIMIT_TAXBRACKET1)
       {
         incomeTax = taxableIncome * 0.10;
       }
       else if(taxableIncome <= SINGLE_UPPERLIMIT_TAXBRACKET2)
       {
         incomeTax = SINGLE_UPPERLIMIT_TAXBRACKET1 * 0.10 + (taxableIncome - SINGLE_UPPERLIMIT_TAXBRACKET1) * 0.15;
       }
       else if(taxableIncome <= SINGLE_UPPERLIMIT_TAXBRACKET3)
       {
         incomeTax = SINGLE_UPPERLIMIT_TAXBRACKET1 * 0.10 + (SINGLE_UPPERLIMIT_TAXBRACKET2 - SINGLE_UPPERLIMIT_TAXBRACKET1) * 0.15 + (taxableIncome - SINGLE_UPPERLIMIT_TAXBRACKET2) * 0.25;
       }
       else if(taxableIncome <= SINGLE_UPPERLIMIT_TAXBRACKET4)
       {
         incomeTax = SINGLE_UPPERLIMIT_TAXBRACKET1 * 0.10 + (SINGLE_UPPERLIMIT_TAXBRACKET2 - SINGLE_UPPERLIMIT_TAXBRACKET1) * 0.15 + (SINGLE_UPPERLIMIT_TAXBRACKET3 - SINGLE_UPPERLIMIT_TAXBRACKET2) * 0.25 + (taxableIncome - SINGLE_UPPERLIMIT_TAXBRACKET3) * 0.28;
       }
       else if(taxableIncome <= SINGLE_UPPERLIMIT_TAXBRACKET5)
       {
         incomeTax = SINGLE_UPPERLIMIT_TAXBRACKET1 * 0.10 + (SINGLE_UPPERLIMIT_TAXBRACKET2 - SINGLE_UPPERLIMIT_TAXBRACKET1) * 0.15 + (SINGLE_UPPERLIMIT_TAXBRACKET3 - SINGLE_UPPERLIMIT_TAXBRACKET2) * 0.25 + (SINGLE_UPPERLIMIT_TAXBRACKET4 - SINGLE_UPPERLIMIT_TAXBRACKET3) * 0.28 + (taxableIncome - SINGLE_UPPERLIMIT_TAXBRACKET4) * 0.33;
       }
       else
       {
         incomeTax = SINGLE_UPPERLIMIT_TAXBRACKET1 * 0.10 + (SINGLE_UPPERLIMIT_TAXBRACKET2 - SINGLE_UPPERLIMIT_TAXBRACKET1) * 0.15 + (SINGLE_UPPERLIMIT_TAXBRACKET3 - SINGLE_UPPERLIMIT_TAXBRACKET2) * 0.25 + (SINGLE_UPPERLIMIT_TAXBRACKET4 - SINGLE_UPPERLIMIT_TAXBRACKET3) * 0.28 + (SINGLE_UPPERLIMIT_TAXBRACKET5 - SINGLE_UPPERLIMIT_TAXBRACKET4) * 0.33 + (taxableIncome - SINGLE_UPPERLIMIT_TAXBRACKET5) * 0.35;
       }
     }
     else if(choice == 1)
     {
       if(taxableIncome <= MFJQW_UPPERLIMIT_TAXBRACKET1)
       {
         incomeTax = taxableIncome * 0.10;
       }
       else if(taxableIncome <= MFJQW_UPPERLIMIT_TAXBRACKET2)
       {
         incomeTax = MFJQW_UPPERLIMIT_TAXBRACKET1 * 0.10 + (taxableIncome - MFJQW_UPPERLIMIT_TAXBRACKET1) * 0.15;
       }
       else if(taxableIncome <= MFJQW_UPPERLIMIT_TAXBRACKET3)
       {
         incomeTax = MFJQW_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFJQW_UPPERLIMIT_TAXBRACKET2 - MFJQW_UPPERLIMIT_TAXBRACKET1) * 0.15 + (taxableIncome - MFJQW_UPPERLIMIT_TAXBRACKET2) * 0.25;
       }
       else if(taxableIncome <= MFJQW_UPPERLIMIT_TAXBRACKET4)
       {
        incomeTax = MFJQW_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFJQW_UPPERLIMIT_TAXBRACKET2 - MFJQW_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFJQW_UPPERLIMIT_TAXBRACKET3 - MFJQW_UPPERLIMIT_TAXBRACKET2) * 0.25 + (taxableIncome - MFJQW_UPPERLIMIT_TAXBRACKET3) * 0.28;
       }
       else if(taxableIncome <= MFJQW_UPPERLIMIT_TAXBRACKET5)
       {
        incomeTax = MFJQW_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFJQW_UPPERLIMIT_TAXBRACKET2 - MFJQW_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFJQW_UPPERLIMIT_TAXBRACKET3 - MFJQW_UPPERLIMIT_TAXBRACKET2) * 0.25 + (MFJQW_UPPERLIMIT_TAXBRACKET4 - MFJQW_UPPERLIMIT_TAXBRACKET3) * 0.28 + (taxableIncome - MFJQW_UPPERLIMIT_TAXBRACKET4) * 0.33;
       }
       else
       {
        incomeTax = MFJQW_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFJQW_UPPERLIMIT_TAXBRACKET2 - MFJQW_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFJQW_UPPERLIMIT_TAXBRACKET3 - MFJQW_UPPERLIMIT_TAXBRACKET2) * 0.25 + (MFJQW_UPPERLIMIT_TAXBRACKET4 - MFJQW_UPPERLIMIT_TAXBRACKET3) * 0.28 + (MFJQW_UPPERLIMIT_TAXBRACKET5 - MFJQW_UPPERLIMIT_TAXBRACKET4) * 0.33 + (taxableIncome - MFJQW_UPPERLIMIT_TAXBRACKET5) * 0.35;
       }
     }
     else if(choice == 2)
     {
       if(taxableIncome <= MFS_UPPERLIMIT_TAXBRACKET1)
       {
         incomeTax = taxableIncome * 0.10;
       }
       else if(taxableIncome <= MFS_UPPERLIMIT_TAXBRACKET2)
       {
         incomeTax = MFS_UPPERLIMIT_TAXBRACKET1 * 0.10 + (taxableIncome - MFS_UPPERLIMIT_TAXBRACKET1) * 0.15;
       }
       else if(taxableIncome <= MFS_UPPERLIMIT_TAXBRACKET3)
       {
         incomeTax = MFS_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFS_UPPERLIMIT_TAXBRACKET2 - MFS_UPPERLIMIT_TAXBRACKET1) * 0.15 + (taxableIncome - MFS_UPPERLIMIT_TAXBRACKET2) * 0.25;
       }
       else if(taxableIncome <= MFS_UPPERLIMIT_TAXBRACKET4)
       {
        incomeTax = MFS_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFS_UPPERLIMIT_TAXBRACKET2 - MFS_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFS_UPPERLIMIT_TAXBRACKET3 - MFS_UPPERLIMIT_TAXBRACKET2) * 0.25 + (taxableIncome - MFS_UPPERLIMIT_TAXBRACKET3) * 0.28;
       }
       else if(taxableIncome <= MFS_UPPERLIMIT_TAXBRACKET5)
       {
        incomeTax = MFS_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFS_UPPERLIMIT_TAXBRACKET2 - MFS_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFS_UPPERLIMIT_TAXBRACKET3 - MFS_UPPERLIMIT_TAXBRACKET2) * 0.25 + (MFS_UPPERLIMIT_TAXBRACKET4 - MFS_UPPERLIMIT_TAXBRACKET3) * 0.28 + (taxableIncome - MFS_UPPERLIMIT_TAXBRACKET4) * 0.33;
       }
       else
       {
        incomeTax = MFS_UPPERLIMIT_TAXBRACKET1 * 0.10 + (MFS_UPPERLIMIT_TAXBRACKET2 - MFS_UPPERLIMIT_TAXBRACKET1) * 0.15 + (MFS_UPPERLIMIT_TAXBRACKET3 - MFS_UPPERLIMIT_TAXBRACKET2) * 0.25 + (MFS_UPPERLIMIT_TAXBRACKET4 - MFS_UPPERLIMIT_TAXBRACKET3) * 0.28 + (MFS_UPPERLIMIT_TAXBRACKET5 - MFS_UPPERLIMIT_TAXBRACKET4) * 0.33 + (taxableIncome - MFS_UPPERLIMIT_TAXBRACKET5) * 0.35;
       }
     }
     else if(choice == 3)
     {
       if(taxableIncome <= HH_UPPERLIMIT_TAXBRACKET1)
       {
         incomeTax = taxableIncome * 0.10;
       }
       else if(taxableIncome <= HH_UPPERLIMIT_TAXBRACKET2)
       {
         incomeTax = HH_UPPERLIMIT_TAXBRACKET1 * 0.10 + (taxableIncome - HH_UPPERLIMIT_TAXBRACKET1) * 0.15;
       }
       else if(taxableIncome <= HH_UPPERLIMIT_TAXBRACKET3)
       {
         incomeTax = HH_UPPERLIMIT_TAXBRACKET1 * 0.10 + (HH_UPPERLIMIT_TAXBRACKET2 - HH_UPPERLIMIT_TAXBRACKET1) * 0.15 + (taxableIncome - HH_UPPERLIMIT_TAXBRACKET2) * 0.25;
       }
       else if(taxableIncome <= HH_UPPERLIMIT_TAXBRACKET4)
       {
        incomeTax = HH_UPPERLIMIT_TAXBRACKET1 * 0.10 + (HH_UPPERLIMIT_TAXBRACKET2 - HH_UPPERLIMIT_TAXBRACKET1) * 0.15 + (HH_UPPERLIMIT_TAXBRACKET3 - HH_UPPERLIMIT_TAXBRACKET2) * 0.25 + (taxableIncome - HH_UPPERLIMIT_TAXBRACKET3) * 0.28;
       }
       else if(taxableIncome <= HH_UPPERLIMIT_TAXBRACKET5)
       {
        incomeTax = HH_UPPERLIMIT_TAXBRACKET1 * 0.10 + (HH_UPPERLIMIT_TAXBRACKET2 - HH_UPPERLIMIT_TAXBRACKET1) * 0.15 + (HH_UPPERLIMIT_TAXBRACKET3 - HH_UPPERLIMIT_TAXBRACKET2) * 0.25 + (HH_UPPERLIMIT_TAXBRACKET4 - HH_UPPERLIMIT_TAXBRACKET3) * 0.28 + (taxableIncome - HH_UPPERLIMIT_TAXBRACKET4) * 0.33;
       }
       else
       {
        incomeTax = HH_UPPERLIMIT_TAXBRACKET1 * 0.10 + (HH_UPPERLIMIT_TAXBRACKET2 - HH_UPPERLIMIT_TAXBRACKET1) * 0.15 + (HH_UPPERLIMIT_TAXBRACKET3 - HH_UPPERLIMIT_TAXBRACKET2) * 0.25 + (HH_UPPERLIMIT_TAXBRACKET4 - HH_UPPERLIMIT_TAXBRACKET3) * 0.28 + (HH_UPPERLIMIT_TAXBRACKET5 - HH_UPPERLIMIT_TAXBRACKET4) * 0.33 + (taxableIncome - HH_UPPERLIMIT_TAXBRACKET5) * 0.35;
       }
     }
     else
     {
       System.out.println("Invalid choice entered. The program will now exit. ");
       System.exit(1);
     }
     //if choice is valid, then and only then proceed to display it

    //reformat the double value, since it is of currency type
    incomeTax = (int)(incomeTax * 100.0)/100.0;

    System.out.println("Income Tax: " + incomeTax);

  }
}
