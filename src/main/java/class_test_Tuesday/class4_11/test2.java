package class_test_Tuesday.class4_11;

public class test2 {
    public static void main(String[] args) {

        int i = 1, j = 1, k = 1,cnt=0;
        final int max=100;
        while (i <= max) {
            j=1;
            while (j<=max) {
                k=1;
                while (k <= max) {
                    if ((i * i) == ((j * j) + (k * k))) {
                        System.out.println(i + " : " + j + " : " + k);
                        cnt++;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        System.out.println("총"+ cnt+"개");
    }
}
