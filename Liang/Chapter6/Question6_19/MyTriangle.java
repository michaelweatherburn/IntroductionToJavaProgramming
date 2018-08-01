public class MyTriangle {
	/** Return true if the sum of any two sides is 
	* greater than the third side. */
	public static boolean isValid(double side1, double side2, double side3) {
		return (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2);
	}

	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}