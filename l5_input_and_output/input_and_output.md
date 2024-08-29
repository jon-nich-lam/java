# Introduction to input and output

## Scanner

We use an API called `Scanner` to take in input.

- Scanner is added for an easier method for basic terminal input processing.

``` java
    public class FahrenheitToCelcius{
        public staic void main(String[] args) {
            Scanner input = new Scanner(System.in);
        }
    }
```

- This scanner class will handle all the inputs for out program.
- `System.in` is the argument that is pass through Scanner. This constructor customizes the scanner object `input` to read the input keys.

```
    test text
    next line
```

- The above line is read by the computer as: `test text\nnextline\n`

### Scanner Class
The scanner class is ***not*** immediately available like system or string. To use the scanner class we will need to import it

``` java
import java.util.Scanner;
```
- This is the import statement used to import the Scanner class into the program.

``` java
import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        double celsius = (5.0/9) * (fahrenheit-32);
        System.out.println("Celsius: " + celsius);
    }
}
```

We can see the output of the above code below:
> Enter a Fahrenheit value: 

- It doesn't matter how much white space is put in between the `num` and the `statement`.
> Enter a Fahrenheit value:   
>
>
> 78
> 
> Celsius: 25.5555555557

The program will still run because the `\n` is ignored until the next integer is given.

## Scanner Errors

There are some methods that can check the input and returns a bool

``` java
    hasNextDouble()
    hasNextBoolean()
```

## Multiple Prompts and Token
``` java
import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit-32);
        System.out.println(day + " Celsius: " + celsius);
    }
}
```
>Enter a Fahrenheit value: 98 \
>Enter a day of the week: Saturday \
>Saturday Celsius: 36.66666666666667


But what happens if we use nextLine() instead of next()
``` java
import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter a day of the week: ");
        String day = input.nextLine();
        double celsius = (5.0/9) * (fahrenheit-32);
        System.out.println(day + " Celsius: " + celsius);
    }
}
```
>Enter a Fahrenheit value: 98 \
>Enter a day of the week: Celsius: 36.66666666666667

- What is happening is that when we enter 98 and press enter we are entering `98\n`. 98 is read by nextInt and what is left behind is `/n`. This `/n` is read by nextLine as an empty string which is why it automatically prints out the Celsius statement without a day.

## Multiple Tokens per line

You can enter multiple tokens and read these token from the same line, but becareful if there are leading spaces.

## Packages

``` java
    import java.util.Scanner;
```
- Each name dictates the hierarchies. So `java` is the top level package which houses the subpackages `util` and then `Scanner`.

- We can use the `*` as a way to import all packages.
``` java
    import java.util.*;
```
- This imports all subpackages under java.util.

But what happens if we have packages that import the same package name?

``` java
    import com.package1.ClassName;
    import com.package2.ClassName;
```
- If we try to use `Run`, this will result in an error because we have conflicting Run definitions.
- What we would have to do is to use the fully qualified class names:

``` java
    com.package1.ClassName obj1 = new com.package1.ClassName();
    com.package2.ClassName obj2 = new com.package2.ClassName();
```

## Formatting with printf
- Decimals (all integers) : `d`
- Floating Point (floar, double) : `f`
- String : `s`

``` java
    System.out.printf("%s Celsius: %f\n", day, celsius);
```

- Here we see that %s will be replaced with day, %f will be replaced with celsius and a new line will be added at the end.

The formatting for formatting is the following: `%[flag][width][.precision]type`

- flag is used with `commas` to seperate out long integers.
- width is `right justified` as default.
    - Place a `negative sign` in front of the width to be `left justified`.
- .precisions dictates how many numbers after the decimal place there is.
- type is the type we are inputting.

## String.format
- This is the same as printf but doesn't print out the string.

``` java
    String celsiusOutput = String.format("%s %-11s %,.1f \n", day, cText, celsius);
```

## NumberFormat

``` java
    import java.text.NumberFormat
```

``` java
    System.out.println("Unformatter Total: " + total);
    NumberFormat currencyFormat = NumberFormay.getCurrencyInstance();
    System.out.println("Formatted Total: " + currencyFormat.format(total));
```

> Unformatter Total: 100.0 \
> Formatted Total: $100.00

- We see that the output for format will add a `$` and 2 decimal places after.

``` java
    import java.util.Locale;
```

``` java
    System.out.println("Unformatter Total: " + total);
    NumberFormat currencyFormat = NumberFormay.getCurrencyInstance(Locale.FRANCE);
    System.out.println("Formatted Total: " + currencyFormat.format(total));
```
- We can also change the currency by adding `Locale.FRANCE` in the getCurrencyInstance argument

## DecimalFormat

``` java
    import java.text.DecimalFormat;
```
``` java
    DecimalFormat formatter1 = new DecimalFormat("0.0");
```
- Here we specify how we want the decimal to be. Take the following:

``` java
import java.text.DecimalFormat;

public class DecimalFormatDemo {
    public static void main(String[] args) {
        DecimalFormat formatter1 = new DecimalFormat("0.0");
        DecimalFormat formatter2 = new DecimalFormat("00.00");
        DecimalFormat formatter3 = new DecimalFormat(".00");
        DecimalFormat formatter4 = new DecimalFormat("0.00%");
 
        System.out.println("0.0: " + formatter1.format(.8675309));
        System.out.println("00.00: " + formatter2.format(.8675309));
        System.out.println(".00: " + formatter3.format(.8675309));
        System.out.println("0.00%: " + formatter4.format(.8675309));
        System.out.println(".00: " + formatter3.format(8675309));
    }
}
```

The output would be:
>0.0: 0.9 \
>00.00: 00.87 \
>.00: .87 \
>0.00%: 86.75% \
>.00: 8675309.00 