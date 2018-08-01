import java.util.Scanner;
public class Question6_20 {
	public static int countLetters(String s) {
		int count = 0;
		for (int i = 0, stringLength = s.length(); i < stringLength; i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("The number of characters in the string is " + countLetters(input));
	}
}