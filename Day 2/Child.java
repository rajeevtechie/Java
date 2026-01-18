//Qn4: Program demonstrating inheritance(chile class inherits parent class)
class Parent {
    void showParent() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showParent(); // inherited method
        obj.showChild();
    }
}
