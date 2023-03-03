package day6;

abstract class Hello{
    abstract void hello();
    abstract void world();
}

public class abstract1 extends Hello{

    void hello(){
        System.out.println("hello");
    }

    void world(){
        System.out.println("world");
    }
    public static void main(String args[]){
        abstract1 a1 = new abstract1();
        a1.hello();
        a1.world();
    }

}