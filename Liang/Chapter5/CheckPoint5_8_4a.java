public class CheckPoint5_8_4a {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println(i + 4);
			i++;
		}
		while (i < 10);
		// Syntax error here: there was no semicolon after the do-while
	}
}