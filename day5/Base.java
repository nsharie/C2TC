package day5;

public class Base {
    //Declaring default, public, private & protected
    int varDefault = 10;
    public int varPublic = 20;
    private int varPrivate = 30;
    protected int varProtected = 40;

    // methods declaring with access modifier
    void methodDefault(){
        System.out.println("Default access base class");
        System.out.println("Default variable: "+ varDefault);
    }

    public void methodPublic(){
        System.out.println("Public access base class");
        System.out.println("Public variable: "+ varPublic);
    }

    private void methodPrivate(){
        System.out.println("Private access base class");
        System.out.println("Private variable: "+ varPrivate);
    }

    protected void methodProtected(){
        System.out.println("Protected access base class");
        System.out.println("Protected variable: "+ varProtected);
    }
}
