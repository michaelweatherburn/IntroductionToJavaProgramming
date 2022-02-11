import java.util.Scanner;
public class Question3_28 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter r1's center x- and y- coordinates, width and height: ");
		 double x1 = scanner.nextDouble();
		 double y1 = scanner.nextDouble();
		 double w1 = scanner.nextDouble();
		 double h1 = scanner.nextDouble();

		 System.out.print("Enter r2's center x- and y- coordinates, width and height: ");
		 double x2 = scanner.nextDouble();
		 double y2 = scanner.nextDouble();
		 double w2 = scanner.nextDouble();
		 double h2 = scanner.nextDouble();

		 scanner.close();

		 if ((Math.abs(x2 - x1) < (w1 - w2) / 2) && (Math.abs(y2 - y1) < (h1 - h2) / 2)) {
		 	System.out.println("r2 is inside r1 ");
		 } else if ((Math.abs(x2 - x1) < (w1 + w2) / 2) && (Math.abs(y2 - y1) < (h1 + h2) / 2)) {
		 	System.out.println("r2 overlaps r1 ");
		 } else {
		 	System.out.println("r2 does not overlap r1 ");
		 }
	}
}