class Student {

    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OopsBasic {

    public static void main(String[] args) {

        Student s1 = new Student();   // Object Creation

        s1.name = "Shlok";
        s1.age = 17;

        s1.displayInfo();             // Calling the method 
    }
}
