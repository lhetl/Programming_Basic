package class_Practice_Thursday.class5_25.test1;

public class Circle2 {
    private Point2 Center= new Point2();
    private double Radius;

    public Point2 getCenter() {
        return Center;
    }

    public void setCenter(Point2 center) {
        Center = center;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public void move(Point2 newPos){
        setCenter(newPos);
    }
    public void resize(int newRadius){
        setRadius(newRadius);
    }
    public Double getArea(){
        return Radius*Radius*Math.PI;
    }

    public String toString() {
        return " 중심: " + Center.getX() + ",  "+Center.getY()+ "  반지름: " + Radius;
    }

    public class Point2{
        private double x,y;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}

