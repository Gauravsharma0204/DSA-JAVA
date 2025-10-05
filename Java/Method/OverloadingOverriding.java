/*
    🔹 METHOD OVERLOADING:
    - Same method name but different parameter list (number or type).
    - Happens in the SAME class.
    - Example of Compile-time Polymorphism.
*/

class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers (overloaded method with different parameters)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values (overloaded method with different data type)
    double add(double a, double b) {
        return a + b;
    }
}

/*
    🔹 METHOD OVERRIDING:
    - Same method name AND same parameter list.
    - Happens in parent-child (inheritance) relationship.
    - Child class provides its own implementation of the parent class method.
    - Example of Runtime Polymorphism.
*/

class Animal {
    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding parent class method
    @Override   // Annotation used to ensure correct overriding
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding parent class method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverloadingOverriding {
    public static void main(String[] args) {

        // ---------------- METHOD OVERLOADING ----------------
        System.out.println("=== Method Overloading Example ===");
        Calculator calc = new Calculator();  // Creating object of Calculator class

        // Calling overloaded methods
        System.out.println("Sum of 2 ints: " + calc.add(10, 20));       // Calls method with 2 int parameters
        System.out.println("Sum of 3 ints: " + calc.add(10, 20, 30));   // Calls method with 3 int parameters
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));  // Calls method with 2 double parameters

        // ---------------- METHOD OVERRIDING ----------------
        System.out.println("\n=== Method Overriding Example ===");

        Animal a1 = new Dog();  // Upcasting: Animal reference but Dog object
        Animal a2 = new Cat();  // Animal reference but Cat object

        // Method will be decided at runtime based on object type
        a1.sound();  // Output: Dog barks (Child class method executed)
        a2.sound();  // Output: Cat meows (Child class method executed)
    }
}

/*
    🔹 SUMMARY:

    ✅ Method Overloading:
       - Same method name, different parameter list.
       - Example: add(int,int), add(int,int,int), add(double,double).
       - Compile-time polymorphism (decision made at compile time).

    ✅ Method Overriding:
       - Same method name and parameters but in different classes (parent-child).
       - Example: Animal's sound() is overridden by Dog and Cat.
       - Runtime polymorphism (decision made at runtime).

    ✅ Key Difference:
       Overloading → Same class, different parameters.
       Overriding  → Parent-child classes, same parameters.
*/
