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