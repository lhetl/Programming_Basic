package class_test_Tuesday.class6_13.test4;

public class Rectangle {
    private double width;
    private double height;
    private Point point;
    public static int rectCount = 0;

    public Rectangle() {
        this(null, 0, 0);
    }

    public Rectangle(Point point, double width, double height) {
        this.point = point;
        this.width = width;
        this.height = height;
        rectCount++;
    }

    public Rectangle(double width, double height) {
        this(null, width, height);
    }

    public double area() {
        return this.height * this.width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
