public class CheckPoint6_17
{
	public static void main(String[] args)
	{
		double a = m(4, 5);
		/* 
			The other cases are self-explanatory - but when there are two integers like in the case above, the first definition would require two implicit casts, but the second definition would require one implicit cast. That is why the second definition is preferred over the first one
		*/
		double b = m(4, 5.4);
		double c = m(4.5, 5.4);
	}

	public static double m(double x, double y) {
		System.out.println("double, double");
		return 1.0;
	}

	public static double m(int x, double y) {
		System.out.println("int, double");
		return 2.0;
	}
}