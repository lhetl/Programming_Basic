package class_test_Tuesday.class5_2;

import java.util.Scanner;

public class test4_branch {
    public static void main(String[] args){
        final int MaxLen=30;
        double[] x = new double[MaxLen];
        int cnt=0;
        char cont='y';
        Scanner sc = new Scanner (System.in);
        while( cont =='y'){
            System.out.print("값? ");
            x[cnt]=sc.nextDouble();
            cnt++;
            System.out.print("계속 (y or n) ?");
            cont=sc.next().charAt(0);
        }
        double sum=0.0;
        for(int i=0;i<cnt;i++){
            sum+=x[i];
        }
        double m=sum/cnt;
        sum=0;
        for(int i=0;i<cnt;i++){
            sum+=Math.pow(x[i]-m,2);
        }
        double s=Math.sqrt(sum/cnt);
        System.out.println("평균:"+m+"표준편차:"+s);
    }
}
