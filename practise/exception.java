public class exception {
    public static void main(String[] args) {
        int i=0;
        int j=18;
        int arr[] = new int[5];
        try{
            j = j/i;
            System.err.println(arr[1]);
            System.err.println(arr[6]);
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing out of index element.");
        }
        catch(Exception e){
            System.out.println("something went wrong...");
        }

        System.out.println("program still running");
    }
}
