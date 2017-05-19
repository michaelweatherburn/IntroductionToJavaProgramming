public class MethodsInStringObjects
{
  public static void main(String[] args)
  {

    /*

    The stringObject.length() method returns the length of a String.

    The stringObject.trim() method returns a new String after removing any whitespace characters wither both ends of stringObject

    The stringObject.toUpperCase() and stringObject.toLowerCase() return new Strings in which the lowercase and uppercase characters have been changed to their opposite cases respectively.

    The stringObject.concat(anotherStringObject) returns a new String in which the string anotherStringObject has been appended to stringObject

    stringObject.charAt(int index) returns the character at the position index, considering the String stringObject to be zero-indexed. If a valid index (one within the range 0 to stringObject.length() - 1) has not been provided, an Exception is thrown.

    */
    String fullName = "Subham Satyajeet";
    System.out.println(fullName.length());
    System.out.println(fullName.charAt(0));
    // System.out.println(fullName.charAt(-1));

    /*

    Note that the above line, when uncommented, gives a StringIndexOutOfBoundsException, not the ArrayIndexOutOfBoundsException we've all come to love and hate. This is just one of the many cases which show that Strings are handled separate from all other kinds of arrays in Java

    */

    String wastedCharacters = "       Subham Satyajeet        ";
    System.out.println(wastedCharacters.trim());
    System.out.println(fullName.concat(", a student"));
    System.out.println(fullName.toUpperCase());
    System.out.println(fullName.toLowerCase());
  }
}
