// Animal class with a method makeSound
class Animal {
    // Method that will be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Displaying the sounds each animal makes
        System.out.println("Animal Sound:");
        animal.makeSound();

        System.out.println("Dog Sound:");
        dog.makeSound();

        System.out.println("Cat Sound:");
        cat.makeSound();
    }
}
