// Java Program using Parameterized Method
// (Using Command Line Input + Predefined Value)
class AddNumbers {

    static void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please provide two command-line arguments.");
            System.out.println("Example: java AddNumbers 10 20");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        add(x, y);
    }
}
