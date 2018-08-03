public class BreakStatementsActionAfterEachIteration {
	public static void main(String[] args) {
		for (int i = 0; i < 5; System.out.println("i's value is" + i), i++) {
			if (i == 3)
				break;
		}
	}
}