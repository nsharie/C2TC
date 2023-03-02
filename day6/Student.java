package day6;

public class Student extends Citizen{
    private int rollNo;
    private String collageName;    

    public Student(){
        super();
    }

    public Student(String name, String aadharNo, String address, long phno, int rollNo, String collageName){
        super(name, aadharNo, address, phno); //accessing parent class
        this.rollNo = rollNo;
        this.collageName = collageName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + getRollNo() + ", collageName=" + getCollageName() + "Name=" + getName() +"Aadhar="+ getAadharNo()+ "Address=" + getAddress()+ "Phone=" + getPhno()+ "]";
   }
}
