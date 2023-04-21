package day10;

public class MultipleExceptionDemo {
    public static void main(String[] args) {
        int [] arr = new int[4];
        try{
            arr[19] = 50/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("error");
        }
    }
}
