package day5;

public class Executor {
    public static void main(String args[]){
        Base obj = new Base();  // object of Base class
        obj.methodDefault();
        obj.methodPublic();
        obj.methodProtected();

        obj.varDefault = 11;
        obj.methodDefault();

        obj.varProtected = 31;
        obj.methodProtected();

        obj.varPublic = 41;
        obj.methodPublic();

        //instance operator used to check whether the object is instance of class or not
        //output returned in boolean form
        System.out.println(obj instanceof Base);
    }
    
}
