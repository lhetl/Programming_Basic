package class_test_Tuesday.class5_2;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        int[] lastdays=new int[] {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("원하는 달을 입력하세요 :");
        Scanner sc = new Scanner (System.in);
        int ans = sc.nextInt();
        if (ans >= 1 && ans <=12){
            System.out.println(ans+"월은 "+lastdays[ans-1]+"일까지 있습니다.");
        }else{
            System.out.println("잘못된 값을 입력했습니다");
        }
        sc.close();
    }
}
