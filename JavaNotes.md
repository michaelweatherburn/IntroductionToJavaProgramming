#### Types of Imports
- **Specific Import**: When the class to be imported is already known  
`import java.util.Scanner;` will import the Scanner class within the lang package

- **Wildcard Import**: When one wants to import all classes and interfaces inside a package  
`java.util.*` will import all classes and interfaces inside the java.lang package

There is no performance difference between Specific Import and Wildcard Import, both imports simply tell the compiler where the files are  

#### Types of Errors
- **Syntax Errors**  
Errors as a result of not following the language syntax or semantics specified in the language specification. Every programming language has rules, and if source code is not created according to those rules, syntax errors follow. These errors are caught by the compiler.

- **Runtime Errors**  
Errors where the Runtime Environment detects an operation that is impossible to carry out.

- **Logic Errors**  
Errors where the program executes, but doesn't behave the way the programmer intended it to.

#### Java Strings aren't multi-line

You cannot break a string into different lines without using the concatenation operator. 
```java
System.out.println("This is a <Enter>
string on two lines");
```
This is the correct way:
```java
System.out.println("This is a " + <Enter>
"string on two lines");
```
#### The Unix Epoch
The time in milliseconds since the Unix Epoch (00:00:00, 01-01-1970) is given by the method `System.currentTimeMillis()`

#### Math.pow(number, exponent)
`Math.pow(a, b)` is used to calculate `a` raised to the power `b`.  
There are differences in the evaluated values of the expressions `a * a * ... (b times)` and `Math.pow(a, b)`.

#### Math.random()
`Math.random()` is used to obtain a single double value `a` such that `0 <= a < 1`.  
Note that if `Math.random()` is typecasted to an int, you'll get `0`.

#### Rules for Java Identifiers
Java identifiers:
- can contain `A-Z`, `a-z`, `0-9`, `_`and `$`.
- cannot have a digit as their first character
- are case sensitive

#### Underscores in Numeric Literals
You can put `_`s between numbers to improve legibility. This is useful for longer numbers.  
However the `_` must be between two digits.

`567_798_11` or `123_456E-1_0` is correct, while `_3434`, `9090_` or `12_E-10` are wrong.

#### Augmented Assignment Expressions/Statements
Assignments like

```java
a += b;  
a -= b;
```

and the like are called **augmented assignments**.

```java
a operator= b;
```

expands to:

```java
a = (datatype-of-a) (a operator b);
```

...and not `a = a op b` as one might naturally assume.

#### The `System.exit()` method
`System.exit(status)` is used to halt the JVM. Status is an integer value that is reffering to the status code you wish to pass to JVM. 0 means successfully executed, while any other interger, usually 1, indicates unsuccessful execution.

#### The Remainder Operator `%`
Using the remainder operator `%` is also possible for floating-point numbers in Java.
Doing so returns remainder/divisor (yes, as a double/float value, according to the datatypes involved in the expression).

#### Short-circuit LAND `&&` and LOR `||` Operators
Java uses short-circuiting Logical AND and Logical OR operators (also called lazy operators).  
They evaluate as follows:

`p1 && p2;`  
`p1 || p2;`

`p1` is evaluated first.  
If `p1` is false, `p1 && p2` will never be true, no matter what the value of `p2` is.  
So the evaluation of `p2` is skipped.  
If `p1` is true, `p1 || p2` will always evaluate to true, no matter what the value of `p2`.  
Hence the evaluation of `p2` is skipped.

Short-circuiting allows us to chain object member access expressions like this:  
`objectName != null && objectName.dataMemberName != null && objectName.dataMemberName.inner...`  
without any fear of `NullPointerException`s.

#### Switch-Case Statement
The only allowed values to the input in a switch statement in Java:  
byte, short, int, char, String

#### Methods in `java.lang.Math` Class
The `java.lang.Math` class has three categories of methods:
- Trigonometric Methods
  - Trigonometric Functions
    - `Math.sin(radians)`
    - `Math.cos(radians)`
    - `Math.tan(radians)`
  - Inverse Trigonometric Functions
    - `Math.asin(number)`
    - `Math.acos(number)`
    - `Math.atan(number)`
  - Unit Converters
    - `Math.toDegress(radians)`
    - `Math.toRadians(degrees)`
- Exponent Methods
  - `Math.exp(number)`
  - `Math.log(number)`
  - `Math.log10(number)`
  - `Math.pow(base, exponent)`
  - `Math.sqrt(number)`
- Rounding Methods
  - `Math.ceil(number)`
  - `Math.floor(number)`
  - `Math.rint(number)`
  - `Math.round(number)`
- Others
  - `Math.abs(number)`
  - `Math.random()`
  - `Math.min(a, b)`
  - `Math.max(a, b)`

It also features two double constants:

- `Math.PI`
- `Math.E`

#### `java.lang` Classes Auto-imported
All classes inside the java.lang package are implicitly imported into all Java files.
That is why we can create and use Java `String`s, or the constants and methods of the `java.lang.Math` class directly without having to import it.

#### Java Exponent Methods
`Math.log(number)` takes a logarithm with `Math.E` as base. `Math.log10()` takes a logarithm with `10` as base.

#### Java Rounding Methods
`Math.rint()` rounds the number toward the closest even integer if the decimal part of the input is `0.5`  
`Math.round()` rounds the number forward when the decimal part of the input is `0.5`  
`Math.round()`, unlike other rounding methods in the Math class, does not return an integer as a `double` value 
It:
- returns `long` if the input was of the `double` datatype
- returns `int` if the input was of the `float` datatype

#### Encoding and Encoding Scheme
Encoding is the process of mapping/converting characters and numbers into a corresponding (binary) numbers that computers can work with. The map itself is called an Encoding Scheme. Examples: ASCII, Unicode

Unicode is a 16-bit character encoding scheme. It was originally designed to have 65,535 (2^16) characters. But the current character set of Unicode has more characters called supplementary characters.

