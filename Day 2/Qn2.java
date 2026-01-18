//Program to divide two numbers with divide-by-zero check
class Qn2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        if (b != 0) {
            System.out.println("Result: " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
