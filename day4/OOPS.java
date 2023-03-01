package day4;
abstract class NewOne{
    void method(){};
}
class newone1 extends NewOne{
    void method(){
        System.out.println("hello world");
    }
}
public class OOPS {
    public static void main(String args[]){
        NewOne n1 = new newone1();
        n1.method();
    }
}
//abstract - !hide -essential data
//         - hide - non essential data
