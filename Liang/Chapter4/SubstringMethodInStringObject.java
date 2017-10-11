import java.util.Scanner;
public class SubstringMethodInStringObject
{
  public static void main(String[] args)
  {
    String testString = "Welcome";
    /* 
    Substring method has a confusing syntax.

    The substring method is used to extract substrings from the current string.

    stringObject.substring(a, b);

    Where,
    a = the index on which you want to begin (i.e. if you wish to begin at the 3rd character of the String, this would be 2, since the convention is zero-indexed)
    b = the index ONE MORE THAN the index on which you wish to end. For example, the first three characters of a stringObject can be extracted like this:

    stringObject.substring(0, 3);
    Yes, this will extract from 0 to 2.

    There's another syntax, which covers from the character in concern to the END of the string:

    stringObject.substring(a);

    This counts from the a-th character (0-indexed system) to the end of the main string. This kind of makes the two overloaded methods complements of each other, which would make it cleaner to remember.

    stringObject.substring(0, a); //goes from 0 to (a-1)
    stringObject.substring(a); //goes from a to the end of the string, this covers exactly the characters of the main string NOT covered by the first syntax.

    W e l c o m e
    0 1 2
          3 4 5 6
    "Welcome".substring(0,3) has output "Wel".
    "Welcome".substring(3) has output "come".

    "Welcome" = "Welcome".substring(0,3) + "Welcome".substring(3)

    In general, stringObject = stringObject.substring(0, index) + stringObject.substring(index)
    provided index is reasonably within the String i.e.
    0 <= index <= stringObject.length()

    Note that you can try to access a substring of the given string where
    index = stringObject.length(), because it's complement has to exist.

    So if stringObject.substring(0, stringObject.length()) will give you the entire
    length of the main string, its' complement must return a null string.

    That is why StringObject.substring(stringObject.length()) is a valid (empty)
    string, even if we're asking us to give us a string that starts at stringObject.length() (we should only be normally able to select from 0 to
    stringObject.length() - 1)
    */

    System.out.println(testString.substring(0,0));  //empty string
    System.out.println(testString.substring(2,2));  //empty string
    System.out.println(testString.substring(0,3));
    System.out.println(testString.substring(2,5));  //three characters only

    //these three cases accept testString.length() as input, and do not throw any errors
    System.out.println(testString.substring(0, testString.length()));
    System.out.println(testString.substring(testString.length()));
    System.out.println(testString.substring(testString.length(), testString.length()));

    //runtime errors follow:
    System.out.println(testString.substring(0,testString.length() + 1));  //throws StringIndexOutOfBoundsException
    System.out.println(testString.substring(testString.length() + 1));  //throws StringIndexOutOfBoundsException
    System.out.println(testString.substring(5,4)); //throws StringIndexOutOfBoundsException (why?)
  }
}
