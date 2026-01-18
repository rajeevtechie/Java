public class Reverse{
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args){
        //WAP to reverse a string.
        String str = "Hello";
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println(reverse(str)); 

    //WAP to store your name using an array
        char name[] = {'R','a','j','e','e','v'};
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    //Reverse the above name using array.
        System.out.println("\n");
        for(int i=name.length-1; i>=0; i--){
            System.out.println(name[i]);
        }
    }
}