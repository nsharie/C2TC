package day9;

public class VariableDemo {

    int s = 45; //instance variable (outside of main class, we are taking instance of this vatiable to access it)

    static int b = 55; //static variablw which required static keyword(global variable)

    public static void main(String[] args) {
        VariableDemo N1 = new VariableDemo();        //object has to be created to access instance variable
        int r =23; // local variable
        System.out.println(r);
        System.out.println(b);
        System.out.println(N1.s);
    }
}
