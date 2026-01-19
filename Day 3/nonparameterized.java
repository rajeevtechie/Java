class student{
    String name; 
    int age;

    //Default Construtor
    student(){
        name = "Default Name";
        age = 18;
    }

    void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class nonparameterized{
    public static void main (String[] args){
        student student1 = new student(); //default constructor called
        student1.display();
    }
}