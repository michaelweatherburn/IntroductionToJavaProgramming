import java.util.Scanner;

public class Question3_1 {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);

		double a, b, c, r1, r2, discriminant;

		System.out.print("Enter a, b, c: ");
		a = scannerObject.nextDouble();
		b = scannerObject.nextDouble();
		c = scannerObject.nextDouble();

		scannerObject.close();

		discriminant = b * b - 4 * a * c;
		if(discriminant > 0)
		{
			//the roots are unique
			r1 = ( -b + Math.pow(discriminant, 0.5))/(2*a);
			r2 = ( -b - Math.pow(discriminant, 0.5))/(2*a);

			System.out.println("The equation has two real roots " + r1 + " and " + r2);
		}
		else if(discriminant == 0)
		{
			//both roots have the same value
			r1 = -b / (2 * a);
			System.out.println("The equation has one real root " + r1);
		}
		else
		{
			//imaginary roots
			System.out.println("The equation has no real roots. ");
		}
	}
}
