package class_test_Tuesday.class5_23.test3;

public class main {
    public static void main(String[] args){
        Television tv = new Television();
        tv.turnOn();
        tv.setVolume(10);
        tv.setChannel(55);
        System.out.println(tv.toString());
        tv.turnOff();
        tv.setVolume(20);
        tv.setChannel(35);
        System.out.println(tv.toString());
    }
}
