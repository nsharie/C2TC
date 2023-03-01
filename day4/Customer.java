package day4;

public class Customer {
    private String customerName;
    private int customerid;
    private String customerCity;

    //default constructor
    public Customer(){
        System.out.println("Default Constructor");
    }

    //parameterised constructor
    public Customer (String customerName, int customerid, String customerCity){
        this();
        System.out.println("parameterized Constructor");
        this.customerName = customerName;
        this.customerid = customerid;
        this.customerCity = customerCity;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerid=" + customerid + ", customerCity="
                + customerCity + "]";
    }
}
