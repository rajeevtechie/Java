class student{
    String name; 
    int age;

    //Default Construtor
    student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name + ", Age" + age);
    }
}

public class parameterized{
    public static void main (String[] args){
        student student1 = new student("Alice",20); //parameterized constructor called
        student1.display();
    }
}