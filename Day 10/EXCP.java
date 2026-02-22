public class EXCP {
    public static void main(String[] args){
        try {
            //code that might throw an exception
            int[] n = new int[5];
            int divisor = 0;

            for(int i; i<n.length; i++){
                int res = n[i]/divisor;
                System.out.println(res);
            }
            
        } catch (ArithmeticException e) {
            throw new RuntimeException("Division by zero occurred",e);
        }
    }
}
