abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("this animal eats food.");
    }
}

class dog extends animal{
    @Override
    void sound(){ 
        System.out.println("Dog barks.");
    }
}

public class abstractmethodexample{
    public static void main(String[] args) {
        animal Animal = new dog();
        Animal.sound();
        Animal.eat();
    }
}