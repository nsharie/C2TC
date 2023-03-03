package day6;

public class CodeFour {
    public static void main(String args[]){
        int a = 10; // here convertion of primitive data type to wrapper class
        Integer i = a; // convertion of primitive to Wrapper class is known as autoboxing
        System.out.println(i);
        System.out.println(Integer.TYPE);

        Integer n = 20;
        int b = n;
        System.out.println(n);
    }    
}