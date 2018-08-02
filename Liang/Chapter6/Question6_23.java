import java.util.Scanner;
public class Question6_23 {
	public static int count(String str, char a) {
		int count = 0;
		if (str != null && a != '\u0000') {
			for (int i = 0, stringLength = str.length(); i < stringLength; i++) {
				if (str.charAt(i) == a) {
					count++;
				}
			}
		}
		return count;
	}

	public static char resolveInputCharacterFromString(String inputString) {
		if (inputString != null && inputString.length() > 0) {
			return inputString.charAt(0);
		}
		else {
			return '\u0000';
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String inputString = scanner.nextLine();
		System.out.print("Enter the character to look for (Note that if you enter multiple characters, all but the first character would be : ");
		char inputCharacter = resolveInputCharacterFromString(scanner.next());
		System.out.println("Count: " + count(inputString, inputCharacter));
	}
}