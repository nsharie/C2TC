package day12;

import java.util.Scanner;

public class NewOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int count =0;
        while(true){
            if(i%3==0 || i%5==0 || i%7==0){
                System.out.print(" "+i);
                count++;
            }
            if(count == a){
                break;
            }
            i++;
        }
        sc.close();
    }
}
