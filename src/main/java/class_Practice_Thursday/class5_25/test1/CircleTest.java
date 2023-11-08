package class_Practice_Thursday.class5_25.test1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        Point p1 = new Point();
        p1.setX(3); p1.setY(5);
        c1.setCenter(p1); c1.setRadius(7);
        System.out.println(c1.toString());
        Point p2 = new Point();
        p2.setX(8); p2.setY(8);
        c1.move(p2); c1.resize(4);
        System.out.println(c1.toString());
    }

}
