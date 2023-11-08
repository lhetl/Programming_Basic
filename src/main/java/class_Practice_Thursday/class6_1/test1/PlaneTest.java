package class_Practice_Thursday.class6_1.test1;

public class PlaneTest {
    public static void main(String[] args) {
        Plane p1 = new Plane(),p2 = new Plane(1),p3 = new Plane(2,"B-747"),p4 = new Plane(3,"A-330",80);
        p1.setModel("A-380");
        p1.setPassengers(60);
        p2.setModel("B-787");
        p2.setPassengers(120);
        p3.setPassengers(140);
        p1.print();
        p2.print();
        p3.print();
        p4.print();
    }
}

