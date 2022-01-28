import java.util.Scanner;

public class InputTypeMismatch
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberInput = scanner.nextInt();
		scanner.close();
		System.out.println(numberInput);
	}
}
