public class Question3_16
{
public static void main(String[] args)
{
	/* the rectangle is centered at the origin: which means the:

	   x-coordinates fluctuate between -50 and 50
	   y-coordinates fluctuate between -100 and 100

	 */

	double x = Math.random() * 100 - 50;
	double y = Math.random() * 200 - 100;

  /* a second method would be to create another random variable and make it return 1 or -1 randomly. Then multiply it with the scope */

  x = Math.random() * 50 * (Math.random() >= 0.5 ? 1 : -1);
  y = Math.random() * 100 * (Math.random() >= 0.5 ? 1 : -1);

  /* although not efficient (using four calls instead of two to Math.random()), this is better since there is an assurance of the number being strictly INSIDE the rectangle (as opposed to the previous solution, where (-50, y), (x, -100) and (-50, -100) were all possible values). The previous solution had possible points at the lower and the left side of the rectangle, but not the upper and right sides of the rectangle */

	System.out.println("Coordinates of a random point inside a rectangle: " + x + ", " + y);

  }
}
