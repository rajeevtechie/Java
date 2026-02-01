public class calculator {
   static int sum(int a,int b){
        return a+b;
    }

    static int difference(int a, int b){
        return a-b;
    }

    static int product(int a, int b){
        return a*b;
    }

    static int division(int a, int b){
        return a/b;
    }
  public static void main(String[] args) {
    
    System.out.println(sum(2,5));
    System.out.println(difference(2, 5));
    System.out.println(product(2,5));
    System.out.println(division(2,5));
  }
}

