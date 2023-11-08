package class_test_Tuesday.class5_30.test1;

import java.util.Random;

public class Dice {
    private int Face;
    static Random rnd = new Random();
    public int getFace() {
        return Face;
    }

    public void roll() {
        Face = rnd.nextInt(6)+1;
    }
}
