public class CheckPoint3_10_4 {
	public static void main(String[] args) {
		int x = 17, y = 3;
		System.out.println(x > y > 0);	// (x > y) evaluates to a boolean. boolean is a bad operand for the left relational operator >
		System.out.println(x = y && y);	// two integers are bad operands for the Logical AND (&&) operator
		System.out.println(x /= y);	// this is a correct expression
		System.out.println(x or y);	// no Java keyword "or"
		System.out.println(x and y);	// no Java keyword "and"
		System.out.println((x != 0) || (x = 0));	// LHS expression evaluates to true, RHS expression then evaulates to an integer value, which is a bad operand datatype for the Logical OR (||) operator
	}
}