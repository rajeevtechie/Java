//Java program using parameterised constructor to print
import java.util.Scanner;

class Student {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll no: ");
            int roll = sc.nextInt();

            System.out.print("Enter PRN: ");
            long prn = sc.nextLong();

            System.out.println("\nName: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("PRN: " + prn);
        }
    }
}
