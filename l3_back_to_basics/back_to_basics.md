### Lesson 3: Back to Basics

## Whitespace

- White space represents blanks, tabs and new line characters found in source code.

## Errors

1. `Compiler`: Syntax violations
    - It is a compiler job to translate source code into a low level version. Can only complete if it is legal.
    - Errors during compiling
2. `Runtime`: Semantical errors
    - This is where the syntax is correct but the output has an error (Divide by 0)
    - Error during runtime
3. `Logical` : Syntax and Semantics are correct and it does not 
    - No errors caught by compiler or interpreter

### Syntax vs Semantics
- `Syntax` is the rules of the code.
- `Semantics` represents what the statement does.

## Compiler and Runtime Error

### Compiler Error
- This is an example of a compiler error: [CompilerError.java](compiler_error\CompilerError.java)
- It won't `compile to a class`.

### Runtime Error
- This is an example of a runtime error: [RuntimeError.java](runtime_error\RuntimeError.java)
- Compiles to a `class but errors at runtime`.

## Logical Errors
- This is an example of a logical error: [LogicalError.java](logical_error\LogicalError.java)
- Runs fine throughout the whole script but produces unwanted results

## Comments
1. Line comments
    ``` java
    // This is a line comment
    ```
2. Block comments
    ``` java
    /*
        This is a block comment.
        This span multiple lines
    */
    ```
3. Javadoc comments
    ``` java
    /**
     * This is a Javadoc comment
     * Which is used by javadoc to compile a nice formatted HTML file that descrive your code.
    */
    ```

## Variables and Constants
- `Scope`: Scope represents the part of a program the variable identifier can be used to refer to.
    - When something is `out of scope` this means it does not have access to that variable.

    ``` java
    public class VariableScope {
        public static void main(String[] args) {
            int saturdayFahrenheit = 80;
            int sundayFahrenheit = 70;
        }

        public static void anotherMethod(){
            double averageFahrenheit = (saturdayFahrenheit + sundayFahrenheit) / 2.0;
        }
    }
    ```
- This would not compile because saturdayFahrenheit and sundayFahrenheit is out of scope.

- `Constants` are variables that we do not want to change. We create constants by adding `final`.

    ``` java
    final double PI = 3.1415926
    ```
    - By adding final in front of the type, this will through a `compile error` if there is an attempt to change the value of `PI`.

## Primitive Types

- There are 8 primitive types:
1. `byte`
2. `short`
3. `int` 
4. `long`
5. `float`
6. `double`
7. `char`
8. `boolean`

## Default Types
- `int type` is the default type for an integer literal
    - Even if the number ios greater than 2.147 billion

    ``` java
        long bigNum = 999999999999
    ```

    - The code above will result in a compiler error because this is an integer literal and this number is too long to be an int.
    - We can fix this by appending a special letter describing the desired format

    ``` java
        long bigNum = 9999999999999L
    ```

- `double type` is the default for a floating point number

## Other Primitive Types

- `char` is a primitive type that includes letters a-z and other symbols
- While a-z is a range, the char is more of a `set` of characters not a range because symbols don't have an order.

- `ASCII` is a character set that contains:

1. upper and lowercase letters
2. digits 0-9
3. punctuation marks
4. space characters
5. other special characters

- Unicode is a bigger character set that includes symbols and letters from many languages.

- Lets look at some examples of assigning chars.
- Chars are assigned by enclosing a character in single quotes.

``` java
    char highestGrade = 'A';
    char yes = 'Y', no ='N'
```

### Escape Sequences

- Java's Escape sequence is `\'`
    - `\`: The first character is a backslash which tells the compiler that the next character is to be treated differently like normal.
    - `'`: The second character is a descriptor of the character we are trying to store.

- We use escape sequences to make `'` a char literal: `'\''` 

- More escape sequences:
1. `\t`: tab
2. `\n`: new line
3. `\r`: return
4. `\\`: backslash literal
5. `\"`: double quote literal
6. `\'`: single quore literal

### Boolean

- `Boolean` only has 2 values: `true` and `false`

## Arithmetric Expression

- These are your typical algrebraic expression

### Integer Division

- Remember that an int does not contain decimals, so when dividing integers, it will omit the decimal.
- There are a couple of ways to change the output to include the decimal.

    1. Change one or both numbers into a double literals
    2. Add `F` or `D` to the end of one or both numbers to override defauly typing.

### String Arithmetic

- What happens if we run the following:

``` java
    "13" + "31"
```

   - We would get `"1331"` because we are adding strings together not integers!

### Mixted Type Expressions

## Promotion

- `Promotion` is when java needs to match the types of operands in an expression
    - This is when we have something like this:

        ``` java
            1331.0/4 = 332.75
        ```
        - What happens is that java promotes the 4 (int literal) into a temporary double type version.

- Adding anything with a string will be promoted to a `string`!

## Assignment Conversion

- `Assignment Conversion` is when a conversion of type occurs during a variable assignment.

    ``` java
        int average = 4
        double gpa = average
    ```
    - Here we see that average is an int literal. We see that when gpa calls on average, the 4 is temporarily converted to a double and assigned to gpa
    - `The value of average is still an int and is not changed`

- `Lossy conversion` is when you try to convert a type which contains more `data` into one with less
    - double to an int.

## Casting

- Casting is when you want to force a conversion with an operator. 

    ``` java
        int x = 4;
        int y = 6;
        int z = 12;

        double a = (double)z/x
    ```
    - Casting has the 2nd highest priority after parenthesis.

- Casting is used to over rule to "lossy conversion"

    ``` java
        double average = 4.0;
        int gpa = (int)average;
    ```
    
    - This will not error because we have forced the average as an int type.