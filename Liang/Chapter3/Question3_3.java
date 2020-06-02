import java.util.Scanner;

public class Question3_3
{
public static void main(String[] args)
{
	Scanner scannerObject = new Scanner(System.in);
	double a, b, c, d, e, f, x, y, denominator;

	System.out.print("Enter a, b, c, d, e and f: ");
	a = scannerObject.nextDouble();
	b = scannerObject.nextDouble();
	c = scannerObject.nextDouble();
	d = scannerObject.nextDouble();
	e = scannerObject.nextDouble();
	f = scannerObject.nextDouble();

	scannerObject.close();

	denominator = a * d - b * c;
	if(denominator == 0)
	{
    System.out.println("The equation has no solution. ");
	}
  else
  {
    x = (e*d - b*f)/denominator;
    y = (a*f - b*c)/denominator;
    System.out.println("x: " + x);
    System.out.println("y: " + y);
  }
}
}
