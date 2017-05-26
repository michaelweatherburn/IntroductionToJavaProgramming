public class EscapeSequences
{
  public static void main(String[] args)
  {
    //Several special circumstances require characters to be:

    /*

    1. Taken on face value. For example, a " character within a String is supposed to be considered to be a part of that particular String, instead of being interpreted as an end to the String.

    2. Entered into Strings or be made present on a computer in some other way, but those characters may not be typeable. For instance, you can't "type" a LF(NL) character from a keyboard.

    That is where Escape Sequence characters come in. These are a set of characters beginning with the ESC character, that help you represent characters in the above two situations.

    */

    System.out.println("Line Feed (aka New Line): \n");
    System.out.println("Form Feed: \f");
    System.out.println("Carriage Return: \r");
    System.out.println("Tab character: \t");
    System.out.println("Backspace Character\b: ");
    //The backspace character removes non-special characters placed to the right of it.
    System.out.println("Backslash Character: \\");
    //this above line is SO meta. If anywhere in a string, you use a backslash followed by a character, the compiler will try to see it as an escape sequence. This would make backslash unsuitable for Strings, however it is now possible to escape the first backslash with a second backslash to make the Java compiler consider the second backslash as part of the String (i.e. at face value)

    System.out.println("Double-Quote Character: \"");
  }
}
