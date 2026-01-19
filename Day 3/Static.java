class Counter{
    static int count = 0;

    Counter(){
        count++; //increment static variable
        System.out.println("Object created, current count: " + count);
    }
}

public class Static{
    public static void main(String[] args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        System.out.println("final count: " + Counter.count);  //Access using class name
    }
}