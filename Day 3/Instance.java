//instance variable
class Student{
    int id;
    String name;
}

public class Instance{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";
        System.out.println(s1.id + " " + s1.name);
    }
}