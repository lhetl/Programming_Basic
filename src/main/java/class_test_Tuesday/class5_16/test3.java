package class_test_Tuesday.class5_16;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("문장을 입력하세요 :");
        String ans = sc.nextLine();
        String findStr;
        do {
            System.out.print("찾을 문자열을 입력하세요: ");
            findStr = sc.nextLine();
            if(!ans.contains(findStr)){
                System.out.println("해당 문자열이 문장 안에 없습니다");
            }
        }while(!ans.contains(findStr));
        System.out.print("바꿀 문자열을 입력하세요: ");
        String ChangeStr = sc.nextLine();
        ans=ans.replaceAll(findStr,ChangeStr);
        System.out.println(ans);
        sc.close();
    }
}
