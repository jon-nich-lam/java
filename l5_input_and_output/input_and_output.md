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