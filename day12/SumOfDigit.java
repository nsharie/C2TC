package day12;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum=0;
        int digit;
        //int n = 12;
        int quotient;
        
        while(n>0){
            digit = n%10;
            sum+=digit;
            quotient = n/10;
            n = quotient;
        }
        System.out.println(sum);
    }
    
}
