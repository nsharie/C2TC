package day6;

interface WorldBank{
    float rateOfInterest();
}

interface RBI{
    float RBI_rateofInterest();
    default void Result(){
        System.out.println("twenty");
    }
}

public class PaymentApplication implements WorldBank,RBI {

    public float rateOfInterest(){
        return 9.0f;
    }

    public float RBI_rateofInterest(){
        return 9.1f;
    }

    public static void main(String[] args) {
        PaymentApplication p1 = new PaymentApplication();
        p1.Result();
        float a = p1.RBI_rateofInterest();
        float b = p1.rateOfInterest();
        System.out.println(a);
        System.out.println(b);
    }   
}
