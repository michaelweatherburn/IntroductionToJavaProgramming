import java.util.Scanner;
public class Question3_35 {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int input = scannerObject.nextInt();
		scannerObject.close();
		System.out.println(input + " is " + ( input % 2 == 0 ? "even" : "odd" ) + " number");
	}
}