#### Integer Literals in Other Radices
To 
- Binary number literal, use `0B`/`0b` as prefixes:  
`0B00001`, `0b10101`
- Hexadecimal number literal, use `0x`/`0X` as prefixes:  
`0xAB`, `0X16B`
- Octal number literal, use `0` as prefix:  
`012` is octal 12, `12` is decimal 12.

#### Java Characters, Unicode Character Convention
To represent Unicode characters, we can use the Unicode character convention:
`\u` followed by 4 hexadecimal characters to represent the Unicode character.  

Note that UTF-16 has been updated to support multiple languages that were added after the 65,536 limit was crossed. The char datatype can NOT be used to directly add these characters into Java programs. But Unicode supports most Indian languages.

`\u0030` represents `'0'`, `\u0041` represents `'A'`, and so on.
The range is ideally `\u0000` to `\uFFFF`, but some characters from the range `\u0800` to `\u08FF` are not used.

#### Methods in Java `Character` Class
Methods in the `Character` (wrapper) class include:
- Relational Methods
  - `Character.isLetter(char)`
  - `Character.isDigit(char)`
  - `Character.isLetterOrDigit(char)`
  - `Character.isUpperCase(char)`
  - `Character.isLowerCase(char)`
- Conversion Methods
  - `Character.toLowerCase(char)`
  - `Character.toUpperCase(char)`

#### Methods in `java.lang.String` class
Useful instance (non-static) methods include:
- `str.length()`, returns the length as an `int`
- `str.charAt(index)`, returns the char at specified index, returns `int`
- `str.trim()`, removes all whitespace characters on both ends of this string, returns new `String`
- `str.toUpperCase()`, returns new `String`
- `str.toLowerCase()`, returns new `String`
- `str.concat(str2)`, returns `str1 + str2`

#### Operator Overloading In Java
The `+` (addition/concatenation) is an overloaded operator in Java. The overloading is contextual.

- If both the inputs are of the type char/numbers, then addition occurs.
- If either or both the inputs are of type String, concatenation occurs. The input which is not of the String type is converted to its String equivalent.

#### String Concatenation has Left-To-Right Associativity
Remember that all operators in the Binary > Arithmetic section of the operator precedence table have left-to-right precedence. This means that concatenation is also performed in left-to-right order. For instance:
```java
int a = 3;
int b = 4;
System.out.println("The sum is " + a + b);
```
will output
`The sum is 34`.

Sequence of steps during execution:  
1. `"The sum is " + 3` would be performed first. Seeing as `3` is an integer, it would be converted to its String equivalent, `"3"`.
2. Concatenation happens. The expression is now `"The sum is 3" + 4`.
3. The process repeats for `4`. First conversion to `"4"` and then concatenation. Result: `"The sum is 34"`.

To enforce precedence over associativity rules, use parentheses, like so:  
```java
System.out.println("The sum is " + (a + b));
```

#### String Concatenation
The concatenation method and the plus operator can do the same thing. So,
```java
String thirdString = firstString + secondString;
```
and
```java
String thirdString = firstString.concat(secondString);
```
do the same thing: join two strings together

#### String Methods on String Literals
You do **not need** a reference variable to execute methods on an object.  
An object literal **can** be used in place of the object reference variable.

For instance,
```java
String message = "thisPersonIsASentientBeing";
System.out.println(message.charAt(5));
```

is the same as:
```java
System.out.println("thisPersonIsASentientBeing".charAt(5));
```

You can call non-static (instance) methods of a class directly on an object literal of that class.

#### The `java.util.Scanner` Class
This class is used to create scanner objects, which help us grab input from the user in console-based Java applications.

```java
Scanner scanner = new Scanner(System.in);
```
This line is used to create a scanner object.

#### Methods in `java.util.Scanner` Class
- `scanner.nextByte()`
- `scanner.nextShort()`
- `scanner.nextInt()`
- `scanner.nextLong()`
- `scanner.nextFloat()`
- `scanner.nextDouble()`
- `scanner.nextBoolean()`
- `scanner.next()`
- `scanner.nextLine()`

#### Input Buffer Issue Using `scanner.nextLine()`
You **must not** call nextLine() immediately after the methods:
`nextByte()`, `nextShort()`, `nextInt()`, `nextLong()`, `nextFloat()`, `nextDouble()`, `next()`, `nextBoolean()`

These methods (called token-delimited methods) do not remove the delimiter called newline `'\n'` from the buffer when they're done. They are designed to skip over any whitespace characters if they encounter those characters at the beginning of the buffer (i.e. before any reasonable input has begun).

nextLine(), however, is different. nextLine() is delimited **only** by a newline character, and not by any other whitespace character. Also, nextLine() does not skip over any newline characters already present inside the input buffer.

#### String Comparison Methods
String object methods on String Comparison include:

- `str.equals(str2)`  
  Checks first for reference equality, and then content equality, returns `boolean`
- `str.equalsIgnoreCase(str2)`  
  Same as above, but ignores the difference between uppercase and lowercase, returns `boolean`
- `str.compareTo(str2)`  
  Returns `int`. Compares both strings character-by-character from beginning-to-end, scanning for differences. If a character mismatch is found, it returns the difference between the Unicode values of the two characters
  - If compareTo returned `0`, both strings are identical.  
  - If compareTo returned a positive value, the character which marks the point of difference between `str` and `str2`, has a higher Unicode value for str than that in `str2`
- `stringObject.compareToIgnoreCase(s2)`  
  Same as above, but does not consider the differences between uppercase and lowercase letters, returns `int`
- `str.startsWith(str2)` Checks if str2 is a prefix inside str, returns `boolean`
- `str.endsWith(str2)` Checks if str2 is a suffix inside str, returns `boolean`
- `str.contains(str2)` Checks whether str2 is a substring anywhere inside str, returns `boolean`

#### String Methods For Finding Characters/Substrings
- `str.indexOf(ch)`  
  Returns the `int` index of the first occurrence of the character `ch`. Checks from beginning to end (in the forward direction)
