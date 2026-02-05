// Parent class
class Animal {

    // Method in parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {

    // Overriding the parent class method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverriding {

    public static void main(String[] args) {

        // Creating object of Parent class
        Animal a = new Animal();
        a.sound(); 
        // Output: Animal makes a sound

        // Creating object of Child class using Parent reference
        Animal d = new Dog();
        d.sound(); 
        // Output: Dog barks (child version is called)
    }
}
