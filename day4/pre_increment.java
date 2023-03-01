package day4;

public class pre_increment {
    public static void main(String args[]){
        int a = 10;
        int b =20;
        int x =10;
        System.out.println("a and b value before the operation: "+a+" "+b);
        ++a;
        int c = ++a + b + a--;// here this a decrement happens after printing the value because it is post decrement
        System.out.println("c value after the operation: "+c);
        int d = c++ + a + b--;//here this a decrement happens after printing the value because it is post decrement
        System.out.println("d value after the operation: "+d);
        System.out.println("a,b,c,d values after the operation: "+a+" "+b+" "+c+" "+d);
        //ternary operator demo
        x =(10==x) ? 1:0;
        System.out.println(x);
    }
    
}
