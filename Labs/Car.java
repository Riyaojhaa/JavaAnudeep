package Labs;
// Assignment-1. 
// ● Write a Java program named Car 
// ● The Car class should have the following attributes: make (String), model (String) , year (short) , and price(int) . 
// ● The car class should have a constructor that takes all the attributes. 
// ● Add a main method to instantiate car objects. 
// ● The program should allow the user to create and display objects of each Car Class.

import java.util.Scanner;

class Car {
    // variable declare
    String make;
    String model;
    short year;
    int price;

    // Car Constructor
    Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println(" Car: " + make);
        System.out.println(" Model: " + model);
        System.out.println(" Year: " + year);
        System.out.println(" Price: " + price);
    }

    public static void main(String args[]) {
        // Takes input from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Company name: ");
        String company = sc.nextLine();
        System.out.println("Enter Model name: ");
        String model = sc.nextLine();
        System.out.println("Enter Year: ");
        short year = sc.nextShort();
        System.out.println("Enter Price: ");
        int price = sc.nextInt();

        Car car = new Car(company, model, year, price);
        car.display();
        sc.close();

    }

}