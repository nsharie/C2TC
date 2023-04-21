package day12;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int count = 0;
        isPrime p = new isPrime();
        System.out.println("The prime numbers are");
        for(int i = a;i<=b;i++){
            boolean res = p.Prime(i);
            if(res == true){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The count of numbers are");
        System.out.println(count);
    }
    
}
