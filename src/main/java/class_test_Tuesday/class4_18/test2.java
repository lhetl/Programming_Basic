package class_test_Tuesday.class4_18;

public class test2 {
    public static void main(String[] args) {

        int cnt=0;
        final int max=100;
        for(int i=1;i<=max;i++){
            for(int j=1;j<=max;j++){
                for(int k=1;k<=max;k++){
                    if ((i * i) == ((j * j) + (k * k))) {
                        System.out.println(i + " : " + j + " : " + k);
                        cnt++;
                    }
                }
            }
        }
        System.out.println("총"+ cnt+"개");
    }
}
