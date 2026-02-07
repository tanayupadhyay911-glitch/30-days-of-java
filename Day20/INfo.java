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

// Child class
class Student extends Person {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    void showStudentDetails() {
        showDetails(); // parent method
        System.out.println("Roll No: " + rollNo);
    }
}

public class INfo {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setDetails("TANAY", 18);
        s1.setRollNo(101);

        s1.showStudentDetails();
    }
}
