
public class MultipleCatchExample {

    public static void main(String[] args) {

        try {
            String str = null;
            if (str != null) {
                System.out.println(str.length());
            }

        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception! Object is null.");
        } catch (Exception e) {
            System.out.println("Some other error occurred.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
