public class CheckPoint7_2_10 {
	public static void main(String[] args) {
		double[] r = new double[100];	//corrected syntax for new array creation
		for (int i = 0; i < r.length; i++) {	// length is not a method in case of arrays
			r[i] = Math.random() * 100;	// to access array elements, sqaure brackets are used. Also, random() is a method of the Math class
		}
	}
}