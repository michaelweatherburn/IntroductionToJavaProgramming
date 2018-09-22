public class NanotimeMethod {
	public static void main(String[] args) {
		System.out.println("Time since Unix epoch in milliseconds: " + System.currentTimeMillis());
		System.out.println("Time since (arbitrary time frame, may be in future) in nanoseconds: " + System.nanoTime());

		/* 
			The System.nanoTime() method returns the number of nanoseconds that have elapsed since a particular arbitary time frame (NOT THE UNIX EPOCH). This method is useful when you wish to calculate the time difference between events that happen very closely
		*/
	}
}