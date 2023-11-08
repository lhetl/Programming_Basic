package class_test_Tuesday.class5_30.test4;

public class RectangleTest {
    public static void main(String[] args) {
        Point p1 = new Point(); p1.setX(10); p1.setY(10);
        Point p2 = new Point(); p2.setX(3); p2.setY(7);
        Rectangle r1 = new Rectangle(); r1.setStartPoint(p1); r1.setWidth(5); r1.setHeight(5);
        Rectangle r2 = new Rectangle(); r2.setStartPoint(p2); r2.setWidth(6); r2.setHeight(4);

        if (r1.getArea() > r2.getArea()) System.out.println("첫 번째 사각형 면적이 더 넓습니다.");
        else System.out.println("두 번째 사각형 면적이 더 넓습니다.");

        Rectangle inter = r1.intersect(r2);
        if (inter == null) System.out.println("겹치는 영역이 없습니다.");
        else System.out.println("(" + inter.getX() + ", " + inter.getY() + ") 에서 너비 " + inter.getWidth() + ", 높이 " + inter.getHeight() + " 만큼 겹칩니다.");

    }

}
