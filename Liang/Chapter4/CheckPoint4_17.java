public class CheckPoint4_17
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = "bye";

		String s = "Welcome to Java";
		String s3 = s1 + s2;

		// String s4 = s1 - s2;	// In Java, + is the only overloaded operator. That is why s1 + s2 makes sense if s1 and s2 are both Strings.

		// Since the minus operator is not overloaded, using it with String arguments causes an error.

		// s1 == s2;    // In Java, converting between statements and expressions are not interchangeable.
		// In JavaScript, the same thing would return no errors, since every expression in JavaScript can be thought of as a statement that returns a value. 
		// s1 >= s2;
		s1.compareTo(s2);
		int i = s1.length();
		// char c = s1[0];
		// The array-index notation that we use for Strings in C does not hold good in Java. In Java, we're supposed to use the charAt() method to access a single character. 
		char c = s1.charAt(s1.length());
		// the above line throws StringIndexOutOfBounds exception, since valid input to s.charAt() method is an integer value in the set {0, 1, 2..., s.length() - 1}
	}
}