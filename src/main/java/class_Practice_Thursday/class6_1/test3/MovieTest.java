package class_Practice_Thursday.class6_1.test3;

public class MovieTest {
    public static void main(String[] args) {
        double p1,p2,p3;
        Movie m1 = new Movie("아저씨","이정범",9.28), m2 = new Movie("슈퍼배드","피에르 꼬팽",8.96), m3 = new Movie();

        m3.setName("무적자");
        m3.setDirector("송해성");
        m3.setPoint(6.08);

        p1=m1.getPoint();
        p2=m2.getPoint();
        p3=m3.getPoint();
        System.out.println("===========================================");
        m1.print();
        m2.print();
        m3.print();
        System.out.println("===========================================");
        String mostHigh;
        if(p1>p2){
            if(p1>p3) mostHigh=m1.getName();
            else mostHigh=m3.getName();
        }else {
            if (p2 > p3) mostHigh=m2.getName();
            else mostHigh=m3.getName();
        }
        System.out.println("가장 평점이 높은 영화:"+mostHigh);
        // main 메소드 나머지 부분 완성


    }
}

