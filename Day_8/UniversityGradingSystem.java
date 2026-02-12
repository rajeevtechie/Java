/**
 Scenario:
A university maintains a grading system where students receive grades based on their marks. The system should ensure that students enter valid marks (0 to 100). If a student enters marks outside this range, the system should throw an InvalidMarksException.
Your task is to implement this system using Java by:
Creating a Student class with attributes for name and marks.
Implementing a method assignGrade() that determines the grade based on marks.
Writing a custom exception class called InvalidMarksException.
Testing the functionality using a main method.
 */

// Custom Exception Class
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    private String name;
    private int marks;

    // Constructor with validation
    public Student(String name, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }

        this.name = name;
        this.marks = marks;
    }

    // Method to assign grade
    public String assignGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "F";
    }

    // Display student result
    public void displayResult() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + assignGrade());
    }
}

// Main Class
public class UniversityGradingSystem {
    public static void main(String[] args) {
        try {
            Student s1 = new Student("Rajeev", 85);
            s1.displayResult();

            System.out.println();

            Student s2 = new Student("Amit", 120);  // Invalid marks
            s2.displayResult();

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
