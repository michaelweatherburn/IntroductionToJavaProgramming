import java.util.Scanner;
public class Question3_9
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int firstNineDigits;
		int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;

		System.out.print("Enter the first nine digits of an ISBN as integer: ");
		firstNineDigits = scanner.nextInt();
		scanner.close();

		d9 = firstNineDigits % 10;
		d8 = (firstNineDigits / 10) % 10;
		d7 = (firstNineDigits / 100) % 10;
		d6 = (firstNineDigits / 1000) % 10;
		d5 = (firstNineDigits / 10000) % 10;
		d4 = (firstNineDigits / 100000) % 10;
		d3 = (firstNineDigits / 1000000) % 10;
		d2 = (firstNineDigits / 10000000) % 10;
		d1 = (firstNineDigits / 100000000) % 10;

		d10 = (d1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9);
		if (d10 == 10) {
			System.out.println("X");
		} else {
			System.out.println(d10);
		}
	}
}
