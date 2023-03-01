package day4;

abstract class laptop{
    abstract void price();
    abstract void weight();
    abstract void speed();
    abstract void cost();
    abstract void display();
}

class dell extends laptop{
    void price(){
        System.out.println("The price is 68000");
    }

    void weight(){
        System.out.println("The weight is 1.5kg");
    }
    void speed(){
        System.out.println("The speed is 2.4ghz");
    }
    void cost(){
        System.out.println("The cost is 68000");
    }
    void display(){
        System.out.println("The display has 60hz refresh rate");
    }

}
public class abstarct {
    public static void main(String args[]){
        laptop dell_1 = new dell();
        dell_1.cost();
        dell_1.price();
        dell_1.speed();
        dell_1.weight();
        dell_1.display();

    }
 
    
}
