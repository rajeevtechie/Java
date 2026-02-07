// Abstract class
abstract class Calculator {

    // Abstract methods (no body)
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract int multiply(int a, int b);
    abstract double divide(int a, int b);

    // Concrete method
    void displayMessage() {
        System.out.println("Calculator Application using Abstract Class");
    }
}

// Concrete class implementing abstract methods
class SimpleCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return (double) a / b;
    }
}

// Main class
public class AbstractCalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new SimpleCalculator(); // reference of abstract class

        calc.displayMessage();

        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));
    }
}
