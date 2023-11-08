package class_Practice_Thursday.class5_11;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        String sen1, sen2, sen3;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        sen1 = sc.nextLine();
        sc.close();
        sen1 = sen1.replaceAll(" ", "");
        StringBuffer sb = new StringBuffer(sen1);
        sen2 = sb.reverse().toString();
        if (sen2.compareTo(sen1) == 0) {
            System.out.println("회문입니다");
        } else {
            System.out.println("회문이 아닙니다");
        }
    }
}
/*
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        str1=sc.nextLine();
        str2= str1.toLowerCase();
        str2=str1.replace(" ","");
        char[] strArray=str2.toCharArray();
        boolean isPanlindrome = true;
        for(int i=0;i<strArray.length;i++){
            if(strArray[i]==){
                isPanlindrome=false;
                break;
            }
        }
*/
