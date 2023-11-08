package class_test_Tuesday.class6_13.test1;

public class Employee {
    private String name;
    private String phoneNumber;
    private double salary;

    public Employee(String name, String phoneNumber, double salary) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this(name,"",salary);

    }
    public Employee(String name){
        this(name,"",0);
    }
    public Employee(){
        this("","",0);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "이름 : "+this.name
                +", 전화번호 : "+this.phoneNumber
                +", 연봉 : "+(String.format("%.0f",this.salary))+"원";
    }
}
