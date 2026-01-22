//Java program using static variables
class Student1 {
    int rollNo;
    String name;
    static String college = "ABC Engineering College"; // static variable

    Student1(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(101, "Rajeev");
        Student1 s2 = new Student1(102, "Aman");

        s1.display();
        System.out.println();
        s2.display();
    }
}
