# Lesson 2: Why Object-Oriented Programming?

- `Identifiers` are names that programmers use to label classes, methods, variables, and other elements.

## Setting the Stage

### Rules of identifiers

1. Can only contain letters, digits, underscore and the dollar sign.
2. The starting chraracter cannot be a digit.
3. The identifier ***cannot*** be one of java's `reserve words`

### Variables
- `Variables` are a place in memory that stores some value. 
    - Variables have names or `identifiers` which refer to their values and location in your code.
    - Common convention to use `camel casing` for variable names but the first letter is lowercase

### Types of values
- `byte` is 8 bits.
    - Range -128 to 128
- `short` is 16 bits.
    - Range -32,768 to 32,768
- `int` is 32 bits.
    - Range -2.147 bil to 2.147 bil
- `long` is 64 bit.
    - Range is -9E18 to 9E18
- `double` is 64 bit, but it contains decimals
    - Range is -1.7E308 to 1.7E308

### Primitive Types
- `primitive types` are types that are built into java.

### Java is statically typed!
- This means that in java, you need to declare a variable before you use it.

### Literal
- `Literal` or `constant` is a specific value of some type
    - These has a default type. For example: 78 has type int!

### Declaring Variables
``` java
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        int saturdayFahrenheit;
        int sundayFahrenheit;
    }
}
```
- As shown from above, to declare a variable, you need to have its type first followed by its variable.

### Initalization
``` java
public class FahrenheitToCelcius {
    public static void main(String[] args) {
        int saturdayFahrenheit;
        saturdayFahrenheit = 76;
    }
}
```
- As shown from above, to `initalize` a variable, you can set the variable to some value.

## Running the program 

### Lets look at an example
- [FahrenheitToCelsius.java](fahrenheit_to_celsius\FahrenheitToCelsius.java)

## Shifting to Objects

### Goal of Object-Oriented Programming
- ***The goal is to leverage the ability to model entitties, concepts and processes in ways to simplifyt building, maintaing and extending software.***

## Representing Objects
- `Classes` enclose a group of related methods.

### Car example
- A car has both Variables and Methods

| Variables | Methods |
| --------- | ------- |
| color | startEngine |
|  make | brake |
| model | accelerate |
| year | turnRight|
| currentSpeed | turnLeft|

- Here are some examples of what some variables and methods can be for a car.

### Object's variables
- Each object has its own copy of its classes variable.