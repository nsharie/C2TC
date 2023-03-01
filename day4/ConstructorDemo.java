package day4;

import java.util.Scanner;

public class ConstructorDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name, city;
        int id;
        System.out.println("Enter Customer Id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name:");
        name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Customer City");
        city = sc.nextLine();
        System.out.println(" ");
        //sc.close();
        
        Customer c1 = new Customer(); //default constructor invoked
        c1.setCustomerName(name);
        c1.setCustomerid(id);
        c1.setCustomerCity(city);

        System.out.println(c1);

        System.out.println("Enter Customer Id: ");
        id=sc.nextInt();
        
        sc.nextLine();

        System.out.println("Enter Customer Name: ");
        name = sc.nextLine();

        sc.nextLine();

        System.out.println(" Enter Customer City");
        city = sc.nextLine();

        Customer c2 = new Customer(name,id,city);
        System.out.println(c2);
        sc.close();   
    }
}   
