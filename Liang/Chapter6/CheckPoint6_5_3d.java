public class CheckPoint6_5_3d
{
	public static void main(String[] args)
	{
		int i = 0; 
		while (i <= 4) {
			method1(i);
			i++;
		}
		System.out.println("i is " + i);
	}

	public static void method1(int i) {
		do {
			if (i % 3 != 0)
				System.out.print(i + " ");
			i--;
		}
		while (i >= 1);
		System.out.println();
	}
}