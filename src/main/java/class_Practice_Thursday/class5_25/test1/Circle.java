package class_Practice_Thursday.class5_25.test1;

import class_Practice_Thursday.class5_25.test1.Point;
public class Circle {
    private Point Center= new Point();
    private double Radius;

    public Point getCenter() {
        return Center;
    }

    public void setCenter(Point center) {
        Center = center;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public void move(Point newPos){
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

}

