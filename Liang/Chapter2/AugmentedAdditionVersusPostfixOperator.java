public class AugmentedAdditionVersusPostfixOperator {
	public static void main(String[] args) {
		int a = 1;
		System.out.println(a += 1);
		//using the statement as an expression - behaves like a prefix expression
		System.out.println(a);
		System.out.println(a++);	// postfix - the value of a is printed, and then it is modified to 3
		System.out.println(a);
		System.out.println(++a);	// prefix - the value of a is increased first, and then printed
		System.out.println(a);
	}
}