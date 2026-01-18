//Qn6.2: String reversal without using predefined function
class StringReverseManual {
    public static void main(String[] args) {
        String str = "Java Programming";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
