package class_Practice_Thursday.class5_25.test1;

public class CircleTest2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();

        Circle2.Point2 p1 = c1.new Point2();
        p1.setX(3); p1.setY(5);
        c1.setCenter(p1); c1.setRadius(7);
        System.out.println(c1.toString());
        Circle2.Point2 p2 = c1.new Point2();
        p2.setX(8); p2.setY(8);
        c1.move(p2); c1.resize(4);
        System.out.println(c1.toString());
    }

}
