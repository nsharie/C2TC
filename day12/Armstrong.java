package day12;
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int power = num.lenght();
        int res;
        int sep;
        int sum =0;
        for(int i=1;i<=power;i++){
            sep = num%10;
            res = Math.pow(sep,power);
            sum = sum+res;
            num = num/10;
        }
        System.out.println(sum);
    }

}