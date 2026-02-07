// First interface
interface A {
    void show();
}

// Second interface
interface B {
    void show();
}

// Class implementing both interfaces
class DiamondSolution implements A, B {

    // Only ONE implementation is required
    @Override
    public void show() {
        System.out.println("Diamond problem solved using Interface in Java");
    }
}

// Main class
public class DiamondProblemDemo {
    public static void main(String[] args) {

        DiamondSolution obj = new DiamondSolution();
        obj.show();
    }
}
