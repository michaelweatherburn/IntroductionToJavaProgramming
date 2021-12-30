public class CheckPoint3_10_1 {
	public static void main(String[] args) {
		int x = 1;
		System.out.println(true && (3 > 4));
		System.out.println(!(x > 0) && (x > 0));
		System.out.println((x > 0) || (x < 0));
		System.out.println((x != 0) || (x == 0));
		System.out.println((x >= 0) || (x < 0));
		System.out.println((x != 1) == !(x == 1));
	}
}