 //this file shows the way unicode characters can be made into escape sequences
public class UnicodeRepresentation
{
  public static void main(String[] args)
  {
    // A Unicode (UTF-16) character can be used by using its' four-digit hexadecimal format, like so:
    System.out.println('\u0031');
    System.out.println('\u0032');
    /* \u is a prefix we use to denote that the four numbers that follow represent hexadecimal numbers.
    The above line just showed me an error for content written INSIDE a comment. That's a first. */
  }
}
