/*
    🔹 Definition of Class:
    A class in Java is a blueprint or template for creating objects. 
    It defines variables (fields) and methods (functions) that represent 
    the properties and behaviors of objects.

    🔹 Definition of Object:
    An object is an instance of a class. 
    It represents a real-world entity and has its own state (data) 
    and behavior (methods).
*/

// Creating a class named 'Student'
class Student {
    // Fields (Properties/Variables of the class)
    String name;   // Represents the student's name
    int age;       // Represents the student's age

    // Method (Behavior of the class)
    void displayInfo() {
        // Prints student information
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to run the program
public class Class {
    public static void main(String[] args) {
        // 🔹 Creating objects (instances) of class Student
        Student s1 = new Student();   // Object 1
        Student s2 = new Student();   // Object 2

        // Assigning values to object s1
        s1.name = "Gaurav";   // Setting name for s1
        s1.age = 20;          // Setting age for s1

        // Assigning values to object s2
        s2.name = "Rahul";    // Setting name for s2
        s2.age = 23;          // Setting age for s2

        // 🔹 Calling methods using objects
        s1.displayInfo();   // Output: Name: Gaurav, Age: 22
        s2.displayInfo();   // Output: Name: Rahul, Age: 23
    }
}

/*
    🔹 Key Points:
    1. Class = Blueprint/template.
    2. Object = Instance of a class.
    3. Objects are created using 'new' keyword.
    4. Each object has its own data but shares methods of the class.
*/
