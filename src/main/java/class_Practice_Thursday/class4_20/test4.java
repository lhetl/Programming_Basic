package class_Practice_Thursday.class4_20;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int[] vectorx=new int[3];
        int[] vectory=new int[3];
        int cnt=0;
        System.out.println("벡터 x :");
        for(int i=0;i<3;i++){
            vectorx[i]=sc.nextInt();
        }
        System.out.println("벡터 y :");
        for(int i=0;i<3;i++){
            vectory[i]=sc.nextInt();
        }
        System.out.print("벡터 x,y의 내적은");
        for(int i=0;i<3;i++){
            cnt+=vectorx[i]*vectory[i];
        }
        System.out.println(cnt+" 입니다");
    }
}
