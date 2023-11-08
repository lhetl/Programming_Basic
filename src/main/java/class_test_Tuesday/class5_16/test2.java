package class_test_Tuesday.class5_16;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 (성 이름) :");
        String ans = sc.nextLine().toLowerCase();
        sc.close();
        String[] strList = ans.split(" ");
        for(int i= 1;i< strList.length;i++){
            System.out.print(strList[i]+" ");
        }
        System.out.print(strList[0]);
    }
}
