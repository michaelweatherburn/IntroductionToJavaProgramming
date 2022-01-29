public class Question3_16 {
public static void main(String[] args) {
	/* the rectangle is centered at the origin: which means the:

	   x-coordinates fluctuate between -25 and 25
	   y-coordinates fluctuate between -75 and 75

	 */

	double x = Math.random() * 50 - 25;
	double y = Math.random() * 150 - 75;

  /* a second method would be to create another random variable and make it return 1 or -1 randomly. Then multiply it with the scope */

  x = Math.random() * 25 * (Math.random() >= 0.5 ? 1 : -1);
  y = Math.random() * 75 * (Math.random() >= 0.5 ? 1 : -1);

	System.out.println("Coordinates of a random point inside a rectangle: (" + x + ", " + y + ")");
  }
}