- `str.indexOf(ch, fromIndex)`  
  Same as above, but checks from the index fromIndex (inclusive) to the end of the string (in the forward direction)
- `str.indexOf(str2)`  
- `str.indexOf(str2, fromIndex)`
- `str.lastIndexOf(ch)`
- `str.lastIndexOf(ch, fromIndex)`
- `str.lastIndexOf(s2)`
- `str.lastIndexOf(s2, fromIndex)`

If no match is found, all of these methods return `-1`.

#### Using `System.out.printf()` for Formatted Output
The `System.out.printf()` method allows us to print formatted output the same way `printf()` function in C allowed us to. As an example:

Syntax:
```java
System.out.printf("%<minimumFieldWith>.<precision><inputDatatype>", input);
```
Example:
```java
System.out.printf("\n %5.2f", 12.345);
```
Here, the result would be `12.35`.

The `%` symbol inside the printf method is used to mark the beginning of a format placeholder.

`inputDatatype` is used to mark the end of a format placeholder. It's used to specify the datatype of the input according to the following table.
1. `%b` - `boolean` value
2. `%c` - `char` value
3. `%d` - integer value `int`/`long`
4. `%f` - floating-point value `float`/`double`
5. `%e` - floating-point literal in scientific notation

`minimumFieldWidth` is the minimum field width specified for this number. In the example, A minimum of `5` places would be reserved for printing this number. Each character within the representation counts as one place.  
- If there are less number of characters to occupy the minimum width (on the left hand side of the number/String/character/boolean) the extra places would be filled with blank spaces (' ').
- If there are more characters to show than the `minimumFieldWith`, the value of `minimumFieldWidth` is ignored. (hence the name, **minimum** field width).

`precision` represents the exact precision reserved for the decimal part of the number. The precision value is non-negotiable.  
- If there are more digits in the actual number than `precision`, rounding off would be observed.  
  In the example, `12.345` was rounded off to `12.35`.  
- If there are less digits in the actual number than `precision`, the extra space after the number would be filled by adding the appropriate number of trailing zeros.



Format Flags provide additional information as to how to format the string.
- `,` Comma (applicable to numbers only)  
  `%,d` Add commas to numbers that are larger than 1,000 according to the international notation system (commas after every three digits)
