package class_Practice_Thursday.class6_1.test2;

public class BoxTest {
    public static void main(String[] args) {
        double vb1,vb2,vb3;
        Box b1 = new Box(3.5,4.4,5.0, false), b2 = new Box(), b3 = new Box();

        b3.setHeight(4.0);
        b3.setLength(5.0);
        b3.setWidth(2.4);
        vb1=b1.getVolume();
        vb2=b2.getVolume();
        vb3=b3.getVolume();
        System.out.println("===========================================");
        System.out.println("박스1 부피: "+vb1);
        System.out.println("박스2 부피: "+vb2);
        System.out.println("박스3 부피: "+vb3);
        System.out.println("===========================================");
        if(vb1>vb2){
            if(vb1>vb3) System.out.println("박스1의 부피가 가장 큽니다: "+vb1);
            else System.out.println("박스3의 부피가 가장 큽니다: "+vb3);
        }else {
            if (vb2 > vb3) System.out.println("박스2의 부피가 가장 큽니다: " + vb2);
            else System.out.println("박스3의 부피가 가장 큽니다: " + vb3);
        }
        // main 메소드 나머지 부분 완성
    }
}

