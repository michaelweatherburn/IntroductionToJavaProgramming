public class CheckPoint7_9_1 {
	/** There can only be one vararg within the method's formal parameter list */
	public static void print(String... strings, double... numbers) {

	}

	/** In case there are formal parameters other than the vararg, the vararg must be the last formal parameter in the method definition */
	public static void print(double... numbers, String name) {

	}

	/** vararg is an argument, not a return type */
	public static double... print(double d1, double d2);
}