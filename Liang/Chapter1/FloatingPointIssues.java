public class FloatingPointIssues
{
	public static void main(String[] args) {
		double a = 0.1 + 0;
		double b = 0.2;
		System.out.println(a);
		System.out.println(b);

		System.out.println(-0.0/0);
	}
}
