//Java program to implement instance method
class Demo {
    int num = 10;

    // Instance method
    void show() {
        System.out.println("Number = " + num);
    }

    public static void main(String[] args) {
        Demo d = new Demo(); // object creation
        d.show();           // calling instance method
    }
}
