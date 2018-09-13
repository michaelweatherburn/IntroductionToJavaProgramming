public class CheckPoint7_5 {
	public static void main(String[] args) {
		int i = new int(30);	// Invalid. No square brackets on LHS, using parentheses instead of square brackets on RHS for providing array size
		double d[] = new double[30];	// Valid. Uses C++ style array reference variable declaration syntax
		char[] r = new char(1..30);	// Invalid. Square brackets instead of parentheses needed on RHS/array initializer needed instead of using the new operator
		int i[] = (3, 4, 3, 2);	// Invalid. Using an array initializer requires curly braces, not parentheses
		float f[] = {2.3, 4.5, 6.6};	// Valid. Uses C/C++ style array reference variable declaration syntax
		char[] c = new char();	// Invalid. Creating an array requires you to provide required size inside square brackets
	}
}