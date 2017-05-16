public class CharInExpressions
{
  public static void main(String[] args)
  {
    /* Rules:
    1) When byte/short/char variables/literals are present in an expression (arithmetic/shift/relational/boolean), those variables/literals are automatically casted to the int type (for easy calculation). This is due to a design decision which states that the minimum amount of space an expression in an entity takes in an expression is 4 bytes.

    2) Expressions containing ONLY literals are subject to the same rules as literals in a variable = literal; assignment.

    3) Expressions containing ONE OR MORE variables are subject to the same rules as RHS variables in the variable = variable; assignment.

    */

    char x = 1;
    char a = 'A' + x; //expressions with ONE OR MORE variables in them are treated as if they are variables
    int i = 'A' + x;
    char c = '0' + '1'; //expressions with literals ONLY are treated as if they are literals
  }
}
