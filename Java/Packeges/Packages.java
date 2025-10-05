/*
    🔹 PACKAGES IN JAVA

    👉 Definition:
       A package in Java is a collection of related classes and interfaces.
       It is like a folder that organizes classes, avoids name conflicts,
       provides access protection, and helps reusability.

    👉 Types of Packages:
       1. Built-in Packages (predefined) → e.g., java.util, java.io, java.sql
       2. User-defined Packages (created by programmer)

    -------------------------------------------------------
    🔹 Example 1: Built-in Package (java.util.Scanner)
*/

import java.util.Scanner; // Importing Scanner class from java.util package

class BuiltInPackageExample {
    void useScanner() {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Taking input
        System.out.println("Hello, " + name);  // Printing output
    }
}

/*
    -------------------------------------------------------
    🔹 Example 2: User-defined Package
    (Normally, we save MyPackageClass.java inside folder "mypack")
    
    Syntax:
       package mypack;

    But for demo here, we write everything in one file with comments.
*/

// This would be inside file: mypack/MyPackageClass.java
// package mypack;   // (uncomment when using in real folder)

class MyPackageClass {
    public void displayMessage() {
        System.out.println("Hello from User-defined Package (mypack)!");
    }
}

/*
    -------------------------------------------------------
    🔹 Main Class to Test Both
*/
public class Packages {
    public static void main(String[] args) {
        
        // Using Built-in Package
        System.out.println("=== Built-in Package Example ===");
        BuiltInPackageExample obj1 = new BuiltInPackageExample();
        obj1.useScanner();

        // Using User-defined Package
        System.out.println("\n=== User-defined Package Example ===");
        MyPackageClass obj2 = new MyPackageClass();
        obj2.displayMessage();
    }
}

/*
    🔹 SUMMARY:
    - Package = folder that contains classes and interfaces.
    - Built-in Package: Already available in Java (e.g., java.util).
    - User-defined Package: Created using 'package' keyword.
    - Import packages using 'import packagename.classname;' 
      or 'import packagename.*;'.

    👉 Compilation (for user-defined):
       javac -d . MyPackageClass.java
       javac PackageDemo.java
       java PackageDemo
*/
