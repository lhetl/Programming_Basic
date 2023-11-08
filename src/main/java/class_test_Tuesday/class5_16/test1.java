package class_test_Tuesday.class5_16;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("영문 문자열을 입력하세요: ");
        String ans = sc.nextLine();
        sc.close();
        String[] strList = ans.split(" ");
        for(int i= strList.length;i>0;i--){
            System.out.print(strList[i-1]+" ");
        }
    }
}
