package day12;

public class RevereseDigit {
    public static void main(String[] args){
        int num = 123;
        int digit;
        int rev=0;
        while(num>0){
            digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        System.out.println(rev);
    }
}
