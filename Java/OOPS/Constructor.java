/*
====================================================
             ENCAPSULATION WITH CONSTRUCTOR
====================================================

🔹 Definition of Encapsulation:
Encapsulation is the process of wrapping data (variables)
and methods (functions) into a single unit (class). 
Variables are kept PRIVATE and accessed via PUBLIC methods.

🔹 Constructor:
A Constructor is a special method that initializes an object 
when it is created. It has the same name as the class and 
does not have a return type.

🔹 Why use Constructor with Encapsulation?
✔ To set values of private variables at the time of object creation.
✔ Avoids calling multiple setters separately.
✔ Improves readability and efficiency.

====================================================
*/

// Step 1: Create a class with private variables
class Student {
    // Private data members
    private String name;
    private int age;
    private double marks;

    // Step 2: Constructor to initialize variables
    Student(String name, int age, double marks) {
        // Using "this" keyword to refer current object's variables
        this.name = name;

        // Validation inside constructor (Encapsulation advantage)
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("❌ Invalid Age! Setting default 18");
            this.age = 18;
        }

        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("❌ Invalid Marks! Setting default 0");
            this.marks = 0;
        }
    }

    // Step 3: Public Getters (No setters here, only read-only access)
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMarks() {
        return marks;
    }
}

// Step 4: Main class
public class Constructor {
    public static void main(String[] args) {
        // Creating object using Constructor (values passed directly)
        Student s1 = new Student("Gaurav", 21, 92.5);
        Student s2 = new Student("Rohit", -5, 105); // invalid values

        // Accessing values using getters
        System.out.println("✅ Student 1 -> Name: " + s1.getName() + ", Age: " + s1.getAge() + ", Marks: " + s1.getMarks());
        System.out.println("✅ Student 2 -> Name: " + s2.getName() + ", Age: " + s2.getAge() + ", Marks: " + s2.getMarks());
    }
}
