package class_test_Tuesday.class5_23.test1;

public class main {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setName("홍길동");
        employee.setAge(20);
        employee.setSalary(3000000);
        employee.setYears(1);
        System.out.println("이름:"+employee.getName());
        System.out.println("나이:"+employee.getAge());
        System.out.println("월급:"+employee.getSalary());
        System.out.println("경력:"+employee.getYears());
    }
}
