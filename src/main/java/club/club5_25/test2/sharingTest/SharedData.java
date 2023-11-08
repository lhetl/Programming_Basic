package club.club5_25.test2.sharingTest;

public class SharedData {
    private static int sharedVariable;

    public static int getSharedVariable() {
        return sharedVariable;
    }

    public static void setSharedVariable(int value) {
        sharedVariable = value;
    }
}