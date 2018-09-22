public class CheckPoint6_8_2
{
	public static void method(int x) {
	}

	public static int method(int y) {
		return y;
	}

	/*
		This is a case where you want to perform method overloading, but the method signatures of both method definitions are exactly the same. This is why the compiler shows an error - because having different method return value types or modifiers does NOT matter as far as method overloading is concerned.
	*/
}