package class_test_Tuesday.class4_11;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int max = sc.nextInt();
        final int plusinteger=3;
        int i=plusinteger;
        if(max/plusinteger==0){
            System.out.print(max+"까지의 수 중 "+plusinteger+"의 배수는 없습니다");
        }
        while(i<=max){
            System.out.println("["+i+"]");
            i+=plusinteger;
        }
    }





}