- `-` Alignment (Can't be used without specifying `minimumFieldWith`)  
  `%-10.s` Change the alignment to left-aligned. By default, all strings and numbers are right-aligned
- `0` Zero (Applicable to numbers only, can't be used without specifying `minimumFieldWith`, can't be used with Alignment)  
  `%010.2d` By default, leading spaces are not shown if `minimumFieldWith` for the formatted output is greater than the number being output

 Examples:
```java
System.out.printf("%6.2f", 34.3456);
```
Output: `<blank-space>34.35`  
Notice that rounding off occurs, and the decimal point is also considered as taking up a place
```java
System.out.printf("5.4e", 34.2345);
```
Output: `3.4235e+01`  
Notice the rounding off occurs. Also, since the end result includes characters such as e and the positive sign after it, the number of places used in this placeholder was 10. Which is why the value for `minimumFieldWidth`, 5, is ignored.

When the precision specified is lower than the number of digits in the input floating-point number, rounding or truncation occurs.
- Rounding if the left-most digit left behind after truncation is > 5
- Truncation if the left-most digit left behind after truncation is <= 5

The `%` character signifies the beginning of a format specifier in a format string. To use the `%` character literal in a format string, we need to escape the character with **itself** (no, backslash is not used for this character).

`%%` is the right way to display a single `%` in a format string.

#### Wrong `;` on the If-Line
When the if block has a semicolon `;` on the if line, it becomes equivalent to an empty if-statement, followed by a code block.

```java
if (expr);  // notice the semicolon - this isn't a compiler error, but a compiler warning
{
  statement(s);
}
```
...is equivalent to:

```java
if (expr) { } // empty if block
{
  statement(s); // these statements are inside of a regular Java block
}
```

#### Dangling Else Ambiguity
When code is written such that it isn't obvious which if block an else block associates with, the else block will associate itself with the closest if-block before it.
```java
if (expr)
  if (expr2)
    statement1;
else
  statement2; // else is associated with inner if-block, despite the formatting
```

#### Equality Test of Floating-Point Values
Equality test of two floating-point values does not neccessarily provide the correct result. This is true even if there's no coercion involved and both values are of the same floating-point datatype.

The reason: there are numbers which can be represented in the decimal notation using a finite number of characters, but cannot be represented in binary using finite number of characters.

Example: 0.1<sub>10</sub> is equal to 0.000<span style="text-decoration: overline">1100</span><sub>2</sub>  
The latter is a recurring decimal. However, floating-point datatypes in Java only have a fixed number of places to denote precision.
All mathematical calculations being inherently imprecise to an extent.

Hence, testing for equality of floating-point values isn't reasonable. As an example:

```java
int number = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
if (number == 0.5) {
  System.out.println("Equal");
} else {
  System.out.println("Not equal");
}
System.out.println(number);
```

This would return:
```
Not equal
0.5000000000000001
```

A solution to this problem: use constants to denote very small values for both floating point datatypes:
```java
final float EPSILON_FLOAT = 10E-7f;
final float EPSILON_DOUBLE = 10E-14;
```

Then, use those constants as the maximum permissible difference between two values for which equality is to be established:

```java
if (Math.abs(firstNumber - secondNumber) < EPSILON_DOUBLE) {
  System.out.println(firstNumber + " is equal to " + secondNumber);
}
```

It is better to use third-party math libraries when precision is of utmost importance, such as for scientific calculations and for banking purposes.

#### De Morgan's Law

`!(condition1 && condition2)` is the same as `!condition1 || !condition2`  
`!(condition1 || condition2)` is the same as `!condition1 && !condition2`  

De Morgan's Law can be summarized by the statement **break the line, change the sign**.  
This is because Logical NOT is represented as an overline over the expression it is applied to:

<code><span style="text-decoration: overline">condition1 && condition2</span></code> is the same as <code><span style="text-decoration: overline">condition1</span> || <span style="text-decoration: overline">condition2</span></code>  
<code><span style="text-decoration: overline">condition1 || condition2</span></code> is the same as <code><span style="text-decoration: overline">condition1</span> && <span style="text-decoration: overline">condition2</span></code>

#### Iterations and Loops
Loops are programming constructs that allow you to repeat the execution of code blocks attached to them for a certain number of times.
The three types of loops central to many programming languages, among Java, are:
- while loop
- do-while loop
- for loop

All loops have a control variable, usually a number, that controls the number of iterations the loop will run for. Also, each loop has the following phases:

1. Initialization  
  This phase occurs once and "sets up" the control variable so that it can be used by the loop.
2. Conditional check  
  This phase causes the control value to be used in a boolean expression. If the value of that Boolean expression amounts to true, the loop will continue executing, else the loop will cease to execute and the execution context will start from the line following the conditional check (a phenomenon called "being taken out of the loop. ")
3. Update  
  This phase causes changes in the control variable so that it can eventually amount to false, while the setup allows the loop to run for the intended number of times, but no further. Update expressions are usually a part of the loop body (while, do-while loops) but are taken out of the loop body in the for loop.

#### For Loop Syntax
A for loop has the following syntax:
```java
for (initialization; conditional-check; update-expression)
{
  //loop-body
  statements;
  //end-of-loop-body
}
```

#### While Loop Syntax
A while loop has the following syntax:
```java
initialization;
while (conditional-check)
{
  //loop body
  statements;
  update-expression;
  //end-of-loop body
}
```

#### Do-While Loop Syntax
A do-while loop has the following syntax:
```java
initialization;
do
{
  //loop-body
  statements;
  update-expression;
  //end-of-loop-body
} while(conditional-check);
```

#### Classifying Loops
Loops are classified into two types:

1. Entry-controlled Loops, aka pre-test loops (for, while)
2. Exit-controlled loops aka post-test loops (do..while)

For and while loops are called entry-controlled loops because the condition is checked before every iteration of the loop (yes, even the first iteration, even though that is not always obvious for the for loop)

Do-while loop, on the other hand is called exit-controlled loop, because the conditional check is carried out at the end of each iteration. (This is why the first iteration of a do-while loop would definitely occur, since the conditional-check is not occurring before that first iteration)

Loops are also classified as follows:

1. Counter-controlled loops
2. Sentinel-controlled loops

Counter-controlled loops have a counter variable that literally counts through the iterations of the loop.  
Example: common for counters:
```java
for(int i = 1; i < 5; i++)
{
  //code
}
```
This loop iterates 5 times.

Sentinel-controlled loops have a variable, which when set/deviated from a predefined value, causes the loop to terminate. Generally sentinel controlled loops are written when the programmer wants the loop to run an indeterminate number of times.
Example:
```java
while(input != 0)
{
  input = scannerObject.nextInt();
  //more code goes here
}
```
In this example, the while loop will continue to run until the user has entered 0 among the inputs it has given.

#### For Loop
If the loop-control variable that you're using in a for-loop will not be used anywhere else, it is a good practice to declare it inside the initialization section of the for-loop. This will cause the variable to only have scope inside the for-loop.

Yes, the for-loop has its own scope, where variables that were initialized inside the initialization section of the for loop exist.

- Outer Scope  
  - For Loop Scope (encapsulates block scope for each iteration)
    - Block Scope 1 (for Iteration 1)
    - Block Scope 2 (for Iteration 2)
    - Block Scope 3 (for Iteration 3)...

For While and Do-While Loops, this is how scopes work:

- Outer Scope
  - Block Scope 1 (for Iteration 1)
  - Block Scope 2 (for Iteration 2)
  - Block Scope 3 (for Iteration 3)...

It is allowed to have:

1. Multiple initialization/declaration statements
2. Multiple update expressions/Java statements

...in a for loop. For instance:

```java
for(int a = 10, b = 20; a < 20; a++)
  System.out.println(a + " " + b);
```
```java
for(int a = 10, b = 20; a < 20; a++, b+=2)
  System.out.println(a + " " + b);
```
```java
for(int a = 10, b; a < 20; a++)
  System.out.println(a + " " + b);
```
```java
for(int a = 10; a < 20; System.out.println(a), a++);
```
If multiple initializations/update-expressions exists, they need to be separated by commas.
Variables declared in the initialization section have to be of the same datatype.

However, it is not possible to have multiple conditional-checks. If you wish to have multiple conditional-checks, you can combine them using the LAND and LOR operators, as in:

```java
for(int a = 10, b = 20; a < 20 || b < 40; a++, b+=2)
  System.out.println(a + " " + b);
```

It is possible to omit certain sections of the for loop altogether.

- You can skip initialization if the loop counter variable has already been initialized before the body of the loop.
- You can skip update-expression if you prefer to write the update-expression inside the body of the loop.
- Skipping the conditional-check actually means **implicitly setting it to `true`**

Examples:

```java
int i = 5;  //initialization already done
for(; i < 10; i++)
  System.out.println("Hello");  //prints hello 5 times
```

```java
int i = 5;
for(; i < 10; )
{
  System.out.println("Hello");
  i++;  //updating the loop control variable inside the loop body, as we would do for a while loop
}
```

```java
int i = 5;
for(; ;)
{
  System.out.println("Hello");
  i++;  //does not matter, this is an infinite loop 
}
```

The above loop is equivalent to:
```java
int i = 5;
for(; true; )
{
  System.out.println("Hello");
  i++;
}
```

This is not the case with while() and do..while() loops. For those loops if you leave the conditional-check expression blank, a compilation error would occur.

#### Intentional Infinite Loop
In case an infinite loop is intended, it is best to write it as such:

```java
while(true)
{
  //loop body
}
```
This removes ambiguity. The loop body can then be used to specify alternative ways to terminate the loop.

#### Omitting Curly Braces in Loops
It is allowed to omit braces for selection or iteration statements if there's only one statement inside the loop. This also applies to do-while loops.

Strangely, empty do-while loops look like this:

```java
do {
} while(condition);
```
You can't omit the braces if there is no loop body.

But:

```java
do
  statement1
while(condition);
```

is valid. In a do-while loop, you can omit the braces if there's only one statement inside the loop, but not if there are 0 statements inside the loop.

#### Resolving Datatype Ambiguity in Ternary Operators
```java
char characterValue = characterLiteral;
int doubleValue = doubleLiteral;
String str;
x = booleanExpression ? characterValue : doubleValue;
```

Here, the character will automatically get converted to a double value.
Implicit casting occurs to ensure that the final value returned by the conditional operator would not have datatype ambiguity.

#### Loop Control Statements `break` and `continue`

- `break` brings the execution control directly out of the loop
- `continue` skips over the rest of the statements in the current iteration

For `continue`:
- In while and do-while loops, on execution of a continue statement, the loop-continuation-condition preceding the next iteration is directly executed.
- In a for loop, the action-after-each-iteration following the lines of code that were skipped is executed first. `continue` **only** skips over the **rest of the loop body** in the current iteration - it doesn't impact anything else in the loop flow.

In all three types of loops, using `break` **completely** exits the loop.

Important: Even in the case of for-loop, the action-after-each-iteration following the loop body where the break is encountered, is **not** executed.

#### Parsing Methods in Wrapper Classes
There are parse methods present within wrapper classes to convert any valid String value to a valid corresponding primitive datatype.

- `Byte.parseByte(validByteValue)`
- `Short.parseShort(validShortValue)`
- `Integer.parseInt(validIntegerValueOrLiteral)`
- `Long.parseLong(validLongValueOrLiteral)`
- `Float.parseFloat(validFloatValueOrLiteral)`
- `Double.parseDouble(validDoubleValueOrLiteral)`

#### Methods in Java
Methods are reusable entities which house business logic within them. Once defined, methods can be invoked as required. Methods cannot exist independently of classes in Java. Method definitions have to be encapsulated inside class definitions.  
There are three parts to using a method:

- Method Declaration
- Method Definition
- Method Invocation/Method Call

Syntax for Method Declaration:
```java
methodHeader;
```

Syntax for Method Definition:
```java
methodHeader {
  methodBody
}
```

Syntax for Method Header:  
`modifier returnValueType methodName(dataType1 formalParameter1, dataType2 formalParameter2...)`

The modifier provides contextual information about the method.

#### Methods as Functions
A method in Java is a programming language construct that mirrors the mathematical construct called functions. In mathematics, functions are supposed to return a single unambiguous value. Multiple values are not allowed, and the value must be defined. Just like mathematical functions, methods in Java may return values. Based on this, there are two kinds of methods:

1. Value-returning method
2. void method

#### Value-Returning Methods
Value-returning methods return a value (of any primitive or reference type). Mathematically saying this means "providing a unique answer". The returnValueType can then contain any valid Java datatype or class, like `int`, `double`, `boolean`, `String`, `ArrayList<String>`, or `Student`.

Example of value-returning method:

```java
public static int sign(int inputNumber)
{
  if (inputNumber > 0)
    return 1;
  else if (inputNumber == 0)
    return 0;
  else
    return -1;
}
```

In order to be a value-returning method, a statement containing the return keyword must be present in all possible flows of the method. No matter what the flow within the method is, the return statement/statements must be reachable.

```java
public static int sign(int inputNumber)
{
  if (inputNumber > 0)
    return 1;
  else if (inputNumber == 0)
    return 0;
  else if (inputNumber < 0)
    return -1;
}
```
This syntax throws an error, because the compiler thinks that there is a possibility that none of the if-clauses match, in which case, no return statement is reached. (Since the compiler only checks for syntax, not for semantics, it is not smart enough to realize that the cases themselves, i.e. inputNumber > 0, inputNumber == 0, and inputNumber < 0 are mutually exclusive and cover all possibilities of the integer inputNumber. This is why this code, although semantically perfect, would show a compilation error. The proper way to write this code would be:

```java
public static int sign(int inputNumber)
{
  int result = -2;
  if (inputNumber > 0)
    result = 1;
  else if (inputNumber == 0)
    result = 0;
  else if (inputNumber < 0)
    result = -1;
  return result;
}
```

By separating the variable result from the rest of the code, we've ensured that the return statement would be executed regardless of the flow of the method. The initial value of -2 is used because it is not possible to return a value (or use it in any other way) without initializing it, and the compiler (because of the aforementioned reasons) detects the possibility that the variable result might not have been initialized (again, the compiler doesn't understand semantics so it doesn't get the fact that all possible values of inputNumber have been covered by the mutually exclusive if-conditions in the if-else ladder)

#### `void` method
When a method is designed not to return any value, it is known as a void method. Programming constructs like these are called procedures in other languages. The void method must have a returnValueType of void.

Example of void method:

```java
public static void printWelcome() {
  System.out.println("Welcome!");
}
```

This method prints a fixed String to the console, but doesn't return any value.
Return statements can also be used in void methods, to prematurely terminate the method and return the execution control back to the caller. For example:

```java
public static void addAndPrintPositiveIntegers(int i1, int i2)
{
  if (i1 < 0 || i2 < 0)
  {
      System.out.println("One or both the integers provided as input are negative. Sum not calculated. ");
      return;
  }
  System.out.println("Sum: " + (i1 + i2));
}
```

#### Static and Instance Methods
Inside classes, methods perform two roles, which defines whether the modifier "static" would be assigned to them.

#### Static Methods
These methods are written on the "class level". They are independent of any objects that the class might have, although they can be executed using an object.

Invocation Syntax:
- `ClassName.staticMethodName(list-of-actual-parameters);`  
  The proper way to invoke a method which can be accessed by current class, but is not defined within the current class
- `staticMethodName(list-of-actual-parameters);`  
  only if the class is being invoked within the same class as when it is defined
- `objectName.staticMethodName(list-of-actual-parameters);`  
  This is possible, but not advisable. Static methods are supposed to be independent of objects. Business logic within those classes should not be related to object-level data members. This also shows a compiler warning

#### Instance Methods
These methods are written on the "object/instance level" and are tied to the instance of the class that invokes them, and these methods usually use the said instance as context for execution.

Invocation Syntax:  
`objectName.staticMethodName(list-of-actual-parameters);`

#### Passing Formal Parameters ("parameters") to Actual Parameters ("arguments") - Pass-By-Value
When a method is called, the values of the actual parameters (arguments) are used to initialize the formal parameters (parameters). A copy of each actual parameter is created and assigned to the corresponding formal parameter.

This is called Pass By Value.

For pass-by-value to happen, the arguments provided in the method invocation must have been provided in the same order as that of the corresponding parameters in the method definition's signature. This is called parameter order association. This is necessary because we need formal parameters and actual parameters to have a one-to-one correspondence for the values to be copied over.

The list of parameters must match the list of arguments exactly in
- Order
- Number
- Compatible Type

Example:
```java
public static void increaseGrade(char currentGrade, int numberOfGradesToIncrease) {
  ...
}
```

Method invocation - Valid examples
```java
increaseGrade('A', 1);
increaseGrade('B', 2);
```

Method Invocation - Invalid examples
```java
increaseGrade(1, 'A'); // Parameter order association does not hold - the order of the arguments does not match the order of the parameters
increaseGrade(145L, 1);
increaseGrade(4.5, 2);  // Incompatible type  - the first long/double argument can not be implicitly cast to a char value
increaseGrade('A'); // Number of arguments are different - the number of arguments does not match the number of parameters
```

#### Pass-by-Value for Primitive Variables
Pass-by-value causes new memory to be created for each formal parameter. This memory is created inside the activation frame of the method that was called. After that, the values of the actual parameters are copied to the formal parameters in a one-to-one fashion. After that, all changes made to the parameters will exist only for the length of the method that was called. As soon as the method is finished executing, the activation frame of the called method is removed from the call stack, and so do the values of the formal parameters. The actual parameters cannot be changed by this call.

Example:
```java
public class SwapLogic {
  public static void swap (int i1, int i2)
  {
    int temp = i1;
    i1 = i2;
    i2 = temp;
    System.out.println("First Value: " + i1 + ", Second Value: " + i2);
  }

  public static void main(String[] args)
  {
    int firstArgument = 1;
    int secondArgument = 2;
    System.out.println("First Value: " + firstArgument + ", Second Value: " + secondArgument);
    swap(firstArgument, secondArgument);
    System.out.println("First Value: " + firstArgument + ", Second Value: " + secondArgument);
  }
}
```

Here, the values of the variables `firstArgument` and `secondArgument` would be used to initialize the values of `i1` and `i2`. The values `i1` and `i2` (present in the activation record for `swap`) would be swapped using a third variable. After that, the control returns to main from swap, as the activation record for swap is removed when swap finishes execution. The values `firstArgument` and `secondArgument`, present in the activation record for `main`, remain unaffected by the events that occurred within swap.

That is why the values aren't swapped in the `main` method. However, if you check the values **within** the swap method after its execution, the values would be swapped - for it would be swap's copy of those values that were swapped.


#### Methods and Variables Sharing Identifier Names
A method and a variable can have the same name within the same scope. The compiler doesn't confuse between the two. That is because the invocation of a method has fundamentally different syntax:

- `ClassName.methodName(list-of-arguments)`
- `objectName.methodName(list-of-arguments)`
- `methodName(list-of-arguments)`

...than that of a variable when it is used in an expression/statement:

`variableName`

However, two variables, even of different types, cannot have the same name. On trying to declare the second variable with the same name, the compiler would show an error - variable already declared.

#### Method Overloading
Multiple methods within a class can have the same name, but different definitions. This is possible if the method signatures of the methods are different.  

Method Signature:

`methodName(datatype1 formalParameter1, datatype2 formalParameter2...)`

In other words, the method signature is characterized by:
1. the method's name
2. the number of formal parameters
3. the order of formal parameters
4. the datatype of each formal parameter

In order for methods to have the same name, one or more of the other three properties that characterize the method must be different. Here's an example of method overloading:

```java
public static int sum(int firstNumber, int secondNumber) {
  return firstNumber + secondNumber;
}

public static double sum(double firstNumber, double secondNumber) {
  return firstNumber + secondNumber;
}
```

Note that for method overloading to work, the method signature must be unique. Modifiers and returntypes are **not** part of the method signature, so having the same method signature but different returntypes/modifiers would result in a compilation error.

#### Ambiguous Invocation Error
If there are two definitions of an overloaded method, and the compiler is confused about which definition to adhere to when calling the method, owing to the nature of the actual parameters provided, this is called ambiguous invocation.

```java
// Method Definitions
public static double sum(int firstNumber, double secondNumber)
{
  return (firstNumber + secondNumber);
}

public static double sum(double firstNumber, int secondNumber)
{
  return (firstNumber + secondNumber);
}

// Method Invocation
sum(3,4);
```

Just as `3`, the integer argument is a compatible type for the first parameter of the second definition, `4`, the integer argument is a compatible type for the second argument of the first method. The compiler sees the two method definitions as equally plausible. This is called ambiguous invocation.
The error shown would be:

`Reference to <methodName> is ambiguous`

#### For Loop - Initial Actions

```java
for (initial-action; loop-continuation-condition; action-after-each-iteration)
{
  // loop body
}
```

initial-action - any variable declared within this portion of the for loop will have the scope of the entire for loop (all the iterations of the for loop). This makes the for loop different from the while and do-while loop - there is no area where you can create variables that are not exclusive to each loop block, but are shared across all iterations.

For example:

```java
for (int i = 1; i < 10; i++)  // Here, the variable i has a scope that covers all blocks (across all iterations) of the for loop
{
  boolean b = false;  // This variable is BEING DECLARED and assigned, again and again in each loop iteration (since all loop iterations have separate blocks) and the value's scope ends at the end of each loop block
  System.out.println(i);  
}
```

#### Variable Scope
Scope of a variable is the part of the program in which the variable can be referenced.
Variables that are declared inside methods are called local variables.

Variables that are declared within a particular block have scope from the variable declaration to the end of the block in which they're declared.

Formal parameters of the method are actually local variables that have the scope of the entire method block. They're declared in the parentheses of the method header, and are initialized using the values of the actual parameters.

Two variables can have the same name, as long as their scopes do **not** intersect. Thus, two variables declared in separate blocks of code can have the same name, as the separation of the blocks causes the scope of the variables to not intersect.

Allowed - Discrete Blocks of code having variables with the same name
```java
{
  // Block 1
  int i = 1;  //i's scope in block 1 starts
...
} //i's scope in block 1 ends

{
  // Block 2
  int i = 5;  //i's scope in block 2 starts
...
} //i's scope in block 2 ends
```


Not Allowed - Nested Blocks with the same variable declared within each block
```java
{
  // Block 1
  int i = 4;  //i's scope in block 1 starts
...
  {
    // (Inner Block) Block 2 
    int i = 3;  //shows a variable already defined error, since i's scope covers this line as well, so the compiler knows what i is (the name "i" is already taken, according to the compiler)
  }
} //i's scope in block 1 ends
```

#### Method Abstraction and Stepwise Refinement
Method Abstraction is the process of separating method implementation from method usage.
As a method call requires no knowledge of the method beyond the method header, the usage of a method requires the user to only know the inputs to the method, the name of the method, and the outputs to the method. The user does not require knowledge of the implementation of the method.

Stepwise Refinement (also known as divide-and-conquer) is referred to as the process of breaking a problem into subproblems, until you arrive at the simplest ones. This is a top-down design approach. Once the mental division is done, the program can be written in a top-down or bottom-up fashion.

#### Arrays in Java
Arrays are a fixed-size sequential collection of elements of the same datatype.
Using primitive variables is different from using array variables.

Primitive Variable Creation:
```java
datatype variableName;  // variable declaration
```

This is called declaration - it merely creates a named placeholder and asks the compiler to allocate memory for that variable called variableName.

```java
variableName = initialPrimitiveValue;  // variable initialization
```

This is called initialization - the variable is assigned an initial primitive value. We can combine the declaration and initialization of variables into one statement as follows:

```java
datatype variableName = initialPrimitiveValue;  // declaration-initialization statement
```

Array Variable Creation:
```java
datatype[] arrayReferenceVariable;  // array variable declaration 
```
This is called declaration of an array variable - it creates a named placeholder and asks the compiler to allocate memory for storing **a reference to the array** (Note that a reference to the array is different from the array and takes up its own space).

```java
arrayReferenceVariable = new datatype[arraySize];
```

This is called array variable initialization - it initializes the **array variable** i.e. a **reference variable** used to store **references to arrays**. The actual array elements are not stored in the object (non-static/instance variable)/class (static variable)/activation record of the method within the runtime stack (variables local to a method/formal parameters).

They're stored in a different memory location called the heap. The heap is special because it allows memory allocation at runtime. It is used to store reference variables. When you store something in the heap, you have to assign a reference to it. When your program is running, you use your references to access and manipulate the data stored in the heap.

The new keyword is used to create new objects in the heap. When the new keyword is used, the expression (new XYZ) returns the reference to the newly created data entity in the heap. So in the above code:

```java
new datatype[arraySize]; 
```

creates an actual array within the heap (of size `arraySize`), and returns the reference to that array present within the heap. The `arrayReferenceVariable` variable is simply a placeholder for the reference itself, not the array.

Example:

```java
double[] listOfValues;  // array reference variable declaration - only creates a array reference variable and allocates memory for that variable
listOfValues = new double[3]; // creation of array inside heap - array reference variable initialization
```

All primitive variables, when declared as instance/static variables within the class/elements within the array, have their default values. (When variables are declared as formal parameters or local variables within methods, they have no default values. They have to be initialized with a valid value before they can be used).

Default Values:
- Primitive Variables:
  - `byte`, `short`, `int`, `long` : `0`
  - `float`, `double` :  `0.0`
  - `char` : `'\u0000'`
  - `boolean` : `false`
- Reference Variables: null

`null` is a special literal (one of the three reserved literal keywords, the other two being `true` and `false`)
It is used to denote the absence of reference. It is similar to `void`, which is used to denote the absence of a return value in methods.

#### Indices in Arrays
We use array indices (unique numbers used to reference each element within the array) along with the array reference variable to access/manipulate individual elements of the array. The index convention is as follows:

- If the array is of size 0, it is an empty array, containing no elements.  
- If the array is of size >= 1:  
  Each element is provided with an index (a number, used to identify the element within the array uniquely)

  The indices are 0-indexed i.e.  
  first element - index 0  
  second element - index 1  
  third element - index 2  
  ...  
  nth element - index (n - 1)

Accessing elements of an array is done like this:

```java
arrayReferenceVariable[elementIndex]
```

For example, here's how to initialize the elements of the previously defined array:

```java
listOfValues[0] = 4.5;
listOfValues[1] = 5.6;
listOfValues[2] = 7.8;
```

For an array of size n, {0, 1, 2... n - 2, n - 1} are the only valid index values. Using values {... -3, -2, -1} or {n, n + 1, n + 2, n + 3 ...} as indices will result in ArrayIndexOutOfBoundsException.
listOf

#### Array Initializers
There is another syntax used for declaring arrays if you already know their contents. It is called the array initializer:

```java
datatype[] arrayReferenceVariable = {element1, element2, element3...};
```

Where the element in the curly braces is called an array initalizer. Array initalizers cannot be used as expressions anywhere outside this context. Also, the declaration and initialization of the arrayReferenceVariable must be written as a single statement when using array initializers.

```java
datatype[] arrayReferenceVariable;
arrayReferenceVariable = {element1, element2..};  // this is not allowed
```

Example:
```java
int[] listOfGrades = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
// using the array initializer to declare-initialize the array
```

56. Char arrays can be printed as if they are Strings.

Example:
```java
char[] currencyCode = {'I', 'N', 'R'};
System.out.println(currencyCode); // "INR"
```

#### Foreach Loop
Foreach loop is a variant of the for loop which is used to traverse the elements of arrays without using any index variables to do so.

Syntax:
```java
for (datatype element: arrayReferenceVariable)
{
  // process the element
}
```

Example:
```java
for (double element: list) {    // for each element in the list...
  System.out.print(element + " ");  // print that element
}
```

This is useful in situations where the index of each element has no relevance to the processing that is to be done inside the loop. Note that this only traverses the array in the forward order i.e. from the first index to the last index.

Note that:
```java
for (datatype element: arrayReferenceVariable) {
  // process element 
}
```

is equivalent to:
```java
for (int i = 0, element; i < arrayReferenceVariable.length; i++) {
  element = arrayReferenceVariable[i];    // copy the value from the current element to this variable "element"

  // process element - any changes made to the variable element here won't affect arrayReferenceVariable[i]
}
```

In the above loop, the changes made to the "element" would not be reflected in the original array element. Hence the foreach loop is only useful for array traversal purposes. Modification of array elements cannot be done using this loop.

#### The `System.arraycopy()` Method
`System.arraycopy(source, srcStart, dest, destStart, num)` method in Java is used to copy elements from one array to another.

Syntax:
```java
System.arraycopy(sourceArrayReferenceVariable, sourceArrayStartingIndex, destinationArrayReferenceVariable, destinationArrayStartingIndex, numberOfElements);
```
`numberOfElements` refers to the number of elements that are to be copied from the source array (starting at `sourceArrayStartingIndex`) to the destination array (starting at `destinationArrayStartingIndex`)
The source and destination arrays need to be created and memory allocated

Example:
```java
int[] source = {'A', 'r', 'r', 'a', 'y'};
int[] target = new int[source.length];
System.arraycopy(source, 0, target, 0, source.length);
System.out.println(target);
```

System.arraycopy is a method that defies the Java API camelCase naming convention.

#### Garbage Collection
When the program is running, there can be arrays/objects in the heap that have no reference variables pointing to them in the program.

When that occurs, JVM silently frees up the memory allocated to those objects so that they can be used by other objects (objects that have no references anymore cannot be used by the program anymore, so they are just wasting space in the heap).

This process of deallocation of memory in the heap is called Garbage Collection.

#### The `System.nanoTime()` Method
It is used to return the number of nanoseconds that have passed since some arbitrary reference point in time. This is useful when one wishes the know the nanosecond level difference between two events that have a very small time difference between them.

#### Passing Arrays to Methods
Java has a pass-by-value approach, always. This means that the passing of a variable to a method **always** involves copying the actual parameter ("argument") from the caller method, over to the formal parameter ("parameter") of the called method before the execution begins. In case of referenced datatypes like objects and arrays, it just involves passing the array reference variables/object reference variables by value by making copies of them.

The copies of reference still point to the same memory entity within the heap, that is why in case of reference datatypes, passing reference variables as actual parameters (arguments) can be thought of as pass-by-sharing. (Different methods are sharing the same memory entity within the heap using copies of references - and each of those references are present inside the activation frames of the respective methods).

#### Anonymous Arrays
When an array's reference variable is not required to be created (example, when it is passed to a method as soon as it is created, so the reference present as the formal parameter in the method would take care of the reference), we can combine the use of new keyword and array initializer to create an array, like so:

Syntax:
```java
new datatype[] {value1, value2.... valuen}
```

This expression creates an array and fills it with values present inside the array initializer. When there is no explicit reference to an array, it is called an anonymous array. Note that this simply returns the reference of the new array created. To **not** save that reference would be to use this array as an anonymous array. However, if you save this reference, like so:

```java
datatype[] arrayReferenceVariable = new datatype[] {value1, value2, value3... valuen}
```

This then becomes a new way to declare a variable using the new keyword and an array initializer.

Example:
```java
printArray(new int[] {4, 5, 6});
```

Note that there is a difference between having **no explicit** reference to an array, and **no** reference to an array. In the above example, the printArray method would have a method formal parameter of type int[], ready to copy the reference over from the caller method. After printArray is done, the array would no longer be required. However if you create an array using the new keyword and do not pass it to a method/do something that would create at least one reference to that array, the array would be UNUSABLE after the creation statement and eligible for garbage collection.

#### Arrays as Objects in Java
Arrays are objects in Java. That is why an array has a fixed static variable called length that can be accessed by using the dot-operator syntax.
Yes, even arrays of primitive variables are objects in Java.

#### Returning Arrays from Methods
When a method returns an array, the reference variable of that array is returned. All the regular pass-by-value rules concerning reference datatypes apply.

The syntax of the method header:
```java
modifiers returnDatatype[] methodName(formalParameterDatatype formalParameter1, formalParameterDatatype formalParameter2...)
```

#### Variable-Length Argument Lists (varargs)
We can pass any number of actual parameters (arguments) to a method and all of those can be processed as if they were an array of arguments.

The syntax for providing variable-length argument lists is:
```java
datatype... variableName
```
The `...` symbol is called an ellipsis.

the syntax for signature of such a method is:

```java
methodName(formalParameterDatatype... formalParameterName)
```

This makes the method variable number of methods 

Rules for varargs: 
1. Only one variable-length argument list is allowed in the method definition header
2. All the inputs provided as actual parameters (arguments) must have datatypes that are the same as/can be implicitly casted to the type of the formal parameter
3. There can be other arguments besides the variable-length argument list. If that is the case, the varargs must be the last actual parameter(argument) in the method definition

Examples:
```java
// Method definition
public static void sum(double... arguments) {
  ...
}

// Method Invocations:
sum(1.3, 2.5);
sum(1.3, 4.6, 7.8); // if individual elements are passed to the method, they are converted to the elements of the array
```