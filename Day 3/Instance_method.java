class Person{
    String name;

    void display(){
        System.out.println("Name: " + name);
    }
}

public class Instance_method{
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.display();
    }
    }
