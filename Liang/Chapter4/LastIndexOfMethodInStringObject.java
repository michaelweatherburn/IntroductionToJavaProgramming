public class LastIndexOfMethodInStringObject
{
  public static void main(String[] args)
  {
    /* the lastIndexOf() method is used to consider the occurences of characters or substrings, but in reverse order. This overloaded method also has four signatures:

    so.lastIndexOf(ch)
    This returns the last occurence of a character.

    so.lastIndexOf(ch, fromIndex)
    This returns the last occurence of a character, but starts checking in reverse direction from the index fromIndex.

    so.lastIndexOf(s)
    This returns the first character (notice) of the last occurence of a substring.

    so.lastIndexOf(s, fromIndex)
    This returns the first character of the last occurence of a substring, but begins checking in reverse from the index fromIndex.

    */

    String greeting = "hey  there!";
    System.out.println(greeting.lastIndexOf('y'));  //2, the last Index is the ONLY index
    System.out.println(greeting.lastIndexOf('e')); //8
    System.out.println(greeting.lastIndexOf('e', 7)); //check backwards from the r, 6
    System.out.println(greeting.lastIndexOf('e', 3)); //check backwards from the space, returns 1

    /* the interesting part is in the substrings. What happens if I set to check backwards from a particaular value,  but the substring is large enough so that the value I set as the starting point lies inside the substring itself?
    */

    System.out.println(greeting.lastIndexOf("he"));  //5
    System.out.println(greeting.lastIndexOf("he", 3));  //check backwards from the space, returns 0
    System.out.println(greeting.lastIndexOf("there"));
    System.out.println(greeting.lastIndexOf("there", 7)); //check backwards from the r
    //no problem, the BEGINNING of the substring must be before the fromIndex, the entire string doesn't have to be
    System.out.println(greeting.lastIndexOf("there", 4)); //as we can see, the counting begins from the position given by fromIndex

    String s1 = "Welcome to Java";
    System.out.println(s1.lastIndexOf('W'));  //the last index is THE ONLY index in this case
    System.out.println(s1.lastIndexOf('o'));  //9
    System.out.println(s1.lastIndexOf('o', 5)); //4, began looking backwards from 'o'
    System.out.println(s1.lastIndexOf("come")); //3
    System.out.println(s1.lastIndexOf("Java", 5));  //-1, no occurence of "Java" found when looking backwards from the character 'm'
    System.out.println(s1.lastIndexOf("Java")); //11

  }
}
