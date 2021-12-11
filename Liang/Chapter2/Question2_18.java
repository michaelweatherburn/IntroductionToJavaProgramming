public class Question2_18 {
	public static void main(String[] args) {
		double a1x = 0, a1y = 0;
		double a2x = 1, a2y = 4;
		double a3x = 2, a3y = 7;
		double a4x = 3, a4y = 9;
		double a5x = 4, a5y = 11;

		double b1x = 2, b1y = 1;
		double b2x = 4, b2y = 2;
		double b3x = 6, b3y = 3;
		double b4x = 10, b4y = 5;
		double b5x = 12, b5y = 7;


		System.out.println("a\t\tb\t\tMiddle Point");
		System.out.println("(" + a1x + ", " + a1y + ")\t(" + b1x + ", " + b1y + ")\t(" + ((a1x + b1x) / 2) + ", " + ((a1y + b1y) / 2) + ")");
		System.out.println("(" + a2x + ", " + a2y + ")\t(" + b2x + ", " + b2y + ")\t(" + ((a2x + b2x) / 2) + ", " + ((a2y + b2y) / 2) + ")");
		System.out.println("(" + a3x + ", " + a3y + ")\t(" + b3x + ", " + b3y + ")\t(" + ((a3x + b3x) / 2) + ", " + ((a3y + b3y) / 2) + ")");
		System.out.println("(" + a4x + ", " + a4y + ")\t(" + b4x + ", " + b4y + ")\t(" + ((a4x + b4x) / 2) + ", " + ((a4y + b4y) / 2) + ")");
		System.out.println("(" + a5x + ", " + a5y + ")\t(" + b5x + ", " + b5y + ")\t(" + ((a5x + b5x) / 2) + ", " + ((a5y + b5y) / 2) + ")");
	}
}
