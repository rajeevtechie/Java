// Create 3 Classes and Access Variables Using 3 Different Objects
class Student {
    String name = "Rajeev";
}

class Course {
    String courseName = "Computer Science";
}

class College {
    String collegeName = "Symbiosis Institute of Technology.";

    public static void main(String[] args) {
        Student s1 = new Student();
        Course c1 = new Course();
        College clg = new College();

        System.out.println(s1.name);
        System.out.println(c1.courseName);
        System.out.println(clg.collegeName);
    }
}
