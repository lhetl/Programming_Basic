package class_Practice_Thursday.class6_1.test2;

public class Box {
    private double width,height,length;
    private boolean isEmpty;

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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }


    public double getVolume(){
        return this.width*this.height*this.length;
    }
    public Box(double width, double height, double length, boolean isEmpty) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.isEmpty = isEmpty;
    }
    public Box(){
        this(0,0,0,true);
    }
}
