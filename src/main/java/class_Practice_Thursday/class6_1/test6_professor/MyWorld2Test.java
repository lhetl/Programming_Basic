package class_Practice_Thursday.class6_1.test6_professor;

import class_Practice_Thursday.class6_1.test6.MyWorld;

import java.util.Scanner;

public class MyWorld2Test {
    public static void main(String[] args) {
        MyWorld2[] p = new MyWorld2[4];
        String[] n=new String[] {"Lee","Kim","Kang","Song"};
        for(int i=0;i<p.length;i++){
            p[i]=new MyWorld2(n[i]);
        }
        for (int i = 0; i <p.length; i++) {
            p[i].print();
        }
        String tmp;
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<p.length;i++){
            System.out.println(p[i].getName()+"의 배프를 입력하세요 :");
            tmp=sc.next();
            for(int j=0;j<n.length;j++){
                if(tmp.equals(n[j])){
                    p[j].incLovePoint();
                    p[i].setBestFriend(p[j]);
                    break;
                }
            }
        }
        for (int i = 0; i <p.length; i++) {
            p[i].print();
        }
        sc.close();
    }
}
