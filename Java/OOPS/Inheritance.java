/*
====================================================
        INHERITANCE IN JAVA - ALL TYPES
====================================================

🔹 Definition:
Inheritance allows one class (child) to acquire properties 
and methods of another class (parent) using `extends`.

🔹 Types in this example:
1. Single Inheritance  → Car inherits Vehicle
2. Multilevel Inheritance → ElectricCar inherits Car
3. Hierarchical Inheritance → Bike and Car inherit Vehicle
====================================================
*/

// Parent Class (Super Class)
class Vehicle {
    String brand = "Generic Vehicle";

    public void start() {
        System.out.println(brand + " is starting...");
    }
}

// Single Inheritance Example
class Car extends Vehicle {
    int doors = 4;

    public void showCar() {
        System.out.println("This car has " + doors + " doors.");
    }
}

// Multilevel Inheritance Example
class ElectricCar extends Car {
    int batteryCapacity = 75; // kWh

    public void showElectricCar() {
        System.out.println("This electric car has a battery of " + batteryCapacity + " kWh.");
    }
}

// Hierarchical Inheritance Example
class Bike extends Vehicle {
    int wheels = 2;

    public void showBike() {
        System.out.println("This bike has " + wheels + " wheels.");
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        // Single Inheritance Example
        System.out.println("=== Single Inheritance ===");
        Car car = new Car();
        car.brand = "Toyota";
        car.start();     // from Vehicle
        car.showCar();   // from Car

        // Multilevel Inheritance Example
        System.out.println("\n=== Multilevel Inheritance ===");
        ElectricCar eCar = new ElectricCar();
        eCar.brand = "Tesla";
        eCar.start();          // from Vehicle
        eCar.showCar();        // from Car
        eCar.showElectricCar();// from ElectricCar

        // Hierarchical Inheritance Example
        System.out.println("\n=== Hierarchical Inheritance ===");
        Bike bike = new Bike();
        bike.brand = "Royal Enfield";
        bike.start();    // from Vehicle
        bike.showBike(); // from Bike
    }
}
