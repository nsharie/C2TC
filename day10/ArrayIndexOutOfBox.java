package day10;

public class ArrayIndexOutOfBox {
    public static void main(String[] args) {
        int [] arr = new int[4];

        System.out.println("Welcome to B45 batch");
        try{
            int i = arr[3];
            int a = 50/0;
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Array out of bound");
        } 
        finally{
            System.out.println("Whatever haapperns this will be executed");
        }
        //System.out.println("next line to be execute");
    }
}
