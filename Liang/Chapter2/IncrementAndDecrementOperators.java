public class IncrementAndDecrementOperators
{
  public static void main(String[] args)
  {
    int i = 1;
    int k = i + ++i;
    System.out.println(i + " " + k);

    i = i++ + i;
    System.out.println(i);

    i = i++ + i;
    System.out.println(i);

    i = --i + i;
    System.out.println(i);

    i = i++;
    System.out.println(i);

    i = i++ + i + i++;
    System.out.println(i);

    i = 8;
    i = i++ + i++ + i;
    System.out.println(i);

    i = 8;
    i = i++ + i + ++i + i;
    System.out.println(i);

  }
}

/* these operators are super-confusing, when you look at precedence rules and wonder why postfix and prefix have operator precedence greater than and the same as Unary operators respectively.

The key to actually understanding a prefix/postfix operator is to look at it like a normal variable, except that it does two things.

For example:
int a = 3;
int b = 1;
a = b;

Here the evaluation of the last line happens as follows:
the variable b is replaced by its proper value 1. The expression now reads:

int a = 1;
Finally, this assignment happens, replacing the value 3 that was there in memory with the new value 1.

A more complex example:
int a = 3;
int b = 4;
int c = 5;

int d = a + b * c;
This is how evaluation happens:

//Phase 1: Replace all the variables with the corresponding literal values:
int d = 3 + b * c;
int d = 3 + 4 * c;
int d = 3 + 4 * 5;

//Phase 2: evaluate literals-only expression using operator precedence and associativity rules
int d = 3 + (4 * 5); //note that multiplication inside binary arithmetic has higher priority than addition
int d = 3 + 20;
int d = 23;
(assignment, d's value is now 23)

Note here that int d = 23 means that the expression has been completely evaluted, but that its value is yet to replace d's previous value in memory,

Before the Java compiler begins evaluation, it traverses the expression LTR, replacing each variable instance with its corresponding literal value.

(Mind! In Java this LTR behavior is concretely defined, however in C and C++ this is not defined in the language specification, hence the creator of the C/C++ compiler you use is free to do as he they see fit. This can be really confusing at times, and it is advisable to avoid the use of ++ and -- operators in C/C++ wherever possible)

++a / a++ (prefix/postfix expressions) actually do two things:
  1) Return a value (are resolved to a literal, this happens during Phase 1)
  2) Side effect (increment or decrement by 1)

Now whenever the compiler (during Phase 1) encounters a...
  1) Prefix variable, the side effect happens first when the compiler detects a++ in the expression. After the side effect has finished executing, the ++a becomes a itself.

  For example in:

  int a = 2;
  int b = 5;
  b = b + ++a + a;

  Evaluation happens as follows:
  //Phase 1: replacing all variables with corresponding literal values
  b = a + ++a + a;
  b = 5 + ++a + a;
  b = 5 + ++a + a; //compiler understands the prefix-ness of the expression, and halts Phase 1 to execute the side effect

  (side effect executing) a = a + 1;
  (a now contains 3, done executing side effect)

  //Phase 1 resumed
  b = 5 + a + a;  //compiler replaces ++a with a itself
  b = 5 + 3 + a;
  b = 5 + 3 + 3;  //see? The last "a" got the new side-effect-incremented value of a

  //Phase 2
  b = 5 + 3 + 3;
  b = 8 + 3;
  b = 11;
  (assignment)

  But whenever the compiler (during Phase 1) encounters a...
  2) Postfix variable, a++ is replaced by a and Phase 1 gets the current value of a from memory and plugs it into position. After that, Phase 1 halts, allowing the side effect to execute. After SE is complete, Phase 1 resumes with the new values now affect Phase 1.


  For example in:

  int a = 2;
  int b = 5;
  b = b + a++ + a;

  Evaluation happens as follows:
  //Phase 1: replacing all variables with corresponding literal values
  b = b + a++ + a;
  b = 5 + a++ + a;  //the compiler detects the postfix-ness of the expression, and replaces a++ with the current value of a
  b = 5 + 2 + a;  //Phase 1 halted

  (side effect executes) a = a + 1;
  (a is now 3, done executing side effect)

  //resuming Phase 1
  b = 5 + 2 + a;
  b = 5 + 2 + 3;  //notice that the last "a" got replaced with the side-effect-incremented value of a

  //Phase 2
  b = 5 + 2 + 3;
  b = 7 + 3;
  b = 10;

*/
