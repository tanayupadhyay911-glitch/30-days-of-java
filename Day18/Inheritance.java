// Parent class
class Person {
    String name;
    int age;

    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheriting Parent class
class Student extends Person {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    void showStudentDetails() {
        showDetails(); // calling parent class method
        System.out.println("Roll No: " + rollNo);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setDetails("Sarthak", 18);
        s1.setRollNo(101);

        s1.showStudentDetails();
    }
}
