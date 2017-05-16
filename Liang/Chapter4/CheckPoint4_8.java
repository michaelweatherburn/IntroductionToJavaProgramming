public class CheckPoint4_8
{
  public static void main(String[] args)
  {
    System.out.println("" + (int)'1' + (int)'A' + (int)'B' + (int)'a' + (int)'b');
    System.out.println("" + (char)40 + (char)59 + (char)79 + (char)85 + (char)90);
    System.out.println("" + (char)0x40 + (char)0x5A + (char)0x71 + (char)0x72 + (char)0x7A);
    //or I could just write
    System.out.println("" + '\u0040' + '\u005A' + '\u0071' + '\u0072' + '\u007A');
  }
}
