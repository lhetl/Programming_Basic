package class_Practice_Thursday.class6_1.test5;

public class SMSTest {
    public static void main(String[] args) {
        SMS m1 = new SMS("010-555-2111","010-555-1111","Hi","03:10"), m2 = new SMS("010-555-1111","010-555-2111");
        m2.setTime("03:11");
        m2.setMsgtext("Hm..");
        m1.print();
        System.out.println("============================");
        m2.print();
    }
}


