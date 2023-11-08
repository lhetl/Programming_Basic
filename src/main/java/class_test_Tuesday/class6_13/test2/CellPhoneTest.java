package class_test_Tuesday.class6_13.test2;

public class CellPhoneTest {
    public static void main(String[] args){
        CellPhone phone1 = new CellPhone("Nexus One","HTC","Black",true);
        System.out.println(phone1.toString());
        phone1.setPowerOn();
        phone1.setPowerOff();

    }
}
