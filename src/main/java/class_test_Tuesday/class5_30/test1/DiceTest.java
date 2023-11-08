package class_test_Tuesday.class5_30.test1;

public class DiceTest {
    public static void main(String[] args) {
        Dice D1 = new Dice();

        for(int i = 0; i < 10; i++){
            D1.roll();
            System.out.println("주사위의 숫자는 " + D1.getFace() + "입니다.");
        }
    }

}
