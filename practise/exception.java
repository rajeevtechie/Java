public class exception {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j = j/i;
        }
        catch(Exception e){
            System.out.println("something went wrong...");
        }

        System.out.println("program still running");
    }
}
