package class_Practice_Thursday.class5_18.practice3;

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(), c2 = new Complex();
        c1.add(c2);
        c1.toString();
        c2.subtract(c1);
        c2.toString();
    }
}
