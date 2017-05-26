public class DisplayCurrentTime
{
  public static void main(String[] args)
  {

    //displaying the date using the same approach would be difficult, since different years have different dates and you just can't figure out which years are leap and which ones are non-leap and it becomes a whole lot of confusion
    long timeSinceUnixEpoch;
    System.out.println(timeSinceUnixEpoch = System.currentTimeMillis());

    //the useful construct here is the method System.currentTimeMillis(), which provides us the number of milliseconds that have elapsed since the GMT Unix Epoch (1-1-1970 00:00:00)

    //get rid of the really insignificant digits (digits less than one second)
    long seconds = timeSinceUnixEpoch / 1000;

    //extract the seconds
    long minutes = seconds / 60;
    seconds = seconds % 60;

    //extract the minutes
    long hours = minutes / 60;
    minutes = minutes % 60;

    hours %= 24;
    System.out.println("The current time is: " + hours + ":" + minutes + ":" + seconds);
  }
}
