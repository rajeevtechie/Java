//Qn6.1: String reversal using predefined function
class StringReversePredefined {
    public static void main(String[] args) {
        String str = "Java Programming";

        String reversed = new StringBuffer(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
