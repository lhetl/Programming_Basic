package class_test_Tuesday.class4_18;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        final int plusinteger=3;
        int max=sc.nextInt();
        if(max/plusinteger==0){
            System.out.print("0부터 "+max+"까지의 수 중 "+plusinteger+"의 배수는 없습니다");
            System.exit(0);
        }
        for (int i=plusinteger; i<=max; i+=plusinteger){

            System.out.println("["+i+"]");
        }
        sc.close();
    }





}
