// Final class: cannot be inherited
final class Calculator {

    // Final variable: constant value
    final int BASE_VALUE = 10;

    // Final method: cannot be overridden
    final void displayBaseValue() {
        System.out.println("Base Value is: " + BASE_VALUE);
    }

    // Normal method
    void add(int x) {
        int result = BASE_VALUE + x;
        System.out.println("Result after addition: " + result);
    }
}

public class FinalDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Using final variable
        System.out.println("Accessing final variable: " + calc.BASE_VALUE);

        // Calling final method
        calc.displayBaseValue();

        // Calling normal method
        calc.add(5);

        // ❌ The following are NOT allowed (for understanding):
        // calc.BASE_VALUE = 20;        // Error: cannot change final variable
        // class NewCalc extends Calculator {} // Error: cannot inherit final class
    }
}
