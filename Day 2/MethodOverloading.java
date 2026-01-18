//Qn5: Program demonstrating method overloading(same method name, different parameters)
class MethodOverloading {

    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum (double): " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(5.5, 4.5);
    }
}
