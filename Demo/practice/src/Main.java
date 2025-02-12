//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Example {
    public static void main(String[] args) {
        int result = addNumbers(5, 7);  // Calls the function and stores the result
        System.out.println("Sum: " + result);  // Prints: Sum: 12
    }

    static int addNumbers(int a, int b) {  // Function that takes two numbers
        return a + b;  // Returns the sum
    }
}

public class Example {
    public static void main(String[] args) {
        greetUser();  // Calls the function
    }

    static void greetUser() {  // Function that prints a message
        System.out.println("Hello! Welcome to Java.");
    }
}
public class Example {
    public static void main(String[] args) {
        int product = multiply(4, 3);  // Calls the function
        System.out.println("Product: " + product);  // Output: Product: 12
    }

    static int multiply(int x, int y) {  // Function that multiplies two numbers
        return x * y;  // Returns the product
    }
}
public class Example {
    public static void main(String[] args) {
        boolean isEven = checkEven(8);  // Calls function
        System.out.println("Is 8 even? " + isEven);  // Output: Is 8 even? true
    }

    static boolean checkEven(int num) {  // Function returns true if number is even
        return num % 2 == 0;  // If remainder is 0, return true; otherwise, false
    }
}
import java.util.Arrays;  // Import Arrays utility

public class Example {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Define an array
        printArray(numbers);  // Pass array to function
    }

    static void printArray(int[] arr) {  // Function that prints an array
        System.out.println(Arrays.toString(arr));
    }
}
public class Example {
    public static void main(String[] args) {
        int result = subtractNumbers(15, 7);  // Calls the function and stores the result
        System.out.println("Difference: " + result);  // Output: Difference: 8
    }

    static int subtractNumbers(int a, int b) {  // Function that subtracts two numbers
        return a - b;  // Returns the difference
    }
}
public class Example {
    public static void main(String[] args) {
        greet("Alice");  // Calls the function with the name "Alice"
    }

    static void greet(String name) {  // Function that takes a name as input
        System.out.println("Hello, " + name + "! Welcome to Java.");
    }
}
public class Example {
    public static void main(String[] args) {
        int product = multiply(3, 4, 5);  // Calls the function and stores the result
        System.out.println("Product: " + product);  // Output: Product: 60
    }

    static int multiply(int x, int y, int z) {  // Function that multiplies three numbers
        return x * y * z;  // Returns the product
    }
}
public class Example {
    public static void main(String[] args) {
        boolean result = isEven(10);  // Calls the function and stores the result
        System.out.println("Is 10 even? " + result);  // Output: Is 10 even? true
    }

    static boolean isEven(int num) {  // Function that checks if the number is even
        return num % 2 == 0;  // Returns true if number is even
    }
}
public class Example {
    public static void main(String[] args) {
        int fact = factorial(5);  // Calls the function and stores the result
        System.out.println("Factorial of 5: " + fact);  // Output: Factorial of 5: 120
    }

    static int factorial(int n) {  // Function to calculate factorial of a number
        if (n == 0) {
            return 1;  // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1);  // Recursion to calculate factorial
        }
    }
}
public class Example {
    public static void main(String[] args) {
        double fahrenheit = celsiusToFahrenheit(25);  // Calls the function and stores the result
        System.out.println("25°C in Fahrenheit: " + fahrenheit);  // Output: 25°C in Fahrenheit: 77.0
    }

    static double celsiusToFahrenheit(double celsius) {  // Function to convert Celsius to Fahrenheit
        return (celsius * 9/5) + 32;  // Formula to convert Celsius to Fahrenheit
    }
    public class PassByValueExample {

        public static void increment(int num) {
            num += 10;
            System.out.println("Inside increment method: " + num);
        }

        public static void main(String[] args) {
            int myNumber = 5;

            System.out.println("Before calling increment: " + myNumber);

            increment(myNumber);

            System.out.println("After calling increment: " + myNumber);
        }
    }
}

