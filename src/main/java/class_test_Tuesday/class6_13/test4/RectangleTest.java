package class_test_Tuesday.class6_13.test4;

public class RectangleTest {
    public static void main(String[] args)
    {
        //create first rectangle object
        Rectangle firstRect =new Rectangle(5, 6);
        System.out.println("Area of Rectangle 1 : "+firstRect.area());
        //create second rectangle object
        Rectangle secondRect =new Rectangle();
        System.out.println("Area of Rectangle 2 : "+secondRect.area());
        //create third rectangle object
        Rectangle thirdRect =new Rectangle(new Point(3,3), 5, 6);
        System.out.println("Area of Rectangle 3 : "+thirdRect.area());
        // access static field of rectangle class
        System.out.println("Total Number of Objects : "+ Rectangle.rectCount);
    }

}
