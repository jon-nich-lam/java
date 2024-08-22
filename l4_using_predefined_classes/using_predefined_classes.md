# Using Predefined Classes

## Declaring Variables

- Declaring an object is the same as declaring a variable

### Difference between declaration of variable vs object

- Variable declaration of primitive data types are stored directly in the memory location allocated to the variable.
- Object declaration the data is stored in a separately manager part of memory called the `heap`.
    - This object variable `holds an address` to where the actual object is found in the heap.
    - The object variable is actually called `reference variables` because they `reference` the address.
- To assign a value to a variable, we can just use an identifier `=` and the value.
- For an object, you needd to actually create an object.

## Instantiation
- `Instantiation` is the process of creating an object.
    - An object is just a `live` instance of a class.
- We call each declaration of a class an `instance`.
- This is how we create an instance of a class.
    ``` java
    new ClassName(parameters)
    ```
    - `new` operator create an object of the provided class.
        - It then calls a special method of the class called a `constructor`.

- `Constructor`  is a method that initalizes certain properties of the newly created object using the parameters.

``` java
    String major;
    major = new String("Computer Science");
```
- Here we see that a new object (String) is created and passes the argument of "Computer Science".
- Once the constructor is finished, `major` is referenced to the address of the object in the heap.
- To shorten the above code we can also combine the declaratgion of major and the creation of a new string
``` java
    String major = new String("Computer Science");
```

- As a short cut, we can create string objects without the need for `new` and `String` class as it is built into java
``` java
    String major = "Computer Science";
```
- The above code accomplishes the same thing as with the key word `new`

## Invoking Methods
``` java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
```
- Here we see that the `println` method is being invoked here. The println method is  declared in the `System` class.
- It is a type of PrintStream which points to an object of class PrintStream
- `Standard Library` are class that are bundled with java.
    - The standard library is also known as the `Java API`.

### How to invoke a method given a reference?
- We can use the following: `identifier.methodName(parameters)`
``` java
    String major = new String("Computer Science");
    major.length();
```
- Here we see that the string class that major is referencing to is invoking a method called length.
- If i need to save that information for later, we can initalize a variable and reference it to the method called
``` java
    int numChar = major.length()
```

Each object technically does not have its own set of methods but share the methods. What distinguishes an object from another object is the data that is stored in that object and location in memory.

## More on Reference Variables

Unlike Primitive Type which store the value directly in the memory with the variable, a reference type stores a `reference` or memory address pointing to an object stored elsewhere in the memory.

So when one assigns a primitive value to a variable and assigns the variable to another variable, the new variable acquires the actual primitive value not a "reference" to the previous variable
``` java
    double gpa = 4.0;
    double dup_gpa;
    dup_gpa = gpa 
```
- In the above statement, dup_gpa will acquire the 4.0 value explicitly.

On the other hand for a `reference variable`, the initial variable contains a `memory address` to the object which the second variable then copies that address and assigns it as its own. So now both variables are pointing to the same object.

``` java
    String major = new String("Test String!");
    String dupMajor;
    dupMajor = major
```
- Here we see that variable major is referenced to an address in memory that contains the "new" String object with the parameters of "Test String!"
- When dup_major is assigned the value of major, the address to the String object is copied.
- Any changes that is made using major or dup_major will result in changes in both variables due to both referencing the same object in memor!y

## String Methods

- Interestingly, you can use `string literal` to represent and object and call methods from it.
``` java
    "Computer Science".toLowerCase()
```

Since "Computer Science" is technically creating a new string object, it can call on string methods.

## toLowercase

`Strings are immutable!`

``` java
    String interestLower = interest.toLowerCase()
```

The interest string's value **DOES NOT** change. A new objecct called interestLower is created and assigned the new lowercase string. It is on a copy of the calling object and not the original.

## Concat
`concat` is a representation fo the addition (+) of two strings.

### Actual vs Formal Parameters
Actual Parameters are the parameters that is pass to a method when you call it.
``` java
    int x = 5
    myMethod(x);
```
- Here x is an actual parameter which is pass to the method. x contains the actual value.

Formal Parameters are the parameters defined by the method that is used to recieve the actual parameter
``` java
    void myMethod(int y){
        ...
    }
```
- Here `y` is the formal parameter that is used in the method as the input parameter.

### Pass by Value
In java when an actual parameter is passed to a method, java `passes a copy` of that value (for primitive types) or a copy of the reference (for objects) to the formal parameter.

`Alias` is the term used when a variable points to the same object as another variable

``` java
    public class Example {
        public static void main(String[] args) {
            int x = 10;
            modifyPrimitive(x);
            System.out.println(x); // Output will still be 10
        }

        static void modifyPrimitive(int y) {
            y = 20; // Changes only the copy of the value
        }
    }
```

Lets take the above for example with primitive types:
- The actual parameter is `x` which has the value of `10`.
- The formal parameter is `y` which gets a copy of `10`.
- Modifications of `y` inside `modifyPrimitive` **does not** affect `x` because a copy was copied into the method first before modification.

``` java
    public class Example {
        public static void main(String[] args) {
            Person person = new Person("John");
            modifyObject(person);
            System.out.println(person.name); // Output will be "Doe"
        }

        static void modifyObject(Person p) {
            p.name = "Doe"; // Modifies the object that 'p' refers to
        }
    }

    class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
}
```
Lets take the above for example with reference types:
- The actual parameter of `person`, holds a reference to a `Person` object with a name John in memory.
- The formal parameter of `p`, recieves a copy of the reference.
- Since `p` has recieved a copy of the reference address for `person`, any changes to `person` would also reflect on `p`, **but** and changes on `p` **would not** reflect on `person`

## Strings are Immutable!
Remember that strings are **immutable**!
``` java
    public class StringTwist{
        public static void main(String[] args){
            String funnyStr = "Test this string for me!";
            funnyStr.replace("!", " ");
            funnyStr.replace("this string", "this method");
            System.out.println(funnyStr);
        }
    }
```
- The above program will out put `Test this string for me!` even though we called .replace method. This is because when we call a method, we actually create a copy of that object.
- Because no variable is referencing these new objects, they will be sent to the garbage collection.
- To change the reference that funnyStr is referencing to, we would need to assign funnyStr to reference these "new" copies of the original String object
``` java
    public class StringTwist{
        public static void main(String[] args){
            String funnyStr = "Test this string for me!";
            funnyStr = funnyStr.replace("!", " ");
            funnyStr = funnyStr.replace("this string", "this method");
            System.out.println(funnyStr);
        }
    }
```
- This now has funnyStr referencing the new object that is created and the old funnyStr object is sent to garbage collection.