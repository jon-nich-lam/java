## The if statement
``` java
    if (booleanExpression)
        statement;
```
- If only one statement is given for the condition, no bracket is needed.
``` java
    if (booleanExpression){
        statement1;
        statement2;
        statement3;
    }
```

- Indentation is not necessary but helps with readability.

### Boolean Expressions

There are the following boolean expressions

1. `<`
2. `>`
3. `>=`
4. `<=`
5. `==`
6. `!=`

## Comparing Non-numeric Data

- Use the Unicode table which coorelates a numerical value with characters when comparing.

## The equals Method

- Strings are special!
- Java runtime places strings in a string constant pool. When it sees a literal with the same contents as a string in the pool, it doesn't create a new `String instance` but recycles the one in the pool.

If we create a new instance of the string literal, the strings will have the same content but will not be `aliases`.
- `Aliases` when mulitple references point to the same object.

``` java
    String x = "park";
    String y = "park";
```

- If we check if x is equal to y using .equal and == we get the following

``` java
    if (x==y) {
        System.out.println("x and y are aliases");
    }
    if (x!=y) {
        System.out.println("x and y are not aliases");
    }
    if (x.equals(y)) {
        System.out.println("x and y have the same contents");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
```

> x and y are aliases \
> x and y have the same contents \
> x: park \
> y: park

- If we have the following changes:
``` java
    String x = new String("park");
    String y = "park";
```

- Running the same statements will result in:

> x and y are not aliases \
> x and y have the same contents \
> x: park \
> y: park


- The string x is not placed in the String constant pool!

## The compareTo Method

- The compareTo method is used to compare strings.
- It uses the unicode data for each char to compare.

- ***The compareTo method does not return a boolean but an integer***
    - If they are equal, it will return a `0`
    - If x is less than y, it will return a `negative int value`
    - If x is greater than y, it will return a `positive int value`

``` java
int result = x.compareTo(y)
```

- To use compareTo for a expression it would be:

``` java
    if (x.compareTo(y) > 0){
        statement1;
    }

```

## Else statement

- Paired with if, we can also have a continuation of the statement using else

``` java
if (x > 0) {
    System.out.println("x is positive.")
}
else {
    System.out.println("x is negative or 0.")
}
```

## Logical Operators

An if statement can have more than just one statement. By using logical operators, multiple statements can be combined in a single if statement.

1. AND : `&&`
2. OR : `||`
3. NOT : `!`

``` java
if ((x >= 70) && (x <= 90)) {
    System.out.println("x is between 70 and 90, including 70 and 90.")
}
```

***Relational Operators take precedent over Logical Operators.***

- This makes sense because how can you perform a Logical operation of relational operators before performing a relational operation?

***Not takes priority over AND and OR***

***Parenthesis takes precedence over logical operators***

***AND takes priority over OR***

## Short-circuit Evaluation

Jave uses `short-circuit evaluation` to speed up processing time. Java evaluates all logical operators left to right.

For && operations, `if the left side is false`, then the whole statement is `false`. So java will skip the right statement to save on computational time.

For || operations, `if the left side is true`, then the whole statement is `true`. So java will skip the right statement to save on computational time.

***It is good convention to place the faster operand on the left than the right***

## Nesting

- Placing statements in side other statements.

``` java
if (x <= 0) {
    if (x == 0) {
        System.out.println("x is 0")
    }
    else {
        System.out.println("x is negative")
    }
}
else {
    System.out.println("x is positive")
}
```

Use `indentation` to help readability!

``` java
if (x <= 0) {
if (x == 0) {
    System.out.println("x is 0")
}
else {
    System.out.println("x is negative")
}
}
```
``` java
if (x <= 0) {
if (x == 0) {
    System.out.println("x is 0")
} }
else {
    System.out.println("x is negative")
}
```

These two code snips look identical without indentation but are different!
``` java
if (x <= 0) {
    if (x == 0) {
        System.out.println("x is 0")
    }
    else {
        System.out.println("x is negative")
    }
}
```
``` java
if (x <= 0) {
    if (x == 0) {
        System.out.println("x is 0")
    } }
else {
    System.out.println("x is negative")
}
```
Here they are with indentation. We see that in the first one, the else is following the nested if but in the second one, the else is following the initial if statement.

## Ternary Conditional Operator

Allows one-line replacement to if-else statement. In my opinion it makes it harder to read.

## Multi-way branching

This is when you need to have split executions on different statements

``` java
if (x < 0) {
    System.out.println("x is negative")
}
else if (x > 0) {
    System.out.println("x is positive")
}
else {
    System.out.println("x is 0")
}
```

## switch statement

The switch statement is another way of achieving multi-way branching without if else

- The switch keyword is followed by an expression. This expression must result into a value of type:

1. char
2. byte
3. short
4. int
5. String
6. enum
7. Character
8. Byte
9. Short
10. Integer

- The switch `result conditions` are called case followed by the value.
- The `default` value is used when no cases are matched

``` java
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter ytour selection: ");
    int selection =  input.nextInt()

    String output;

    switch(selection) {
        case 0:
            output = "You selected 0";
            break;
        case 1:
            output = "You selected 1";
            break;
        default:
            output = "You didn't select 0 or 1"
            break;
    }
    System.out.println(selection)
```

- We see here that we need a `break` which exits the switch statement. If no break is given on the case, the default would also be called.
- Cases can only be a single balue to match while if-else can be an allowable range.