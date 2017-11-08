public class CheckPoint5_27b
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i * j > 2)
					continue;	/* for each iteration of inner loop, i is constant, j increases with each iteration
					if (i * j) is greater than 2 for a partiuclar loop iteration of the inner loop, it would be higher 
					than its' previous value, and hence greater than 2, for the next iteration as well */

				System.out.println(i * j);
			}
			System.out.println(i);
		}
	}
}