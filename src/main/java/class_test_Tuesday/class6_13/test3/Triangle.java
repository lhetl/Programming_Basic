package class_test_Tuesday.class6_13.test3;

public class Triangle {
    private double width;
    private double height;

    public Triangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    public Triangle(){
        this(0,0);
    }


    public double getWeight() {
        return width;
    }

    public void setWeight(double weight) {
        this.width = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String toString() {
        return "삼각형의 밑변 : " + this.width +
                "\n삼각형의 높이 : " + this.height +
                "\n삼각형의 넓이 : "+this.getArea();
    }

    public double getArea(){
        return this.height*this.width/2;
    }
}
