package class_test_Tuesday.class5_30.test3;

public class Triangle {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public String toString() {
        return "삼각형의 밑변" + weight +
                "\n삼각형의 높이" + height +
                "\n삼각형의넓이"+this.getArea();
    }

    public double getArea(){
        return this.height*this.weight/2;
    }
}
