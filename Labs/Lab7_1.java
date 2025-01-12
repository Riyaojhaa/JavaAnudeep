// •Write a Java program to create a
// class called
// Vehicle with
// a method
// called drive().  Vehicle should have attributes such
// as make (String),  (String). year (int)
// and maximumSpeed (int).  Create a constructor in Vehicle with all fields as constructor parameters. Create a subclass called Car and override constructor. Call super().  Write a function that overrides
// the drive() method to print (make + model + " Car is driving".)  Also create another subclass Bike extending the vehicle class. Override the drive() method to print (make + driving".) +model+" Bike is Calendar Instantiate both Bike and Car class. Print their attributes.



// Vehicle class with attributes and a method
class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Drive method
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

// Car class that extends Vehicle and overrides the constructor and drive method
class Car extends Vehicle {

    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed); // Calling the parent class constructor
    }

    // Overriding the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

// Bike class that extends Vehicle and overrides the drive method
class Bike extends Vehicle {

    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed); // Calling the parent class constructor
    }

    // Overriding the drive method
    @Override
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

// Main class to instantiate and display details of Car and Bike
public class Lab7_1 {
    public static void main(String[] args) {
        // Instantiate a Car and a Bike object
        Car car = new Car("Toyota", "Corolla", 2022, 180);
        Bike bike = new Bike("Yamaha", "FZ", 2020, 150);

        // Printing the attributes
        System.out.println("Car Details:");
        System.out.println("Make: " + car.make + ", Model: " + car.model + ", Year: " + car.year + ", Max Speed: "
                + car.maximumSpeed);
        System.out.println("Bike Details:");
        System.out.println("Make: " + bike.make + ", Model: " + bike.model + ", Year: " + bike.year + ", Max Speed: "
                + bike.maximumSpeed);

        // Calling the drive method
        car.drive();
        bike.drive();
    }
}
