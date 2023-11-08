package club.club5_25.test2.sharingTest;

import java.util.Random;

public class Professor {

    public void updateData() {
        Random rnd = new Random();
        SharedData.setSharedVariable(rnd.nextInt(100));
    }
}
