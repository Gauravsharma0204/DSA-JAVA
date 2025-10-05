/*
====================================================
             ENCAPSULATION IN JAVA
====================================================

🔹 Definition:
Encapsulation is the process of binding data (variables)
and methods (functions) together into a single unit (class).
It is also called DATA HIDING, because variables are private
and can only be accessed using public methods (getters & setters).

🔹 Features:
1. Variables are declared as PRIVATE.
2. Access is given through PUBLIC methods.
3. Hides internal details (data hiding).
4. Improves security and flexibility.

🔹 Advantages:
✅ Data Hiding – protects sensitive data.
✅ Security – only controlled access is allowed.
✅ Flexibility – we can validate data inside setters.
✅ Reusability – once created, class can be reused.

🔹 Real Life Example:
Think of an ATM machine → You cannot directly access
the bank’s database. You can only use given options
(Withdraw, Deposit, Check Balance). Data is hidden.

====================================================
*/

// Step 1: Create a class with private variables
class Student {
    // Private data members (data hiding)
    private String name;
    private int age;
    private double marks;

    // Step 2: Public Getter and Setter for Name
    public String getName() {
        return name;  // Getter returns the value
    }
    public void setName(String name) {
        this.name = name;  // Setter sets the value
    }

    // Step 3: Public Getter and Setter for Age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        // Adding validation (advantage of encapsulation)
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("❌ Invalid Age! Must be positive.");
        }
    }

    // Step 4: Public Getter and Setter for Marks
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("❌ Marks must be between 0 and 100!");
        }
    }
}

// Step 5: Main class to test encapsulation
public class Encapsulation {
    public static void main(String[] args) {
        // Creating object of Studen
        Student s1 = new Student();

        // Using setters to set values
        s1.setName("Gaurav");
        s1.setAge(21);
        s1.setMarks(92.5);

        // Using getters to access values
        System.out.println("✅ Student Name: " + s1.getName());
        System.out.println("✅ Student Age: " + s1.getAge());
        System.out.println("✅ Student Marks: " + s1.getMarks());
    }
}
