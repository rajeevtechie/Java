// Using super and this keyword in single code
// Use super keyword to execute properties of parent class in inheritance based java program
class Person {
    String name1 = "Parent Name";
    int age1 = 50;

    void display() {
        System.out.println("Person details");
    }
}

class Student extends Person {
    String name = "Student Name";
    int age = 20;

    void showDetails() {
        System.out.println("Using this keyword:");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);

        System.out.println("\nUsing super keyword:");
        System.out.println("Name: " + super.name1);
        System.out.println("Age: " + super.age1);

        super.display();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.showDetails();
    }
}
