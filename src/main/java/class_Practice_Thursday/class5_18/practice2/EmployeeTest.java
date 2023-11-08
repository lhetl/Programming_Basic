package class_Practice_Thursday.class5_18.practice2;

public class EmployeeTest {
    public static void main(String[] args){
        Employee fir = new Employee();
        fir.setName("김김김");
        fir.setTelephone("010-1234-5667");
        fir.setSalary(400000);
        System.out.println("이름: "+fir.getName());
        System.out.println("전화번호: "+fir.getTelephone());
        System.out.println("연봉: "+fir.getSalary());
    }
}
