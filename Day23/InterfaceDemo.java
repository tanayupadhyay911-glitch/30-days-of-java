// Interface
interface Animal {
    void sound();  // automatically public & abstract
}

// Implementing class
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}
