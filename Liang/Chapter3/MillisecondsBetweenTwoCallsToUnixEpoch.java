public class MillisecondsBetweenTwoCallsToUnixEpoch
{
	public static void main(String[] args)
	{
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());

		//if you noticed, there is only ONE millisecond gap between the instances of the method calls. That tells us a lot about how fast the processors of today are.
	}
}
