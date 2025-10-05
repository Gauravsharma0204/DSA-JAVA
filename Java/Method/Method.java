/*
    🔹 Definition of Method:
    A method in Java is a block of code that performs a specific task.
    It is used to achieve code reusability and better organization.

    🔹 Key Points:
    1. Methods are also called "functions" in other languages.
    2. A method is defined inside a class.
    3. It can take input (parameters) and may return output (return value).
    4. Syntax:
         returnType methodName(parameters) {
             // body
             return value;   // optional
         }
*/

class Calculator {

    // Method without return type and without parameters
    void greet() {
        System.out.println("Hello! Welcome to the Calculator.");
    }

    // Method without return type but with parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    // Method with return type and with parameters
    int multiply(int x, int y) {
        return x * y;  // returns the product
    }

    // Method with return type and no parameters
    String developerName() {
        return "Developed by Gaurav Kumar";
    }
}

// Main class
public class Method {
    public static void main(String[] args) {
        // Creating object of Calculator class
        Calculator calc = new Calculator();

        // Calling method without parameters
        calc.greet();  // Output: Hello! Welcome to the Calculator.

        // Calling method with parameters (addition)
        calc.add(10, 20);  // Output: Sum = 30

        // Calling method with return value (multiplication)
        int result = calc.multiply(5, 6);
        System.out.println("Multiplication = " + result);  // Output: 30

        // Calling method with return type and no parameter
        System.out.println(calc.developerName());  
        // Output: Developed by Gaurav Kumar
    }
}

/*
    🔹 Summary:
    - Method without return type → void greet()
    - Method without return but with parameters → void add(int a, int b)
    - Method with return type and parameters → int multiply(int x, int y)
    - Method with return type and no parameters → String developerName()
*/
