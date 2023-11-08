package class_test_Tuesday.class5_30.test2;

public class CellPhoneTest {
    public static void main(String[] args){
        CellPhone phone1 = new CellPhone();
        phone1.setMake_company("Nexus One");
        phone1.setMake_company("HTC");
        phone1.setColor("Black");
        phone1.setCamera(true);
        System.out.println(phone1.toString());
        phone1.setPowerOn();
        phone1.setPowerOff();

    }
}
