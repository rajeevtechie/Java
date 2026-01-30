class Test{
    void modifyValue(int x){
        x = x + 10;
    }
}

public static void main(String[] args){
    int a = 5;
    Test obj = new Test();
    obj.modifyValue(a);
    System.out.println(a);
}