public class Question5_50c {
	public static void main(String[] args) {
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				j++;
			}	while (j < 10);
			System.out.println();
			i++;
		} while (i < 10);
	}
}