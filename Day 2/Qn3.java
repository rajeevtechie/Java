//Program passing two float variables to a function and adding them using double in main
class Qn3 {

    static double add(float x, float y) {
        return (double) x + (double) y;
    }

    public static void main(String[] args) {
        float a = 5.5f;
        float b = 4.5f;

        double result = add(a, b);
        System.out.println("Addition Result: " + result);
    }
}
